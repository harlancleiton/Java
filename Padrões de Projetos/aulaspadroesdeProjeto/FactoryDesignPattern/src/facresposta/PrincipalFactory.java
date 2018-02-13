/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package facresposta;

public class PrincipalFactory {
    public static void main( String args[] ) {

        Dispositivo disptablet = DispositivoFactory.getDispositivo("Tablet");
        Dispositivo disptablet = DispositivoFactory.getDispositivo("Desktop");

        Carro carro = DispositivoFactory.getCarro("Vectra");

    if( carro != null ) {
         System.out.println( "Velocidade Final: " + carro.getVelocidadeFinal() );
    }
   }
 }