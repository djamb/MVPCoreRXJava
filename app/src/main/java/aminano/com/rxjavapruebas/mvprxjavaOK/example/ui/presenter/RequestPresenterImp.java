package aminano.com.rxjavapruebas.mvprxjavaOK.example.ui.presenter;

import aminano.com.rxjavapruebas.mvprxjavaOK.core.rxjava.InteractorInterface;
import aminano.com.rxjavapruebas.mvprxjavaOK.example.retrofit.model.Comment;
import aminano.com.rxjavapruebas.mvprxjavaOK.example.retrofit.model.Post;

/**
 * @author Antonio Miñano
 */
public class RequestPresenterImp extends RequestPresenter {
  private InteractorInterface pruebaInteractor;
  private InteractorInterface pruebaInteractor2;

  public RequestPresenterImp(InteractorInterface pruebaInteractor,
      InteractorInterface pruebaInteractor2) {
    this.pruebaInteractor = pruebaInteractor;
    this.pruebaInteractor2 = pruebaInteractor2;
  }

  @Override
  public void doActionGetFromApi() {
    view.enableLoading();
    Subscriber(pruebaInteractor, 1);
  }

  @Override
  public void doTransformToObservable(String stringFromView) {
    //Borrar para prueba de interactor anidados
    Subscriber(pruebaInteractor2, 2, stringFromView);
  }

  //se usa para setear algo en las vistas.
  @Override
  public void actionExecuteMainMethod(int elegir) {
    if (elegir == 1) {
      view.writeSomething((((Post) getObject())).getTitle());
      view.disableLoading();
    } else if (elegir == 2) {
      view.writeSomething2(((Comment) getObject()).getName());
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

  @Override
  public void onViewReady() {
    super.onViewReady();
  }
}