package aminano.com.rxjavapruebas.mvprxjavaOK;

import aminano.com.rxjavapruebas.mvprxjavaOK.core.InteractorInterface;
import aminano.com.rxjavapruebas.mvprxjavaOK.retrofit.model.Comment;
import rx.Observable;

/**
 * @author Antonio Miñano
 */
public class PruebaInteractor2 extends InteractorInterface {
  private Observable<Object> objectObservable;

  public Observable<Object> action() {
    Comment comment =new Comment();
    comment.setId(3);
    comment.setName("nombre2");
    setValue(comment);
    objectObservable = getObject();
    return objectObservable;
  }
}
