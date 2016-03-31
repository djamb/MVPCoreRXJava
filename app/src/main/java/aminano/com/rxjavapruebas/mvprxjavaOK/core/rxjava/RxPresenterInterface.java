package aminano.com.rxjavapruebas.mvprxjavaOK.core.rxjava;

import aminano.com.rxjavapruebas.mvprxjavaOK.core.View;
import aminano.com.rxjavapruebas.mvprxjavaOK.core.presenter.CorePresenter;
import android.util.Log;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action0;
import rx.functions.Action1;
import rx.schedulers.Schedulers;
import rx.subscriptions.CompositeSubscription;

/**
 * @author Antonio Miñano
 */
public abstract class RxPresenterInterface<T extends View> extends CorePresenter<T> {
  private Object object;
  private CompositeSubscription compositeSubscription;

  public void Subscriber(Object object, final int elegir, final Object... objectsFromPresent) {
    compositeSubscription = new CompositeSubscription();
    compositeSubscription.add(
        (((InteractorInterface) object).action(objectsFromPresent)).subscribeOn(
            Schedulers.newThread()).observeOn(AndroidSchedulers.mainThread()).subscribe(
            // On Next
            new Action1<Object>() {
              @Override
              public void call(final Object userName) {
                setObject(userName);
                actionExecuteMainMethod(elegir);
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
                //Log.e("", "ok");

              }
            }));
  }

  public Object getObject() {
    return object;
  }

  public void setObject(Object object) {
    this.object = object;
  }

  //Acciones en la vista
  public abstract void actionExecuteMainMethod(final int elegir);

  public void onPause() {
    //Empty
  }

  public void onViewReady() {
    //Empty
  }

  public void onResume() {
    //Empty
  }

  public void onDestroy() {
    //Empty
  }
}
