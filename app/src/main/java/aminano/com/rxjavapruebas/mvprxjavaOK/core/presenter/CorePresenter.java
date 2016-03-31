package aminano.com.rxjavapruebas.mvprxjavaOK.core.presenter;

import aminano.com.rxjavapruebas.mvprxjavaOK.core.View;

/**
 * @author adrian
 */
public abstract class CorePresenter<T extends View> {

  protected T view;

  public void onCreate() {
    //Empty
  }

  public void onViewReady() {
    //Empty
  }

  public void setView(T view) {
    this.view = view;
  }

  public View getView() {
    return view;
  }
}
