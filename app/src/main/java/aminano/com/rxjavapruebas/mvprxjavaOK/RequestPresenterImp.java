package aminano.com.rxjavapruebas.mvprxjavaOK;

import aminano.com.rxjavapruebas.api.model.Image;
import aminano.com.rxjavapruebas.mvprxjavaOK.retrofit.ForumService;
import aminano.com.rxjavapruebas.mvprxjavaOK.retrofit.Post;
import android.util.Log;
import java.util.List;
import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * @author Antonio Miñano
 */
public class RequestPresenterImp extends RxPresenterInterface implements /*RequestPresenterListener,*/
    RequestPresenter {
  private PruebaInteractor pruebaInteractor;
  private PruebaInteractor2 pruebaInteractor2;
  ForumService forum;
  public RequestPresenterImp(MainViewInterface mainView, PruebaInteractor pruebaInteractor,
      PruebaInteractor2 pruebaInteractor2,ForumService forum) {
    super(mainView);
    this.forum=forum;
    this.pruebaInteractor = pruebaInteractor;
    this.pruebaInteractor2 = pruebaInteractor2;
  }



  @Override
  public void doActionStartSession() {

    Subscriber(pruebaInteractor, 1);
  }

  @Override
  public void doActionTakePicture(String sessionId) {
    Subscriber(pruebaInteractor2, 2);
  }

  @Override
  public void doActionCreateDownloadResource() {
    //mainView.enableLoading();
  }

  @Override
  public void doActionDownloadFile(String get_latestFileUri) {
    //mainView.enableLoading();
  }

  @Override
  public void actionExecuteMainMethod(int elegir) {
    if (elegir == 1) {

      Log.e("resultado1", "" + (((Post)getObjecta())).getTitle());
      mainView.writeSomething();
    } else if (elegir == 2) {
      //Log.e("resultado2", "" + ((Image)getObjecta()).getHeight());
      mainView.writeSomething2();
    }
  }
}