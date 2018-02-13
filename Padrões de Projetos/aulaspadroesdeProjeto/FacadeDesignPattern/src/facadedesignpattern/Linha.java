/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package facadedesignpattern;

/**
 *
 * @author Helder
 */
public class Linha {
  private Ponto pinicial, pfinal;
  public Linha( Ponto pinicial, Ponto pfinal ) {
    this.pinicial = pinicial;
    this.pfinal = pfinal;
  }
  public void  move( int dx, int dy ) {
    pinicial.move( dx, dy );
    pfinal.move( dx, dy );
  }
  public void  rotaciona( int angulo ) {
    pfinal.rotaciona( angulo, pinicial );
  }
  public String toString() {
    return "a origem é " + pinicial + ", final " + pfinal;
  }
}
