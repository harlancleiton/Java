/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package templatemethod;

/**
 *
 * @author Helder
 */
public abstract class ModeloLink {

    protected abstract String fazerLink(String texto, String url);

    public final String templateMethod(){
        String mensagem = "endereco"+fazerLink("Empresa","http://www.teste.com");
        return mensagem;
    }

}
