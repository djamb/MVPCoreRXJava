package aminano.com.rxjavapruebas.mvprxjavaOK.core.base;

import aminano.com.rxjavapruebas.mvprxjavaOK.core.View;
import aminano.com.rxjavapruebas.mvprxjavaOK.core.rxjava.RxPresenterInterface;
import android.app.Activity;
import android.os.Bundle;
import butterknife.ButterKnife;

/**
 * @author adrian
 */
public abstract class CoreActivity extends Activity implements View {
  private RxPresenterInterface presenter;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    onBeforeCreate();
    super.onCreate(savedInstanceState);
    doInjection();
    presenter = bindPresenter();
    presenter.onCreate();
    setContentView(bindLayout());
    injectViews();
    presenter.setView(this);
    onViewReady();
    presenter.onViewReady();
  }

  private void doInjection() {
    CoreApplication ca = ((CoreApplication) getApplication());
    ca.inject(this);
  }

  public void onViewReady() {
    //empty
  }

  @Override
  protected void onPause() {
    super.onPause();
    presenter.onPause();
  }

  @Override
  protected void onResume() {
    super.onResume();
    presenter.onResume();
  }

  @Override
  protected void onDestroy() {
    super.onDestroy();
    presenter.onDestroy();
  }

  protected abstract void onBeforeCreate();

  public abstract int bindLayout();

  private void injectViews() {
    ButterKnife.inject(this);
  }

  public abstract RxPresenterInterface bindPresenter();
}
