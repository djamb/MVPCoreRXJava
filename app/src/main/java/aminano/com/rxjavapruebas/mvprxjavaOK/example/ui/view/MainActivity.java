package aminano.com.rxjavapruebas.mvprxjavaOK.example.ui.view;

import aminano.com.rxjavapruebas.mvprxjavaOK.R;
import aminano.com.rxjavapruebas.mvprxjavaOK.core.base.CoreActivity;
import aminano.com.rxjavapruebas.mvprxjavaOK.core.rxjava.RxPresenterInterface;
import aminano.com.rxjavapruebas.mvprxjavaOK.example.ui.presenter.RequestPresenter;
import android.util.Log;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import butterknife.InjectView;
import javax.inject.Inject;

public class MainActivity extends CoreActivity implements MainViewInterface {
  @Inject protected RequestPresenter requestPresenter;
  @InjectView(R.id.hello_world) protected TextView text1;
  @InjectView(R.id.asd) protected TextView text2;
  @InjectView(R.id.progress) protected ProgressBar progress;

  @Override
  protected void onBeforeCreate() {
  }

  @Override
  public void onViewReady() {
    requestPresenter.doActionGetFromApi();
    requestPresenter.doTransformToObservable("hola caracola");
  }

  @Override
  public int bindLayout() {
    return R.layout.activity_main;
  }

  @Override
  public RxPresenterInterface bindPresenter() {
    return requestPresenter;
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
    text1.setText("" + text);
    Log.e("", "settext" + text);
  }

  @Override
  public void writeSomething2(String text) {
    text2.setText(text);
    Log.e("", "settext2" + text);
  }
}
