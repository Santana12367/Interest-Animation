import org.code.theater.*;
import org.code.media.*;

public class UnitScene extends Scene {
  private ImageFilter[][] unitStars;

  public UnitScene(ImageFilter[][] unitStars) {
    this.unitStars = unitStars;
  }

  public void drawScene() {
    for (int r = 0; r < unitStars.length; r++) {
      for (int c = 0; c < unitStars[r].length; c++) {
        clear("black");
        
        ImageFilter playerImg = unitStars[r][c];
        
        /* Apply filters from your ImageFilter class
          */
        if (r == 0) {
          playerImg.keepColor("red"); // Red filter the Offense
        } else {
          playerImg.keepColor("blue"); // Blue filter the Defense
        }

        drawImage(playerImg, 0, 0, 400);
        
        setTextColor("white");
        setTextHeight(30);
        String label = (r == 0) ? "OFFENSIVE STARS" : "DEFENSIVE STARS";
        drawText(label, 20, 350);
        
        pause(1.0);
      }
    }
  }
}
