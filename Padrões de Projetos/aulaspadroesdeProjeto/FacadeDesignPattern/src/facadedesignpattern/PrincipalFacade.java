/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package facadedesignpattern;

/**
 *
 * @author Helder
 */
public class PrincipalFacade {
  public static void main( String[] args ) {


    Linha linha1 = new Linha( new Ponto(4,8), new Ponto(7,9) );
    linha1.move(-2,-4);
    System.out.println( "moveu  " + linha1 );
    linha1.rotaciona(45);

    System.out.println( "rotacionou: " + linha1 );
    Linha linha2 = new Linha( new Ponto(2,1), new Ponto(2.866,1.5) );
    linha2.rotaciona(30);
    System.out.println( "rotacionou: " + linha2 );
  }
}