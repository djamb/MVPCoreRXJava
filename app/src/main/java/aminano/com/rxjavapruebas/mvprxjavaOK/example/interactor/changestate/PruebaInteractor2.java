package aminano.com.rxjavapruebas.mvprxjavaOK.example.interactor.changestate;

import aminano.com.rxjavapruebas.mvprxjavaOK.core.InteractorInterface;
import aminano.com.rxjavapruebas.mvprxjavaOK.example.retrofit.model.Comment;
import rx.Observable;

/**
 * @author Antonio Miñano
 */
//Ejemplo de transformacion de objecto a observable
public class PruebaInteractor2 extends InteractorInterface {

  @Override
  public Observable action(Object... objectsFromPresent) {
    Comment comment = new Comment();
    comment.setId(3);
    comment.setName((String) objectsFromPresent[0]);
    //convertimos a observable
    return convertToObservable(comment);
  }
}

