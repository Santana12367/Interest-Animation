import org.code.theater.*;
import org.code.media.*;

public class ImageFilter extends ImagePlus {
  public ImageFilter(String fileName) {
    super(fileName);
  }

  public void keepColor(String color) {
    Pixel[][] pixels = getImagePixels();
    for (int row = 0; row < pixels.length; row++) {
      for (int col = 0; col < pixels[0].length; col++) {
        Pixel current = pixels[row][col];
        if (color.equals("red")) { current.setBlue(0); current.setGreen(0); }
        else if (color.equals("blue")) { current.setRed(0); current.setGreen(0); }
        else if (color.equals("green")) { current.setRed(0); current.setBlue(0); }
      }
    }
  }

  public void pixelate(int gridSize) {
    Pixel[][] pixels = getImagePixels();
    for (int row = 0; row < pixels.length; row += gridSize) {
      for (int col = 0; col < pixels[0].length; col += gridSize) {
        int endRow = Math.min(row + gridSize, pixels.length);
        int endCol = Math.min(col + gridSize, pixels[0].length);
        int rTotal = 0, gTotal = 0, bTotal = 0;
        for (int i = row; i < endRow; i++) {
          for (int j = col; j < endCol; j++) {
            rTotal += pixels[i][j].getRed();
            gTotal += pixels[i][j].getGreen();
            bTotal += pixels[i][j].getBlue();
          }
        }
        int count = (endRow - row) * (endCol - col);
        for (int i = row; i < endRow; i++) {
          for (int j = col; j < endCol; j++) {
            pixels[i][j].setRed(rTotal / count);
            pixels[i][j].setGreen(gTotal / count);
            pixels[i][j].setBlue(bTotal / count);
          }
        }
      }
    }
  }
}
