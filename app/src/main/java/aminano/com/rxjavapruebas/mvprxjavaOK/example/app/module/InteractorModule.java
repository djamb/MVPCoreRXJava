package aminano.com.rxjavapruebas.mvprxjavaOK.example.app.module;

import aminano.com.rxjavapruebas.mvprxjavaOK.core.rxjava.InteractorInterface;
import aminano.com.rxjavapruebas.mvprxjavaOK.example.domain.interactor.changestate.PruebaInteractor2;
import aminano.com.rxjavapruebas.mvprxjavaOK.example.domain.interactor.getid.PruebaInteractor;
import dagger.Module;
import dagger.Provides;
import javax.inject.Named;
import javax.inject.Singleton;

/**
 * @author Antonio Miñano
 */
@Module(
    complete = false,
    library = true)
public class InteractorModule {

  @Provides
  @Named("restPetition")
  @Singleton
  InteractorInterface providePruebaInteractor() {
    return new PruebaInteractor();
  }

  @Provides
  @Named("changeObservable")
  @Singleton
  InteractorInterface providePruebaInteractor2() {
    return new PruebaInteractor2();
  }
}
