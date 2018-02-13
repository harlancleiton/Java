import java.util.*;

public class TestaSingletonMapa {

	public static void main(String args[]) {
		Aluno a1, a2;
		
		a1 = Aluno.criaInstancia("Aluno 1", 50);

		a1.setIdade(50);


		System.out.println("Aluno: "+ a1);
		
        a2 = Aluno.criaInstancia("Aluno 2", 100);
		
		
		System.out.println("Aluno: "+ a1);		
		System.out.println("Aluno: " + a2);		
				
		a2.setIdade(25);
		System.out.println("Modificando a idade do segundo aluno");
		System.out.println("Aluno: "+ a1);		
		System.out.println("Aluno: " + a2);		
		
		
	}
}