package Prototype;

public class GolPrototype extends CarroPrototype {

    protected GolPrototype(GolPrototype golPrototype) {
        this.setValor(golPrototype.valor);
    }

    public GolPrototype() {
        //this.setValor(0);
        valor = 0.0;
    }

    public CarroPrototype clonar() {
        return new GolPrototype(this);
    }
}
