package aminano.com.rxjavapruebas.mvprxjavaOK;

/**
 * @author Antonio Miñano
 */
public interface RequestPresenter {
  void doActionStartSession();

  void doActionTakePicture(String sessionId);

  void doActionCreateDownloadResource();

  void doActionDownloadFile(String get_latestFileUri);
}
