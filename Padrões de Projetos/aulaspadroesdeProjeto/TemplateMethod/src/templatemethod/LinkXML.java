/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package templatemethod;

/**
 *
 * @author Helder
 */
public class LinkXML extends ModeloLink {

/**
 *
 * @author Helder
 */

    protected  String fazerLink(String texto, String url){
        return "<xlink:href="+url+">"+texto;
    }

}
