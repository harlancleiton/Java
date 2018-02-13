/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package abstractfactory;

 public class PrincipalAbstractFactory{
        public static void main( String args[] ) {

          Fabricante fab = Fabricante.getInstance("Chevrolet");
          Carro carro = fab.getCarro("Vectra");
          if( carro != null ) {
             System.out.println( "VelocidadeFinal: " + carro.getVelocidadeFinal() );
          }
    }
  }