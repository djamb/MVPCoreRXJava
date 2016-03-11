package aminano.com.rxjavapruebas.api;


import aminano.com.rxjavapruebas.api.model.ArtistSearchResponse;
import retrofit.http.GET;
import retrofit.http.Query;
import rx.Observable;

/**
 * Created by fahim on 4/19/15.
 */
public interface SpotifyService {
    @GET("/search?type=artist")
    Observable<ArtistSearchResponse> artistSearch(@Query("q") String query);
}
