package aminano.com.rxjavapruebas.mvprxjavaOK.example.presenter;

/**
 * @author Antonio Miñano
 */
public interface RequestPresenter {
  void doActionGetFromApi();

  void doTransformToObservable(String sessionId);

}
