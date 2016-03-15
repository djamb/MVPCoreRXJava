package aminano.com.rxjavapruebas.mvprxjavaOK;


import aminano.com.rxjavapruebas.mvprxjavaOK.core.InteractorInterface;
import aminano.com.rxjavapruebas.mvprxjavaOK.retrofit.ForumService;
import rx.Observable;

/**
 * @author Antonio Miñano
 */
public class PruebaInteractor<T  extends Observable> extends InteractorInterface {
  public T action() {
    ForumService forum=new ForumService();
    return (T)forum.getApi()
        .getPost(1);
  }
}
