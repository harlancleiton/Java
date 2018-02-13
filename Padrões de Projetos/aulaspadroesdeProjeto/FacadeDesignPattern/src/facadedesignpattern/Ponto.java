/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package facadedesignpattern;

/**
 *
 * @author Helder
 */
public class Ponto {
  private PontoCartesiano pc;

  public Ponto( double x, double y ) {
    pc = new PontoCartesiano( x,y );
  }
  public String toString() {
    return pc.toString();
  }

  public void move( int dx, int dy ) {
    pc.move( dx,dy );
  }
  public void rotaciona( int angle, Ponto o ) {
    double x = pc.getX() - o.pc.getX();
    double y = pc.getY() - o.pc.getY();
    PontoPolar pp = new PontoPolar( Math.sqrt(x*x+y*y),
                          Math.atan2(y,x)*180/Math.PI );
//    pp.rotate( angle );
    System.out.println( "  Ponto Polar é " + pp.toString() );
    String str = pp.toString();
    int i = str.indexOf( '@' );
    double r = Double.parseDouble( str.substring(1,i) );
    double a = Double.parseDouble( str.substring(i+1,str.length()-1) );
    pc = new PontoCartesiano(r*Math.cos(a*Math.PI/180) + o.pc.getX(),
                  r*Math.sin(a*Math.PI/180) + o.pc.getY() );
  }
}
