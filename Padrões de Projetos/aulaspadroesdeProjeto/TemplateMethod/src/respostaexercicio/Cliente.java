/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package respostaexercicio;

/**
 *
 * @author Helder
 */
public abstract class Cliente {
    float valor = 0;

    protected abstract String darDesconto();

    public final String templateMethodDesconto(){
        String mensagem = "digite o seu nome e o seu bairro"+darDesconto();
        return mensagem;
    }

    public void setValor(float valor){
        this.valor=valor;
    }

}
