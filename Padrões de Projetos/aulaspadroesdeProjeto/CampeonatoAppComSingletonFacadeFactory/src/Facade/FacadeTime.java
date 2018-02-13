/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Facade;

import business.TimeBS;
import modelo.Time;

/**
 *
 * @author helder
 */
public class FacadeTime {
     
    TimeBS timebs = new TimeBS();

     public void adicionarTime(Time time) throws Exception
    {
         timebs.adicionarTime(time);
    }

}
