import org.code.theater.*;
import org.code.media.*;

public class IntroScene extends Scene {
  private String logoFile;

  public IntroScene(String logoFile) {
    this.logoFile = logoFile;
  }

  public void drawScene() {
    clear("blue"); // Rams Blue background
    
    // Draw the logo in the center
    // Adjust coordinates (100, 100) and size (200) based on your image
    drawImage(logoFile, 100, 50, 200);
    
    // Set up the intro text
    setTextColor("yellow"); // Rams Gold
    setTextHeight(40);
    drawText("Intro to Rams", 75, 300);
    
    setTextHeight(20);
    drawText("2026 Season Review", 110, 340);
    
    pause(2.5); // Hold the intro screen for 2.5 seconds
  }
}
