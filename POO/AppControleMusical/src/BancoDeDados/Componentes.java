package BancoDeDados;

public class Componentes {
    private String nome, funcao, sexo;
    private Data dataNascimento;
    private Bandas banda;
    
    public String toString(){
        return this.getNome() + " - " + this.getFuncao()+"\n";
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getFuncao() {
        return funcao;
    }
    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public Data getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(Data dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    public Bandas getBanda() {
        return banda;
    }
    public void setBanda(Bandas banda) {
        this.banda = banda;
    }
}