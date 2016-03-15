package aminano.com.rxjavapruebas.mvprxjavaOK.core;

import aminano.com.rxjavapruebas.mvprxjavaOK.MainViewInterface;
import android.util.Log;
import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action0;
import rx.functions.Action1;
import rx.schedulers.Schedulers;
import rx.subscriptions.CompositeSubscription;

/**
 * @author Antonio Miñano
 */
public abstract class RxPresenterInterface<T extends Observable<Object>> {
  protected MainViewInterface mainView;
  private Object object;
  private CompositeSubscription compositeSubscription;
  public RxPresenterInterface(MainViewInterface mainView) {
    this.mainView = mainView;
  }

  public void Subscriber(Object object, final int elegir) {
    compositeSubscription = new CompositeSubscription();
    compositeSubscription.add(
        ((T) ((InteractorInterface) object).action()).subscribeOn(Schedulers.newThread())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(
                // On Next
                new Action1<Object>() {
                  @Override
                  public void call(final Object userName) {
                    setObject(userName);
                    actionExecuteMainMethod(elegir);
                    mainView.disableLoading();
                  }
                },

                // On Error
                new Action1<Throwable>() {
                  @Override
                  public void call(Throwable throwable) {
                    Log.e("error", throwable.getMessage(), throwable);
                    mainView.disableLoading();
                  }
                },

                // On Complete
                new Action0() {
                  @Override
                  public void call() {
                    Log.e("", "ok");
                  }
                }));
  }

  public Object getObject() {
    return object;
  }

  public void setObject(Object object) {
    this.object = object;
  }

  public  abstract void actionExecuteMainMethod(final int elegir);
}
