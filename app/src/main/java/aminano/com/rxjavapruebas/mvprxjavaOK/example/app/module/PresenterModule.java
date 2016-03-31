package aminano.com.rxjavapruebas.mvprxjavaOK.example.app.module;

import aminano.com.rxjavapruebas.mvprxjavaOK.core.rxjava.InteractorInterface;
import aminano.com.rxjavapruebas.mvprxjavaOK.example.ui.presenter.RequestPresenter;
import aminano.com.rxjavapruebas.mvprxjavaOK.example.ui.presenter.RequestPresenterImp;
import dagger.Module;
import dagger.Provides;
import javax.inject.Named;
import javax.inject.Singleton;

/**
 * @author Antonio Miñano
 */
@Module(
    complete = false,
    library = true, includes = {
    InteractorModule.class
})

public class PresenterModule {

  @Provides
  @Singleton
  RequestPresenter provideRequestPresenter(
      @Named("restPetition") InteractorInterface pruebaInteractor,
      @Named("changeObservable") InteractorInterface pruebaInteractor2) {
    return new RequestPresenterImp(pruebaInteractor, pruebaInteractor2);
  }
}
