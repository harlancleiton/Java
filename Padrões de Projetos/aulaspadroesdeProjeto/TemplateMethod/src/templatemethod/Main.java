/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package templatemethod;

/**
 *
 * @author Helder
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic her
        LinkHTML linkhtml = new LinkHTML();
        System.out.println(linkhtml.fazerLink("teste2","www.teste2.com" ));
        LinkXML linkxml = new LinkXML();
        System.out.println(linkxml.fazerLink("teste4","www.teste4.com"));
    }

}
