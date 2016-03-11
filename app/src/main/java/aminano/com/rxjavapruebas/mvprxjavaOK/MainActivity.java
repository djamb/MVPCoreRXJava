package aminano.com.rxjavapruebas.mvprxjavaOK;


import aminano.com.rxjavapruebas.mvprxjavaOK.retrofit.ForumService;
import aminano.com.rxjavapruebas.mvprxjavaOK.retrofit.Post;
import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import java.util.List;
import rx.subscriptions.CompositeSubscription;

public class MainActivity extends Activity implements MainViewInterface {
  private RequestPresenterImp requestPresenterImp;
  private TextView imageViewphoto;
  private TextView imageViewphoto2;
  private PruebaInteractor pruebainteractor;
  ForumService mForumService;
  private PruebaInteractor2 pruebainteractor2;
  public final static String asds = "MainActivity";
  private CompositeSubscription compositeSubscription;
  ;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    mForumService = new ForumService();
    pruebainteractor = new PruebaInteractor();
    pruebainteractor2 = new PruebaInteractor2();
    requestPresenterImp = new RequestPresenterImp(this, pruebainteractor,pruebainteractor2,mForumService );
    imageViewphoto = (TextView) findViewById(R.id.hello_world);
    imageViewphoto2 = (TextView) findViewById(R.id.asd);
    requestPresenterImp.doActionStartSession();
    requestPresenterImp.doActionTakePicture("");
  }

  @Override
  public void enableLoading() {
    Log.e("", "enable loading");
  }

  @Override
  public void disableLoading() {
    Log.e("", "disable loading");
  }

  @Override
  public void writeSomething() {
    imageViewphoto.setText("hola");
    Log.e("", "settext");
  }
  @Override
  public void writeSomething2() {
    imageViewphoto2.setText("caca");
    Log.e("", "settext");
  }
  @Override
  public void displayPost(List<Post> post){
    Log.e("", ""+post.size());
  }
}
