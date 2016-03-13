package aminano.com.rxjavapruebas.mvprxjavaOK;

import aminano.com.rxjavapruebas.mvprxjavaOK.retrofit.SuperObject;
import rx.Observable;
import rx.Subscriber;

/**
 * @author Antonio Miñano
 */
public abstract class InteractorInterface {
  private SuperObject value;
  private Class clase;
  public Observable<SuperObject> getObject() {
    return Observable.create(new Observable.OnSubscribe<SuperObject>() {
      @Override
      public void call(Subscriber<? super SuperObject> subscriber) {
        try {
          subscriber.onNext(value); // Enviamos el dato
          subscriber.onCompleted();
        } catch (Exception ex) {
          subscriber.onError(ex); // Avisamos de un error
        }
      }
    });
  }

  public Object getValue() {
    return value;
  }

  public void setValue(SuperObject value) {
    this.value = value;
  }

  // Producer "extends"
  abstract Observable<? extends SuperObject> action();
}
