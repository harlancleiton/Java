package FactoryMethod;

import Prototype.CelularPrototype;

public class DispositivosMoveisFactory{
    public static DispositivosMoveis criarDispositivo(String tipo, String marca){
        if("celular".equals(tipo))
            return CelularPrototype.clonar(marca);
//            if("nokia".equals(marca))
//                return new Prototype.CelularNokiaPrototype();
//            else if ("motorola".equals(marca))
//                return new Prototype.CelularMotorolaPrototype();
//        else if ("tablet".equals(tipo))
//            return new Tablet();
        else
            System.out.println("Ocorreu um erro ao criar o dispositivo.");
        return null;
    }
}
