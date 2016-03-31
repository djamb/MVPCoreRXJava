package aminano.com.rxjavapruebas.mvprxjavaOK.example.ui.view;

import aminano.com.rxjavapruebas.mvprxjavaOK.core.View;

/**
 * @author Antonio Miñano
 */
public interface MainViewInterface extends View {
  void enableLoading();

  void disableLoading();

  void writeSomething(String text);

  void writeSomething2(String text);
}
