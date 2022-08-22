package com.company;

public class BatataBk extends Batata {
    public boolean promocao;
    public char tamanho;
    public String molho;

    public BatataBk(){
        Batata.totalBatatas++;
    }
    public BatataBk(boolean promocao, char tamanho, String molho) {
        Batata.totalBatatas++;
        this.promocao = promocao;
        this.tamanho = tamanho;
        this.molho = molho;

    }

    public BatataBk(String nome, double peso, String cor, String origem, int quantidade, double kcal, String tipo, String naciolidade, int tempoColheita, int tempoCozimento, boolean comivel, boolean promocao, char tamanho, String molho) {
        super(nome, peso, cor, origem, quantidade, kcal, tipo, naciolidade, tempoColheita, tempoCozimento, comivel);
        this.promocao = promocao;
        this.tamanho = tamanho;
        this.molho = molho;
    }

}
