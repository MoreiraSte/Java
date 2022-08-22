package com.company;

public class Batata extends Alimento {
    public String naciolidade;
    public int tempoColheita;
    public int tempoCozimento;
    public boolean comivel;
    public static int qualidade;
    public static int totalBatatas;



    public Batata(){

    }

    @Override
    public void cozinhar(boolean cozinhe) {
        if (cozinhe){
            System.out.println("O "+ nome + "está cozinhando");}
        else{
            System.out.println("O " + nome + "não está cozinhando");
        }
        Alimento.totalcozinhando++;
    }

    public Batata(String nome, double peso, String cor, String origem, int quantidade, double kcal, String tipo, String naciolidade, int tempoColheita, int tempoCozimento, boolean comivel) {
        super(nome, peso, cor, origem, quantidade, kcal, tipo);
        this.naciolidade = naciolidade;
        this.tempoColheita = tempoColheita;
        this.tempoCozimento = tempoCozimento;
        this.comivel = comivel;
    }

    public Batata(String prattes) {
        this.nome = prattes;
    }

    public Batata(String nomeBatata, double kcalBatata) {
        this.nome = nomeBatata;
        this.setKcal(kcalBatata);
    }

   public void calckcal(){
       this.setKcal(getKcal() * 0.3);
   }

    @Override
    public String toString() {
        return "Batata{" +
                "nome='" + nome + '\'' +
                ", peso=" + peso +
                ", cor='" + cor + '\'' +
                ", origem='" + origem + '\'' +
                ", quantidade=" + quantidade +
                ", kcal=" + getKcal() +
                ", tipo='" + tipo + '\'' +
                ", naciolidade='" + naciolidade + '\'' +
                ", tempoColheita=" + tempoColheita +
                ", tempoCozimento=" + tempoCozimento +
                ", comivel=" + comivel +
                '}';
    }
}
