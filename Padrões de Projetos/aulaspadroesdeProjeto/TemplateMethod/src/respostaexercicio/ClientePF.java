/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package respostaexercicio;

/**
 *
 * @author Helder
 */
public class ClientePF extends Cliente{
    
    protected  String darDesconto(){
       super.setValor(10);
        return "aqui eh do cliente pf"+valor;
    }


}
