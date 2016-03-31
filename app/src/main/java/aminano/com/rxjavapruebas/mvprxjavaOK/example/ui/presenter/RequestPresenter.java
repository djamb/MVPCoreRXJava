package aminano.com.rxjavapruebas.mvprxjavaOK.example.ui.presenter;

import aminano.com.rxjavapruebas.mvprxjavaOK.core.rxjava.RxPresenterInterface;
import aminano.com.rxjavapruebas.mvprxjavaOK.example.ui.view.MainViewInterface;

/**
 * @author Antonio Miñano
 */
public abstract class RequestPresenter extends RxPresenterInterface<MainViewInterface> {
  public abstract void doActionGetFromApi();

  public abstract void doTransformToObservable(String sessionId);

}
