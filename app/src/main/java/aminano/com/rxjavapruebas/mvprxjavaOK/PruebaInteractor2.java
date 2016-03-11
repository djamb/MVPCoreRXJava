package aminano.com.rxjavapruebas.mvprxjavaOK;

import aminano.com.rxjavapruebas.api.model.Image;
import aminano.com.rxjavapruebas.mvprxjavaOK.InteractorInterface;
import aminano.com.rxjavapruebas.mvprxjavaOK.retrofit.SuperObject;
import rx.Observable;

/**
 * @author Antonio Miñano
 */
public class PruebaInteractor2 extends InteractorInterface {
  private Observable<SuperObject> objectObservable;

  public Observable<SuperObject> action() {

    //Thread thread = new Thread(new Runnable() {
    //  public void run() {
        Image a = new Image();
        a.setUrl("asdasdasdasd");
        a.setHeight(18);
        a.setWidth(2000000);
    SuperObject b=(SuperObject)a;
        setValue((SuperObject)a);
        objectObservable = getObject();

    //  }
    //});
    //thread.start();
    return objectObservable;
  }
}
