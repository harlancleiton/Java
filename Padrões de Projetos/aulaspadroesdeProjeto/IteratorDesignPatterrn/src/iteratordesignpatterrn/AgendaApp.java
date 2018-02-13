package iteratordesignpatterrn;

/**
 * Applica��o Demonstrando as classes : Pessoa e Pessoas
 */

public class AgendaApp {

	public static void main (String[] args) {
		/* Declarando e instanciando um objeto do tipo Pessoas */
				
					
	Jogos colecaojogos = new Jogos();
    
    
 int codigo = Keyboard.readInt();
    
 JogoInfantil jf = new JogoInfantil(codigo,"XXX",1);
    
    
    
    
    
    colecaojogos.insere(jf);
   
    colecaojogos.edita(jf.getNome(),2.0);		
    
    
    
    
    
    
    
    
     // colecaopessoas.remover(p2.getNome());		
 
 //     colecaopessoas.edita(p2.getNome(),"ana selma");		
      
      
    

    
		
	//System.out.println(" ");

	}
}