package Prototype;

public abstract class CarroPrototype {

    protected double valor;

    public abstract CarroPrototype clonar();

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
