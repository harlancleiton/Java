
public class DiscoX {
  
  
  protected String nomeDaClasse = "DiscoX";
  
  char setor[];
  
  public DiscoX() {
    setor = new char[1024];
    for ( int i=0 ; i<1024 ; i++ ) {
      setor[i] = '0';
    }
  }
  
  public void setSetor(int end, char b){
    try{
      setor[end] = b;
      System.out.println("Class: " + nomeDaClasse +" / Metodo: setSetor() / Param: end=" + end + " ; b=" + b);
    }catch(Exception e){
      System.out.println("Erro: " + e);
    }
  }

  public char getSetor(int end){
    char temp = '0';
    try{
      temp = setor[end];
      System.out.println("Class: " + nomeDaClasse +" / Metodo: getSetor() / Param: end=" + end);
    }catch(Exception e){
      System.out.println("Erro: " + e);
    }
    return temp;
  }
    
}
