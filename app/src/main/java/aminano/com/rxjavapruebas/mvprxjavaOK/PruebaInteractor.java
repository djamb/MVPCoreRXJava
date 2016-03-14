package aminano.com.rxjavapruebas.mvprxjavaOK;

import aminano.com.rxjavapruebas.api.model.Image;
import aminano.com.rxjavapruebas.mvprxjavaOK.retrofit.ForumService;
import aminano.com.rxjavapruebas.mvprxjavaOK.retrofit.Post;
import aminano.com.rxjavapruebas.mvprxjavaOK.retrofit.SuperObject;
import android.util.Log;
import java.util.List;
import rx.Observable;
import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * @author Antonio Miñano
 */
public class PruebaInteractor<T  extends Observable> extends InteractorInterface{
  public T action() {
    ForumService forum=new ForumService();
    return (T)forum.getApi()
        .getPost(1);
  }
}
