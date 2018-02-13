/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package abstractfactory;

 public class Chevrolet extends Fabricante {
     public Chevrolet() {
         nomeFabrica = "Chevrolet";
     }

     public Carro getCarro( String marca ) {
         if( marca == null ) {
             return null;
         }
         else if( marca.equals("Vectra") ) {
             return new Vectra();
         }
         else {
             return null;
         }
     }
 }