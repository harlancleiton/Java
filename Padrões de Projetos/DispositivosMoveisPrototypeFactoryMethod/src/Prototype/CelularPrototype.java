package Prototype;

import FactoryMethod.DispositivosMoveis;

public class CelularPrototype extends DispositivosMoveis{
    public static CelularPrototype clonar(String marca) {
        if("nokia".equals(marca))
            return new CelularNokiaPrototype();
        else if("motorola".equals(marca))
            return new CelularMotorolaPrototype();
        return null;
    }
}