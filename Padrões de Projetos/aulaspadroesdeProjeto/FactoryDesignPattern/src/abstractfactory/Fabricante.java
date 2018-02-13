/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package abstractfactory;

public abstract class Fabricante {
     protected String nomeFabrica;

     public abstract Carro getCarro( String marca );

     public static Fabricante getInstance( String fabricante ) {
         if( fabricante == null ) {
             return null;
         }
         else if(fabricante.equals("Chevrolet")) {
             return new Chevrolet();
         }
         else if(fabricante.equals("Volkswagen")) {
             return new Volkswagen();
         }
         else {
             return null;
         }
     }
 }