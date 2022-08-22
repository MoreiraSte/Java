package com.company;

public class Feijao extends Alimento{
    private String tipo;
    private boolean doce;



    public Feijao(String nome) {
        this.nome = nome;
    }


    @Override
    public void cozinhar(boolean cozinhe) {
        if (cozinhe){
            System.out.println("O "+ nome + " está cozinhando");}
        else{
            System.out.println("O " + nome + " não está cozinhando");
        }
        Alimento.totalcozinhando++;
    }

    @Override
    public void calckcal() {
        setKcal(getKcal()* 0.5);
    }

    public Feijao(String tipo, boolean doce) {
        this.tipo = tipo;
        this.doce = doce;
    }

    @Override
    public String toString() {
        return "Feijão{" +
                "nome='" + nome + '\'' +
                ", peso=" + peso +
                ", cor='" + cor + '\'' +
                ", origem='" + origem + '\'' +
                ", quantidade=" + quantidade +
                ", tipo='" + tipo + '\'' +
                ", tipo='" + tipo + '\'' +
                ", doce=" + doce +
                '}';
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean isDoce() {
        return doce;
    }

    public void setDoce(boolean doce) {
        this.doce = doce;
    }
}
