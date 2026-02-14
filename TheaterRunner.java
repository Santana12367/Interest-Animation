import org.code.theater.*;
import org.code.media.*;

public class TheaterRunner {
  public static void main(String[] args) {

    /* 
    2026 Position Data
    */
    String[][] ramsPositions = {
      {"Quarterback", "M. Stafford", "J. Garoppolo"},
      {"Wide Receiver", "P. Nacua", "D. Adams"},
      {"Edge Rusher", "J. Verse", "B. Young"},
      {"Secondary", "K. Kinchens", "D. Williams"}
    };

    /* 
    2026 Unit Star Images
    */
    ImageFilter[][] unitStars = {
      { new ImageFilter("stafford.jpeg"), new ImageFilter("nacua.jpeg"), new ImageFilter("adams.jpeg") }, 
      { new ImageFilter("verse.jpeg"), new ImageFilter("b_young.jpeg"), new ImageFilter("kinchens.jpeg") }
    };

    // Instantiate Scenes
    IntroScene introScene = new IntroScene("rams_logo.jpeg"); // Ensure this file is in your assets
    PositionScene posScene = new PositionScene(ramsPositions);
    UnitScene starScene = new UnitScene(unitStars);

     /* 
    Draw Scenes
    */
    introScene.drawScene();
    posScene.drawScene();
    starScene.drawScene();
    
     /* 
    Plays the intro first
    */
    Theater.playScenes(introScene, posScene, starScene);
  }
}
