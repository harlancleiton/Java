package Principal;

import FactoryMethod.DispositivosMoveis;
import FactoryMethod.DispositivosMoveisFactory;

public class Principal {

    public static void main(String[] args) {
        DispositivosMoveis celular, celular2;
        celular=DispositivosMoveisFactory.criarDispositivo("celular","nokia");
        celular.exibirInfo();
        celular2=FactoryMethod.DispositivosMoveisFactory.criarDispositivo("celular","motorola");
        celular2.exibirInfo();
    }
}