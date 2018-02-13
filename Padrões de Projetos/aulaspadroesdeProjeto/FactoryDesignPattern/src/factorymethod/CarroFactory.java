/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package factorymethod;

public class CarroFactory {
    public static Carro getCarro( String tipoCarro ) {
        if( tipoCarro == null )
            return null;
        else if( tipoCarro.equals("Vectra") )
            return new Vectra();
        else if( tipoCarro.equals("Gol") )
            return new Gol();
        else if( tipoCarro.equals("Golf") )
            return new Golf();
         else
             return null;
      }
 }