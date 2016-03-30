package aminano.com.rxjavapruebas.mvprxjavaOK.example.view;

import aminano.com.rxjavapruebas.mvprxjavaOK.example.retrofit.model.Post;
import java.util.List;

/**
 * @author Antonio Miñano
 */
public interface MainViewInterface {
  void enableLoading();

  void disableLoading();

  void writeSomething(String text);

  void writeSomething2(String text) ;

  }
