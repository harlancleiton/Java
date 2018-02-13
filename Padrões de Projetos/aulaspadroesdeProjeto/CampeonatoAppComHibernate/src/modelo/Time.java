
package modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 *
 */
@Entity
@Table(name = "times")
public class Time {
    @Id
   // @GeneratedValue
    @Column(name = "codigo")
    private Integer codigo;

    @Column(name = "nome", length = 50, nullable = true)
    private String nome;

    @Column(name = "estado", length = 50, nullable = true)
    private String estado;

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
