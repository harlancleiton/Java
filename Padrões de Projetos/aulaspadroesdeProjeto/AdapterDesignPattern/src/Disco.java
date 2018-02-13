
public class Disco implements DiscoIF{
  
  
  protected String nomeDaClasse = "Disco";
  
  char blocos[];
  public Disco() {
    blocos = new char[1024];
    for ( int i=0 ; i<1024 ; i++ ) {
      blocos[i] = '0';
    }
  }
  public void setBloco(int end, char b){
    try{
      blocos[end] = b;
      System.out.println("Class: " + nomeDaClasse +" / Metodo: setBloco() / Param: end=" + end + " ; b=" + b);
    }catch(Exception e){
      System.out.println("Erro: " + e);
    }
  }

  public char getBloco(int end){
    char temp = '0';
    try{
      temp = blocos[end];
      System.out.println("Class: " + nomeDaClasse +" / Metodo: getBloco() / Param: end=" + end);
    }catch(Exception e){
      System.out.println("Erro: " + e);
    }
    return temp;
  }
    
}
