/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package respostaexercicio;

/**
 *
 * @author Helder
 */
public class ClientePJ extends Cliente {

/**
 *
 * @author Helder
 */

      protected  String darDesconto(){
       super.setValor(20);
        return "aqui eh do cliente pj"+valor;
    }

}
