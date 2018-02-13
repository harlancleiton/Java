import java.util.*;

//Aluno é um Singleton

public class Aluno {
	private static Aluno aluno = null; 
	private String nome;
	private int idade;
	private int matricula;
	
		
	/*
	 *Não existe construtor público num Singleton
	 */
	private Aluno() {}    //  Inibe o construtor padrão
	
	private Aluno(String nome, int matricula) {
		this.nome = nome;
		this.matricula = matricula;
	}
	
	public static Aluno criaInstancia() {
		if (aluno == null) {
			aluno = new Aluno(); 
		} 
		return aluno; 
	} 

	public static Aluno criaInstancia(String nome, int matricula) {
		if (aluno == null) {
			aluno = new Aluno(nome, matricula); 
		} 
		return aluno; 
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






