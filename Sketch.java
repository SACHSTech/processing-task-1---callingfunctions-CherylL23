import processing.core.PApplet;

public class Sketch extends PApplet {
	
  public void settings() {
   //size of the picture
    size(400, 400);
  }
  
  public void setup() {
    //background coloring
    background(0, 210, 252);
  }

  public void draw() {

    //sun
    stroke(0);
    fill(240, 252, 0);
    ellipse(70, 70, 100, 100);

    //house drawing
    stroke(0);
    fill(207, 76, 33);
    triangle(100, 200, 300, 200, 200, 100);

    stroke(0);
    fill(240, 235, 182);
    rect(100, 200, 200, 150);
    
    stroke(0);
    fill(31, 191, 76);
    rect(0, 340, 400, 400);

    //door
    stroke(0);
    fill(82, 79, 53);
    rect(190, 230, 80, 110);

    stroke(0);
    fill(240, 252, 0);
    ellipse(255, 300, 15, 15);
    
    //window
    stroke(0);
    fill(145, 229, 242);
    rect(110, 230, 70, 60);


  }
}