package aminano.com.rxjavapruebas.mvprxjavaOK.example.base;

import aminano.com.rxjavapruebas.mvprxjavaOK.core.base.CoreApplication;
import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/**
 * @author adrian
 */
public class MyApplication extends CoreApplication
    implements Application.ActivityLifecycleCallbacks {

  //@Inject protected Navigator navigator;

  @Override
  public void onCreate() {
    super.onCreate();
    registerActivityLifecycleCallbacks(this);
  }

  @Override
  public void onActivityCreated(Activity activity, Bundle bundle) {
    //navigator.setActivity(activity);
  }

  @Override
  public void onActivityStarted(Activity activity) {
    //Empty
  }

  @Override
  public void onActivityResumed(Activity activity) {
    //Empty
  }

  @Override
  public void onActivityPaused(Activity activity) {
    //Empty
  }

  @Override
  public void onActivityStopped(Activity activity) {
    //Empty
  }

  @Override
  public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    //Empty
  }

  @Override
  public void onActivityDestroyed(Activity activity) {
    //Empty
  }
}
