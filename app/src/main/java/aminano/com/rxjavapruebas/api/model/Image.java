package aminano.com.rxjavapruebas.api.model;

import aminano.com.rxjavapruebas.mvprxjavaOK.retrofit.SuperObject;

/**
 * Created by fahim on 4/19/15.
 */
public class Image extends SuperObject {
    public int height;
    public int width;
    public String url;

  public int getHeight() {
    return height;
  }

  public void setHeight(int height) {
    this.height = height;
  }

  public int getWidth() {
    return width;
  }

  public void setWidth(int width) {
    this.width = width;
  }

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }
}
