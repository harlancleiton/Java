/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package facadedesignpattern;
public class PontoCartesiano {

   private double x, y;
  public PontoCartesiano(double x, double y ) {
    this.x = x;
    this.y = y;
  }
  public void  move( int dx, int dy ) {
    x = x+dx;
    y = y+dy;
  }
  public String toString() {
    return "(" + x + "," + y + ")";
  }
  public double getX() {
    return x;
  }
  public double getY() {
    return y;
  }
}