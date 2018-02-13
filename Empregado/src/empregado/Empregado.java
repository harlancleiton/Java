package empregado;

public abstract class Empregado {

    private String nome;
    private String familia;
    
    public Empregado(String n, String f){
        nome=n;
        familia=f;
    }
    
    public String toString(){
        return nome+' '+familia;
    }
    
    public abstract double ganha();
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFamilia() {
        return familia;
    }

    public void setFamilia(String familia) {
        this.familia = familia;
    }
}