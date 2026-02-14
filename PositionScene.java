import org.code.theater.*;
import org.code.media.*;

public class PositionScene extends Scene {
  private String[][] positions;

  public PositionScene(String[][] positions) {
    this.positions = positions;
  }

  public void drawScene() {
    for (int i = 0; i < positions.length; i++) {
      clear("blue"); // Rams Blue
      setTextColor("white");
      setTextHeight(30);
      drawText(positions[i][0], 50, 50); // Position Name
      
      setTextHeight(25);
      setTextColor("yellow"); // Rams Gold
      drawText("Starter: " + positions[i][1], 50, 150);
      drawText("Backup: " + positions[i][2], 50, 200);
      
      pause(1.5);
    }
  }
}
