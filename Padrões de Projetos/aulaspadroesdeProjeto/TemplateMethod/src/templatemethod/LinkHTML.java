/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package templatemethod;

/**
 *
 * @author Helder
 */
public class LinkHTML extends ModeloLink{
    
    protected  String fazerLink(String texto, String url){
        return "<href="+url+">"+texto;
    }


}
