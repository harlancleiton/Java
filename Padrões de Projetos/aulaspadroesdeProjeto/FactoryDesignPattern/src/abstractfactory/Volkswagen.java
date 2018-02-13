/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package abstractfactory;

/**
 *
 * @author Helder
 */
public class Volkswagen extends Fabricante {
   public Volkswagen() {
         nomeFabrica = "Volkswagen";
     }

     public Carro getCarro( String marca ) {
         if( marca == null ) {
             return null;
         }
         else if( marca.equals("Golf") ) {
             return new Golf();
         }
         else if( marca.equals("Gol") ) {
             return new Gol();
         }

         else {
             return null;
         }
     }
}
