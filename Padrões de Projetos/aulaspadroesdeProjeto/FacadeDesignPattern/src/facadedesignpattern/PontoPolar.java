/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package facadedesignpattern;

/**
 *
 * @author Helder
 */
public class PontoPolar {
  private double distancia, angulo;
  public PontoPolar( double distancia, double angulo ) {
    this.distancia = distancia;
    this.angulo = angulo;
  }
  public void  rotate( int ang ) {
    angulo= ang % 360;
  }
  public String toString() {
    return "[" + distancia + "@" + angulo + "]";
  }
}

