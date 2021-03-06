package aminano.com.rxjavapruebas.mvprxjavaOK.example.retrofit;

/**
 * @author Antonio Miñano
 */

import aminano.com.rxjavapruebas.mvprxjavaOK.example.retrofit.model.Post;
import retrofit.RequestInterceptor;
import retrofit.RestAdapter;
import retrofit.http.GET;
import retrofit.http.Path;
import rx.Observable;

public class ForumService {
  private static final String FORUM_SERVER_URL = "http://jsonplaceholder.typicode.com";
  private ForumApi mForumApi;

  public ForumService() {
    RequestInterceptor requestInterceptor = new RequestInterceptor() {
      @Override
      public void intercept(RequestFacade request) {
        request.addHeader("Accept", "application/json");
      }
    };
    RestAdapter restAdapter = new RestAdapter.Builder().setEndpoint(FORUM_SERVER_URL)
        .setRequestInterceptor(requestInterceptor)
        .setLogLevel(RestAdapter.LogLevel.FULL)
        .build();
    mForumApi = restAdapter.create(ForumApi.class);
  }

  public ForumApi getApi() {
    return mForumApi;
  }

  public interface ForumApi {

    @GET("/posts/{id}")
    public Observable<Post> getPost(@Path("id") int postId);

  }
}