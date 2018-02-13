package BancoDeDados;

import java.util.ArrayList;

public class Bandas {
    private String nome;
    private Data dataFundacao;
    private ArrayList<Componentes> componentes = new ArrayList<>();
    
    public String toString(){
        return this.getNome();
    }
    public String imprimirData(){
        return dataFundacao.getDia()+"/"+dataFundacao.getMes()+"/"+dataFundacao.getAno();
    }
    public void adicionarComponente(Componentes componente){
        componentes.add(componente);
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Data getDataFundacao() {
        return dataFundacao;
    }
    public void setDataFundacao(Data dataFundacao) {
        this.dataFundacao = dataFundacao;
    }
    public ArrayList<Componentes> getComponentes() {
        return componentes;
    }
    public void setComponentes(ArrayList<Componentes> componentes) {
        this.componentes = componentes;
    }
}