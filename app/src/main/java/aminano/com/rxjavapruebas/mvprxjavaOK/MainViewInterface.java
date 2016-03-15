package aminano.com.rxjavapruebas.mvprxjavaOK;

import aminano.com.rxjavapruebas.mvprxjavaOK.retrofit.model.Post;
import java.util.List;

/**
 * @author Antonio Miñano
 */
public interface MainViewInterface {
  void enableLoading();

  void disableLoading();

  void writeSomething(String text);

  void writeSomething2() ;

  void displayPost(List<Post> post);
  }
