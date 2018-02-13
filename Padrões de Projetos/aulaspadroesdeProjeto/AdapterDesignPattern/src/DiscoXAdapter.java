

public class DiscoXAdapter implements DiscoIF{

  private DiscoX dx = new DiscoX();

  protected String nomeDaClasse = "DiscoXAdapter";

  public char getBloco(int end) {
     System.out.println(nomeDaClasse + "Executando getBloco adaptado de getSetor");
     return dx.getSetor(end);
  }
  
 
  
  public void setBloco(int end, char b) {
     System.out.println(nomeDaClasse + "Executando setBloco adaptado de setSetor");  	
     dx.setSetor(end, b);
  }
  
}
