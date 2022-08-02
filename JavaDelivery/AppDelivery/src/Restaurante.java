


import java.util.ArrayList;
import java.util.Scanner;

public class Restaurante {
    public String preco;
    String nome;
    String cnpj;
    String x,y;

    ArrayList<Lanche> cardapio = new ArrayList<>();

    public Restaurante(String nome, String cnpj, String x,String y){
        this.nome = nome;
        this.cnpj = cnpj;
        this.x = x;
        this.y = y;
    }

    public Restaurante() {

    }

    void imprimirCardapio(){


        for(int i = 0; i<cardapio.size(); i++){
            System.out.println(i+ " - " + cardapio.get(i).nomeLanche + " - R$ " + cardapio.get(i).preco);
        }

    }

    void adicionarLanche(Lanche lanche){
        cardapio.add(lanche);
    }

    void removerLanche(int lanche){
        cardapio.remove(lanche);
    }


}
