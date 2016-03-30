package aminano.com.rxjavapruebas.mvprxjavaOK.example.interactor.getid;

import aminano.com.rxjavapruebas.mvprxjavaOK.core.InteractorInterface;
import aminano.com.rxjavapruebas.mvprxjavaOK.example.retrofit.ForumService;
import rx.Observable;

/**
 * @author Antonio Miñano
 */
//Ejemplo de petición con retrofit
public class PruebaInteractor extends InteractorInterface {
  @Override
  public Observable action(Object... objectsFromPresent) {
    ForumService forum = new ForumService();
    return forum.getApi().getPost(1);
  }
}
