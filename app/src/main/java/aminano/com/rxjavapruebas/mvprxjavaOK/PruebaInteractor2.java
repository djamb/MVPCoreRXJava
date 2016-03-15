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
    comment.setId(1);
    comment.setName("esto1");
    Object b=(Object)comment;
    setValue((Object)comment);
    objectObservable = getObject();
    return objectObservable;
  }
}
