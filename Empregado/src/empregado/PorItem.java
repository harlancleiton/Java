package empregado;

public final class PorItem extends Empregado{
    
    private double producao;
    private double quantidade;

    public PorItem(String n, String f, double producao, double quantidade) {
        super(n, f);
        this.setProducao(producao);
        this.setQuantidade(quantidade);
    }
    
    @Override
    public double ganha() {
        return getProducao()*getQuantidade();
    }
    
    @Override
    public String toString(){
        return "Por Item: "+super.toString();
    }
    
    public double getProducao() {
        return producao;
    }

    public void setProducao(double producao) {
        this.producao = producao;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }   
}