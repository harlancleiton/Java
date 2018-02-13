package iteratordesignpatterrn;

/**
 * Classe modelando Pessoa com o objetivo de demonstrar os seguintes
 * conceitos de orienta��o a objetos : Classe, Encapsulamento e Membros
 * (Atributos e M�todos)
 */


/* Defini��o da classe */
public class Pessoa {
	/* Corpo da classe */

	/* Atributos da classe */
	private String nome;	 //Nome da Pessoa
	private String endereco; //Endere�o da Pessoa
	private String telefone; //Telefone da Pessoa

	/* M�todos da classe */
	/* Construtor */
	public Pessoa(String nome, String endereco, String telefone) {
		setNome(nome);
		setEndereco(endereco);
		setTelefone(telefone);
	}

	/* M�todos para leitura e escrita dos atributos */

	public void setNome (String nome) {
		this.nome = nome;
	}

	public void setEndereco (String endereco) {
		this.endereco = endereco;
	}

	public void setTelefone (String telefone) {
		this.telefone = telefone;
	}

	public String getNome () {
		return nome;
	}

	public String getEndereco () {
		return endereco;
	}

	public String getTelefone () {
		return telefone;
	}

	/* M�todo que escreve os atributos da pessoa na sa�da padr�o */
	public void escreve() {
		System.out.print(nome + " | " + endereco + " | " + telefone);
	}
	
   public String toString () {
    return "[" + this.getNome() + "," + this.getEndereco() + "]";
  }

		
}