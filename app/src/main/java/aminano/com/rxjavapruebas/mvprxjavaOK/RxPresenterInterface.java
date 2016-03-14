package aminano.com.rxjavapruebas.mvprxjavaOK;

import aminano.com.rxjavapruebas.api.model.Image;
import aminano.com.rxjavapruebas.mvprxjavaOK.retrofit.Post;
import aminano.com.rxjavapruebas.mvprxjavaOK.retrofit.SuperObject;
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
public abstract class RxPresenterInterface<T  extends Observable<SuperObject>> {
  public MainViewInterface mainView;



  public  Object objecta;
  private CompositeSubscription compositeSubscription;

  public RxPresenterInterface(MainViewInterface mainView) {
    this.mainView = mainView;
  }

  public void Subscriber(Object object, final int elegir) {
    compositeSubscription = new CompositeSubscription();
    compositeSubscription.add(((T)((InteractorInterface) object).action()).subscribeOn(Schedulers.newThread())
        .observeOn(AndroidSchedulers.mainThread())
        .subscribe(
            // On Next
            new Action1<Object>() {
              @Override
              public void call(final Object userName) {

                setObjecta(userName);
                actionExecuteMainMethod(elegir);
                mainView.disableLoading();
              }
            },
            // On Error
            new Action1<Throwable>() {
              @Override
              public void call(Throwable throwable) {
                Log.e("error", throwable.getMessage(), throwable);
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

  public Object getObjecta() {
    return objecta;
  }

  public void setObjecta(Object objecta) {
    this.objecta = objecta;
  }

   abstract void actionExecuteMainMethod(final int elegir);
}
