package iteratordesignpatterrn;

import java.util.ArrayList;
import java.util.Iterator;


public class Jogos {

	/* Declarando um objeto : arraylist de jogos */
	private ArrayList colecaojogos;


	public Jogos () {
		colecaojogos = new ArrayList();
		
	}
	
	
	
	public void insere (Jogo jog){
		    this.colecaojogos.add(jog);
	    
	}
		




 

								

	public Pessoa pesquisarNome(String endereco) {

	    Iterator it = pessoas.iterator();
	    
	    while (it.hasNext()){
	       				
	       Pessoa pes = (Pessoa)it.next();	    
		
		
		  if (pes.getEndereco().equals(endereco)){
		  
       		 return pes;
		  }
	    	
	    	
	    }
	      return null;
    }
  
   
   
    public void edita(String nome, double novaversao) {


	 for (int i = 0; i < this.colecaojogos.size(); i++ ) {
      
      Jogo jogaux = (Jogo) this.colecaojogos.get(i);
      if (jogaux.getNome().equals(nome))
        jogaux.setVersao(novaversao);
       }
    
    
    
  }









  
    public void editaTeste(String nome, String nomenovo) {

	    Iterator it = pessoas.iterator();
	    
	    while (it.hasNext()){
	       				
	       Pessoa pes = (Pessoa)it.next();	    
		
		
		  if (pes.getNome().equals(nome)){
		  
       		 pes.setNome(nomenovo);
		  }
    
  }
    }
  
  
  
   public void remover(String nome) {
  for (int i = 0; i < this.pessoas.size(); i++ ) {
      Pessoa pessoa = (Pessoa) this.pessoas.get(i);
      if (pessoa.getNome().equals(nome))
        this.pessoas.remove(i);
       
    }
    
   } 
  
    
  


	

		
		
	
	public String toString () {
      StringBuffer sb = new StringBuffer("Pessoas : ");
      for (int i = 0; i < this.pessoas.size(); i++ ) {
      Pessoa pessoa = (Pessoa) this.pessoas.get(i);
      sb.append(pessoa.toString());
    }
    return sb.toString();
  }
  
  
  

}