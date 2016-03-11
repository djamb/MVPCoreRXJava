package aminano.com.rxjavapruebas.api.model;


import java.util.ArrayList;

/**
 * Created by fahim on 4/19/15.
 */
public class Artist {
    public String name;
    public Followers followers;
    public ArrayList<aminano.com.rxjavapruebas.api.model.Image> images;

    public class Followers {
        public String href;
        public int total;
    }
}
