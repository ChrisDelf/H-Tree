

import java.util.*;

class Main {
  static public void main( String args[] ) {
    System.out.println( "Practice makes Perfect!" );
    drawHTree(0,0,16, 4;)
  }
  public static void drawLine(double x1, double y1, double x2, double y2){
     System.out.println("Line is drawn by the point: " + "(" + x1 + "," + y1 + ") " + "and " + "(" + x2 + "," + y2 + ")");
  }
  public static void drawHTree(double x, double y, double length, int depth) {
    if (depth == 0) 
    {return;}
        double x0 = x - length / 2;
        double x1 = x + length / 2;
        double y0 = y - length / 2;
        double y1 = y + length / 2;

  
  // drawing the lines
  drawLine(x0, y, x1, y) // center line
  drawLine(x1,y0,x1,y1) // right segment
  drawLine(x0, y0, x0, y0)// left segment
  // the lenght of the segements decreases by squart root
    double newLength = length / Math.sqrt(2);
    // decrement depth by 1 
        drawHTree(x0, y0, newLength, depth - 1);     // lower left
        drawHTree(x0, y1, newLength, depth - 1);    // upper left
        drawHTree(x1, y0, newLength, depth - 1);   // lower right
        drawHTree(x1, y1, newLength, depth - 1); // upper right 
    }
}
