import org.code.theater.*;
import org.code.media.*;

public class ImagePlus extends Image {
  private Pixel[][] pixels;

  public ImagePlus(String filename) {
    super(filename);
    pixels = getPixelsFromImage();
  }

  public Pixel[][] getImagePixels() {
    return pixels;
  }

  public Pixel[][] getPixelsFromImage() {
    Pixel[][] tempPixels = new Pixel[getHeight()][getWidth()];
    for (int row = 0; row < tempPixels.length; row++) {
      for (int col = 0; col < tempPixels[0].length; col++) {
        tempPixels[row][col] = getPixel(col, row);
      }
    }
    return tempPixels;
  }
}
