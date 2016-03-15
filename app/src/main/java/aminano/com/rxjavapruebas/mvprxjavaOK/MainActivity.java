package aminano.com.rxjavapruebas.mvprxjavaOK;


import aminano.com.rxjavapruebas.mvprxjavaOK.retrofit.model.Post;
import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import java.util.List;

public class MainActivity extends Activity implements MainViewInterface {
  private RequestPresenterImp requestPresenterImp;
  private TextView text1;
  private TextView text2;
  private ProgressBar progress;
  private PruebaInteractor pruebainteractor;
  private PruebaInteractor2 pruebainteractor2;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    pruebainteractor = new PruebaInteractor();
    pruebainteractor2 = new PruebaInteractor2();
    requestPresenterImp = new RequestPresenterImp(this, pruebainteractor,pruebainteractor2);
    text1 = (TextView) findViewById(R.id.hello_world);
    text2 = (TextView) findViewById(R.id.asd);
    progress=(ProgressBar)findViewById(R.id.progress);
    requestPresenterImp.doActionStartSession();
    requestPresenterImp.doActionTakePicture("");
  }


  @Override
  public void enableLoading() {
    progress.setVisibility(View.VISIBLE);
  }

  @Override
  public void disableLoading() {
    progress.setVisibility(View.INVISIBLE);
  }

  @Override
  public void writeSomething(String text) {
    text1.setText(""+text);
    Log.e("", "settext");
  }
  @Override
  public void writeSomething2() {
    text2.setText("mundo");
    Log.e("", "settext2");
  }
  @Override
  public void displayPost(List<Post> post){
    Log.e("", ""+post.size());
  }
}
