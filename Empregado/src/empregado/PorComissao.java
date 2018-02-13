package empregado;

public final class PorComissao extends Empregado{

    private double salario;
    private double comissao;
    private int vendas;
    
    public PorComissao(String n, String f, double salario, double comissao, int vendas){
        super(n,f);
        this.setSalario(salario);
        this.setComissao(comissao);
        this.setVendas(vendas);
    }
    
    @Override
    public double ganha() {
        return salario+comissao*vendas;
    }
    
    @Override
    public String toString(){
        return "Por Comissão: "+super.toString();
    }
    
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    public int getVendas() {
        return vendas;
    }

    public void setVendas(int vendas) {
        this.vendas = vendas;
    }   
}
