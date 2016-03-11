package aminano.com.rxjavapruebas.mvprxjavaOK;

import aminano.com.rxjavapruebas.api.model.Image;
import aminano.com.rxjavapruebas.mvprxjavaOK.retrofit.SuperObject;
import rx.Observable;

/**
 * @author Antonio Miñano
 */
public class PruebaInteractor3 extends InteractorInterface {
  private Observable<SuperObject> objectObservable;

  public Observable<SuperObject> action() {
    //Handler handlerTimer = new Handler();
    //handlerTimer.postDelayed(new Runnable() {
    //public void run() {
    Image a = new Image();
    a.setUrl("asd");
    a.setHeight(12);
    a.setWidth(200);
    setValue(a);
    objectObservable = getObject();
    //}
    //}, 2000);
    return objectObservable;
  }
}
