package aminano.com.rxjavapruebas.mvprxjavaOK.core.base;

import aminano.com.rxjavapruebas.mvprxjavaOK.example.app.module.InteractorModule;
import aminano.com.rxjavapruebas.mvprxjavaOK.example.app.module.PresenterModule;
import aminano.com.rxjavapruebas.mvprxjavaOK.example.app.module.RootModule;
import dagger.ObjectGraph;
import java.util.Arrays;
import java.util.List;

/**
 * @author Antonio Miñano
 */
public abstract class CoreApplication extends android.app.Application {

  private ObjectGraph objectGraph;

  @Override
  public void onCreate() {
    super.onCreate();
    objectGraph = ObjectGraph.create(getModules().toArray());
    objectGraph.inject(this);
  }

  protected List<Object> getModules() {
    return Arrays.asList(new RootModule(this), new PresenterModule(), new InteractorModule());
  }

  public void inject(Object className) {
    objectGraph.inject(className);
  }
}
