package commanddesignpattern;

public class ConcreteReceiver 
	implements Receiver {
	
	public void novo() {
		System.out.println("Novo arquivo...");
	}
	
	public void abrir() {
		System.out.println("Abrindo arquivo...");
	}
	public void fechar() {
		System.out.println("Fechando arquivo...");		
	}
	public void salvar() {
		System.out.println("Salvando arquivo...");		
	}
	public void salvarTodos() {
		System.out.println("Salvando totos os arquivos...");		
	}
}
