package aminano.com.rxjavapruebas.model;

/**
 * @author Antonio Miñano
 */
public class ImageContainer {
  private String text;
  private int intDrawable;

  public ImageContainer(String text, int intDrawable) {

    this.text = text;
    this.intDrawable = intDrawable;
  }

  public int getIntDrawable() {
    return intDrawable;
  }

  public void setIntDrawable(int intDrawable) {
    this.intDrawable = intDrawable;
  }

  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

}
