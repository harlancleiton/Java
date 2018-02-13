/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

/**
 *
 * @author vncserver
 */
public class Musica {
    private String nome;
    private String genero;
    private Banda banda;
    private int ano;
    private String formato;
    private String gravadora;
    private String duracao;

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
     * @return the genero
     */
    public String getGenero() {
        return genero;
    }

    /**
     * @param genero the genero to set
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }

    /**
     * @return the banda
     */
    public Banda getBanda() {
        return banda;
    }

    /**
     * @param banda the banda to set
     */
    public void setBanda(Banda banda) {
        this.banda = banda;
    }

    /**
     * @return the ano
     */
    public int getAno() {
        return ano;
    }

    /**
     * @param ano the ano to set
     */
    public void setAno(int ano) {
        this.ano = ano;
    }

    /**
     * @return the formato
     */
    public String getFormato() {
        return formato;
    }

    /**
     * @param formato the formato to set
     */
    public void setFormato(String formato) {
        this.formato = formato;
    }

    /**
     * @return the gravadora
     */
    public String getGravadora() {
        return gravadora;
    }

    /**
     * @param gravadora the gravadora to set
     */
    public void setGravadora(String gravadora) {
        this.gravadora = gravadora;
    }

    /**
     * @return the duracao
     */
    public String getDuracao() {
        return duracao;
    }

    /**
     * @param duracao the duracao to set
     */
    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }
}
