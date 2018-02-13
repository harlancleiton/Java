package BancoDeDados;

import java.util.ArrayList;

public class Musicas {
    private String nome;
    private Bandas banda;
    private int ano, duracaoMin, duracaoSeg;
    private ArrayList<Bandas> bandas=new ArrayList<>();
    
    public String toString(){
        return this.banda.getNome()+" - "+this.getNome();
    }
    public void adcionarBanda(Bandas banda){
        getBandas().add(banda);
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Bandas getBanda() {
        return banda;
    }
    public void setBanda(Bandas banda) {
        this.banda = banda;
    }
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    public int getDuracaoMin() {
        return duracaoMin;
    }
    public void setDuracaoMin(int duracaoMin) {
        this.duracaoMin = duracaoMin;
    }
    public int getDuracaoSeg() {
        return duracaoSeg;
    }
    public void setDuracaoSeg(int duracaoSeg) {
        this.duracaoSeg = duracaoSeg;
    }
    public ArrayList<Bandas> getBandas() {
        return bandas;
    }
    public void setBandas(ArrayList<Bandas> bandas) {
        this.bandas = bandas;
    }
}