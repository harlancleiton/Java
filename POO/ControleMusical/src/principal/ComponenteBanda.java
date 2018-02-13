/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

/**
 *
 * @author vncserver
 */
public class ComponenteBanda extends Pessoa {
    private String funcao;

    /**
     * @return the funcao
     */
    public String getFuncao() {
        return funcao;
    }

    /**
     * @param funcao the funcao to set
     */
    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
    
    @Override
    public String toString(){
        return this.getNome() + " - " + this.getFuncao();
    }
}
