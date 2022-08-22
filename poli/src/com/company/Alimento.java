package com.company;

public abstract class Alimento {
    public String nome;
    public double peso;
    public String cor;
    public String origem;
    public int quantidade;
    private double kcal;
    public String tipo;
    public static int totalcozinhando;



    public Alimento(){

    }
    public abstract void cozinhar(boolean cozinhe);

    public Alimento(String nome, double peso, String cor, String origem, int quantidade, double kcal, String tipo) {
        this.nome = nome;
        this.peso = peso;
        this.cor = cor;
        this.origem = origem;
        this.quantidade = quantidade;
        this.kcal = kcal;
        this.tipo = tipo;
    }
    public abstract void calckcal();



    public double getKcal() {
        return kcal;
    }

    public void setKcal(double kcal) {
        this.kcal = kcal;
    }
}
