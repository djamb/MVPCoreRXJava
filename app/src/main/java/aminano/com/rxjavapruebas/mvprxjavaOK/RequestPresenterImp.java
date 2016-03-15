package aminano.com.rxjavapruebas.mvprxjavaOK;

import aminano.com.rxjavapruebas.mvprxjavaOK.core.RxPresenterInterface;
import aminano.com.rxjavapruebas.mvprxjavaOK.retrofit.ForumService;
import aminano.com.rxjavapruebas.mvprxjavaOK.retrofit.model.Comment;
import aminano.com.rxjavapruebas.mvprxjavaOK.retrofit.model.Post;
import android.util.Log;

/**
 * @author Antonio Miñano
 */
public class RequestPresenterImp extends RxPresenterInterface implements RequestPresenter {
  private PruebaInteractor pruebaInteractor;
  private PruebaInteractor2 pruebaInteractor2;
  //private ForumService forum;

  public RequestPresenterImp(MainViewInterface mainView, PruebaInteractor pruebaInteractor,
      PruebaInteractor2 pruebaInteractor2/*, ForumService forum*/) {
    super(mainView);
    //this.forum = forum;
    this.pruebaInteractor = pruebaInteractor;
    this.pruebaInteractor2 = pruebaInteractor2;
  }

  @Override
  public void doActionStartSession() {
    mainView.enableLoading();
    Subscriber(pruebaInteractor, 1);
  }


  @Override
  public void doActionTakePicture(String sessionId) {
    Subscriber(pruebaInteractor2, 2);
  }

  @Override
  public void doActionCreateDownloadResource() {

  }

  @Override
  public void doActionDownloadFile(String get_latestFileUri) {
    //mainView.enableLoading();
  }

  @Override
  public void actionExecuteMainMethod(int elegir) {
    if (elegir == 1) {
      Log.e("resultado1", "" + (((Post) getObject())).getTitle());
      mainView.writeSomething((((Post) getObject())).getTitle());
    } else if (elegir == 2) {
      Log.e("resultado2", "" + ((Comment)getObject()).getName());
      mainView.writeSomething2();
    }
  }
}