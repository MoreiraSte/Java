package com.company;

public class Chocolate extends Alimento{
    public String marca;
    public double porcentagemCacau;
    public String tipo;
    public boolean diet;

    public Chocolate(String nome, double peso, String cor, String origem, int quantidade, double kcal, String tipo, String marca, double porcentagemCacau, String tipo1, boolean diet) {
        super(nome, peso, cor, origem, quantidade, kcal, tipo);
        this.marca = marca;
        this.porcentagemCacau = porcentagemCacau;
        this.tipo = tipo1;
        this.diet = diet;
    }

    public Chocolate() {

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

    public Chocolate(String nomeChoco) {
        this.nome = nomeChoco;
    }

    public Chocolate(String nomeChoco, double kcal) {
        this.nome = nomeChoco;
        this.setKcal(kcal);
    }
    public void calckcal(){
        this.setKcal(this.getKcal() * 1.5);
    }
    @Override
    public String toString() {
        return "Chocolate{" +
                "nome='" + nome + '\'' +
                ", peso=" + peso +
                ", cor='" + cor + '\'' +
                ", origem='" + origem + '\'' +
                ", quantidade=" + quantidade +
                ", kcal=" + getKcal() +
                ", tipo='" + tipo + '\'' +
                ", marca='" + marca + '\'' +
                ", porcentagemCacau=" + porcentagemCacau +
                ", tipo='" + tipo + '\'' +
                ", diet=" + diet +
                '}';
    }

}
