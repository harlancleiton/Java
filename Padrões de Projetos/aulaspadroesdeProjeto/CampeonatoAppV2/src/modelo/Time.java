
package modelo;

/**
 *
 * @author  Helder Arag�o e Erick Souza.
 */

public class Time {
    
    private int codigo = 0;
    private String nome = "";
    private String estado = "";

    public Time() {
        
    }
   
    public Time(int codigo, String nome,String estado) {
        this.codigo=codigo;
        this.nome = nome;
        this.estado=estado;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo=codigo;
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
     * @return the estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }
    
}
