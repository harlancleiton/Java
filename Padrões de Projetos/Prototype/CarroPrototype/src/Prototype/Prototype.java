package Prototype;

public class Prototype {

    public static void main(String[] args) {
        GolPrototype prototipoGol = new GolPrototype();
        CarroPrototype novoGol = prototipoGol.clonar();
        novoGol.setValor(30000.0);
        System.out.println("NOVO GOL\nValor: " + novoGol.getValor() + ".");
    }
}