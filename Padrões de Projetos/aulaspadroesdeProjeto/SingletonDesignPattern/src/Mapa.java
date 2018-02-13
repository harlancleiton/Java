import java.util.*;

//Aluno é um Singleton

public class Mapa {
	
    
    
        private static Mapa mapa = null;
	private String cidade;
	private int codigo;
	private int escala;
	
		
	/*
	 *Não existe construtor público num Singleton
	 */
	
	
	private Mapa(String cidade, int codigo, int escala) {
		...
	}

        public static Mapa obterInstancia(String cidade, int codigo, int escala) {
		if (mapa == null) {
			mapa = new Mapa(cidade,codigo,escala);
		} 
		return mapa;
	} 
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getNome() {
		return this.nome;
	}
	
	public int getIdade() {
		return this.idade;
	}

	public void setMatricula(int mat) {
		this.matricula = mat;
	}
	
	public int getMatricula() {
		return this.matricula;
	}
	
	public String toString() {
		return "Nome: " + nome + " Idade: "+ idade + " Matricula: " + matricula;
	}
}






