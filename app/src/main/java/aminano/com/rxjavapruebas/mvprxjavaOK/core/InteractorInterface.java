package aminano.com.rxjavapruebas.mvprxjavaOK.core;

import rx.Observable;
import rx.Subscriber;

/**
 * @author Antonio Miñano
 */
public abstract class InteractorInterface<T extends Observable<Object>> {
  private Object value;
  public Observable<Object> getObject() {
    return Observable.create(new Observable.OnSubscribe<Object>() {
      @Override
      public void call(Subscriber<? super Object> subscriber) {
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

  public void setValue(Object value) {
    this.value = value;
  }

  public abstract T action();
}
