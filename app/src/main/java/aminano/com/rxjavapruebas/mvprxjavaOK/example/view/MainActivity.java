package aminano.com.rxjavapruebas.mvprxjavaOK.example.view;


import aminano.com.rxjavapruebas.mvprxjavaOK.R;
import aminano.com.rxjavapruebas.mvprxjavaOK.example.interactor.getid.PruebaInteractor;
import aminano.com.rxjavapruebas.mvprxjavaOK.example.interactor.changestate.PruebaInteractor2;
import aminano.com.rxjavapruebas.mvprxjavaOK.example.presenter.RequestPresenterImp;
import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;


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
    requestPresenterImp.doActionGetFromApi();
    requestPresenterImp.doTransformToObservable("hola caracola");
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
    Log.e("", "settext"+text);
  }
  @Override
  public void writeSomething2(String text) {
    text2.setText(text);
    Log.e("", "settext2"+text);
  }
}
