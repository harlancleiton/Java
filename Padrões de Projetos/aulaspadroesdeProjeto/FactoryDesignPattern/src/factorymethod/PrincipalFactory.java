/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package factorymethod;

public class PrincipalFactory {
    public static void main( String args[] ) {

        Carro carro = CarroFactory.getCarro("Vectra");

    if( carro != null ) {
         System.out.println( "Velocidade Final: " + carro.getVelocidadeFinal() );
    }
   }
 }