/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package facresposta;

public class DispositivoFactory {
    public static Dispositivo getDispositivo( String tipoDispositivo ) {
        if( tipoDispositivo == null )
            return null;
        else if( tipoDispositivo.equals("Tablet") )
            return new Tablet();
        else if( tipoDispositivo.equals("Desktop") )
            return new Desktop();
        else if( tipoDispositivo.equals("Smartphone") )
            return new Smartphone();
         else
             return null;
      }
 }