/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.util.ArrayList;

/**
 *
 * @author vncserver
 */
public class Banda {
    private ArrayList<ComponenteBanda> componentes = new ArrayList<>();
    private String nome;
    private String dataFundacao;

    /**
     * Adiciona um componente ao ArrayList de Componentes
     * @param c Componente da banda a ser adicionado
     */    
    public void adicionarComponente(ComponenteBanda c){
        componentes.add(c);
    }    
    
    /**
     * @return the componentes
     */
    public ArrayList<ComponenteBanda> getComponentes() {
        return componentes;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the dataFundacao
     */
    public String getDataFundacao() {
        return dataFundacao;
    }

    /**
     * @param dataFundacao the dataFundacao to set
     */
    public void setDataFundacao(String dataFundacao) {
        this.dataFundacao = dataFundacao;
    }
}
