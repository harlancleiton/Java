/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package facadedesignpattern;

/**
 *
 * @author helder
 */
public class FacadeVenda {

    Venda venda = new Venda();

    public void efetuarVenda(Cliente cli){

        venda.efetuarVenda(cli);
    }



}
