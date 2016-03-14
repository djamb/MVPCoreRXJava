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
  private Observable<SuperObject> objectObservable;

  //public Observable<T> action() {
  public T action() {
    Log.e("solucion asdasd","");
    Post post=new Post();
    post.setId(1111);
    SuperObject sp=(SuperObject)post;
    Log.e("solucion superobject", ""+((Post)sp).getId());
    ////Handler handlerTimer = new Handler();
    ////handlerTimer.postDelayed(new Runnable() {
    ////public void run() {
    //Image a = new Image();
    //a.setUrl("asd");
    //a.setHeight(12);
    //a.setWidth(200);
    //setValue(a);
    //objectObservable = getObject();
    ////}
    ////}, 2000);
    //return objectObservable;
    ForumService forum=new ForumService();
    return (T)forum.getApi()
        .getPost(1);
    //return forum.getApi()
    //    .getPost(1);

  }
}
