package empregado;

public class TesteEmpregado {
    
    public static void main(String[] args) {
        //Criando os objetos
        Chefe chefe=new Chefe("João","Familia X",2500);
        PorItem porItem=new PorItem("José","Familia Y",100,9.75);
        PorComissao porComissao=new PorComissao("Pedro","Familia Z",1000,50,5);
        
        //Método ganha
        System.out.println("Chefe: R$"+chefe.ganha());
        System.out.println("Por item: R$"+porItem.ganha());
        System.out.println("Por comissão: R$"+porComissao.ganha());
        
        //Método toString
        System.out.println(chefe.toString());
        System.out.println(porItem.toString());
        System.out.println(porComissao.toString());
    }
}