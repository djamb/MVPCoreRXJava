package aminano.com.rxjavapruebas.mvprxjavaOK.example.presenter;

import aminano.com.rxjavapruebas.mvprxjavaOK.core.RxPresenterInterface;
import aminano.com.rxjavapruebas.mvprxjavaOK.example.interactor.changestate.PruebaInteractor2;
import aminano.com.rxjavapruebas.mvprxjavaOK.example.interactor.getid.PruebaInteractor;
import aminano.com.rxjavapruebas.mvprxjavaOK.example.retrofit.model.Comment;
import aminano.com.rxjavapruebas.mvprxjavaOK.example.retrofit.model.Post;
import aminano.com.rxjavapruebas.mvprxjavaOK.example.view.MainViewInterface;

/**
 * @author Antonio Miñano
 */
public class RequestPresenterImp extends RxPresenterInterface implements RequestPresenter {
  private PruebaInteractor pruebaInteractor;
  private PruebaInteractor2 pruebaInteractor2;

  public RequestPresenterImp(MainViewInterface mainView, PruebaInteractor pruebaInteractor,
      PruebaInteractor2 pruebaInteractor2) {
    super(mainView);
    this.pruebaInteractor = pruebaInteractor;
    this.pruebaInteractor2 = pruebaInteractor2;
  }

  @Override
  public void doActionGetFromApi() {
    mainView.enableLoading();
    Subscriber(pruebaInteractor, 1);
  }

  @Override
  public void doTransformToObservable(String stringFromView) {
    Subscriber(pruebaInteractor2, 2, stringFromView);
  }

  //se usa para setear algo en las vistas.
  @Override
  public void actionExecuteMainMethod(int elegir) {
    if (elegir == 1) {
      mainView.writeSomething((((Post) getObject())).getTitle());
      mainView.disableLoading();
    } else if (elegir == 2) {
      mainView.writeSomething2(((Comment) getObject()).getName());
    }

    ////Ejemplo de ejecución de interactor anidados
    //if (elegir == 1) {
    //  mainView.writeSomething((((Post) getObject())).getTitle());
    //  mainView.disableLoading();
    //  doTransformToObservable("hola caracola");
    //} else if (elegir == 2) {
    //  mainView.writeSomething2(((Comment) getObject()).getName());
    //}

  }
}