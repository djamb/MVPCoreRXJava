package aminano.com.rxjavapruebas.mvprxjavaOK;

import aminano.com.rxjavapruebas.mvprxjavaOK.retrofit.Post;
import java.util.List;

/**
 * @author Antonio Miñano
 */
public interface MainViewInterface {
  void enableLoading();

  void disableLoading();

  void writeSomething();

  void writeSomething2() ;

  void displayPost(List<Post> post);

    //void getStartSession(StartSessiona getStartSession);
    //
    //void getTakePicture();
    //
    //void getCreateDownloadResource(FileName fileName);
    //
    // void getDownloadFile(File file);
  }
