package empregado;

public final class Chefe extends Empregado{

    private double salario;
    
    public Chefe(String n, String f, double salario) {
        super(n, f);
        this.setSalario(salario);
    }

    @Override
    public double ganha() {
        return getSalario();
    }
    
    @Override
    public String toString(){
        return "Chefe: "+super.toString();
    }
    
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if(salario>0)
            this.salario=salario;
        else
            this.salario=0;
    }
}
