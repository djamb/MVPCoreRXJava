package aminano.com.rxjavapruebas.mvprxjavaOK.example.app.module;

import aminano.com.rxjavapruebas.mvprxjavaOK.example.base.MyApplication;
import aminano.com.rxjavapruebas.mvprxjavaOK.example.ui.view.MainActivity;
import android.content.Context;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;

/**
 * @author Antonio Miñano
 */
@Module(library = true,
    complete = false,
    includes = {
        InteractorModule.class, PresenterModule.class
    },
    injects = {
        MyApplication.class, MainActivity.class
    })
public class RootModule {

  private Context context;

  public RootModule(Context context) {
    this.context = context;
  }

  @Provides
  @Singleton
  Context provideAppContext() {
    return context;
  }
}
