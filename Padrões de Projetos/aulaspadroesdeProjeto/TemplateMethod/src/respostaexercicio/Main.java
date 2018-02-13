/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package respostaexercicio;

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
        ClientePF clipf = new ClientePF();
        System.out.println(clipf.templateMethodDesconto());
        ClientePJ clipj = new ClientePJ();
        System.out.println(clipj.templateMethodDesconto());
    }

}
