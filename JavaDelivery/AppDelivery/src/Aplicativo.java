

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Aplicativo {

    ArrayList<Usuario> usuarios = new ArrayList<>();
    ArrayList<Restaurante> restaurantes = new ArrayList<>();
    ArrayList<Integer> pedido = new ArrayList<>();
    ArrayList<Lanche> lanches = new ArrayList<>();

    ArrayList<Pedido>pedidos= new ArrayList<>();


    public void menu() {
        Scanner s = new Scanner(System.in);
        int op = 1;

        while (op != 0) {
            System.out.println("\n1-Cadastrar Restaurante");
            System.out.println("\n2-Cadastrar Usuario");
            System.out.println("\n3-Cadastrar item ao cardapio");
            System.out.println("\n4-Remover item do cardapio");
            System.out.println("\n5-Fazer pedido");
            System.out.println("\n6-Imprimir nota fiscal");
            System.out.println("\n7-Sair");
            System.out.println("\nEscolha :");
            op = s.nextInt();

            if (op == 1 ){
                cadastrarRestaurante();
            }

            if (op == 2){
                cadastrarUsuario();
            }

            if (op == 3){
               for(int i = 0;i<restaurantes.size();i++){
                   System.out.println(i+ " - " + restaurantes.get(i).nome);
               }
                System.out.println("Escolha o restaurante que voce quer adicionar o item:");

                int resEscolhido = s.nextInt();

                System.out.println("CARDÁPIO DE " + restaurantes.get(resEscolhido).nome.toUpperCase(Locale.ROOT)+ "\n");

                s.nextLine();
                System.out.println("\nNome do lanche: ");
                String nomeLanche = s.nextLine();

                System.out.println("\nPreço do lanche: ");
                float preco = s.nextFloat();

                Lanche itADD = new Lanche(nomeLanche,preco);
                restaurantes.get(resEscolhido).adicionarLanche(itADD);


                restaurantes.get(resEscolhido).imprimirCardapio();

            }

            if (op == 4){
                for(int i = 0;i<restaurantes.size();i++){
                    System.out.println(i+ " - " + restaurantes.get(i).nome);
                }
                System.out.println("Escolha o restaurante :");

                int resEscolhido2 = s.nextInt();

                System.out.println("CARDÁPIO DE " + restaurantes.get(resEscolhido2).nome.toUpperCase(Locale.ROOT)+ "\n");
                restaurantes.get(resEscolhido2).imprimirCardapio();

                System.out.println("Escolha o item :");
                int resEscolhido3 = s.nextInt();

                restaurantes.get(resEscolhido2).removerLanche(resEscolhido3);


            }

            if (op == 5){
                Scanner entrada = new Scanner(System.in);

                //escolher usuario
                for(int i = 0;i<usuarios.size();i++){
                    System.out.println(i+ " - nome: " + usuarios.get(i).nome );
                    //+ "\n - CPF: " + usuarios.get(i).cpf + "\n - Endereço: " + usuarios.get(i).end);
                    //System.out.println("--------------------------------------------------");
                }
                System.out.println("Escolha o úsuario: ");
                int userEscolhido = entrada.nextInt();

                //pedido.add(userEscolhido);

                // escolher restaurante
                for(int i = 0;i<restaurantes.size();i++){
                    System.out.println(i+ " - " + restaurantes.get(i).nome);
                }
                System.out.println("Escolha o restaurante: ");
                int restauranteEsc = entrada.nextInt();

                //pedido.add(restauranteEsc);

                //escolher lanche
                System.out.println("CARDÁPIO DE " + restaurantes.get(restauranteEsc).nome.toUpperCase(Locale.ROOT)+ "\n");
                restaurantes.get(restauranteEsc).imprimirCardapio();

                System.out.println("Escolha o item :");
                int itemEsc = entrada.nextInt();

                //lanches.add(restaurantes.get(restauranteEsc).cardapio.get(itemEsc));

                Pedido p = new Pedido(usuarios.get(userEscolhido),restaurantes.get(restauranteEsc));
                System.out.println();
                p.fazerPedido(itemEsc);
                pedidos.add(p);



            }

            if (op == 6){

                    System.out.println("||||||||||||||||NOTA FISCAL|||||||||||||||||");

              pedidos.get(0).imprimirPedido();
            }
            if (op == 7){
                break;
            }

        }
    }

    public void cadastrarRestaurante(){
        Scanner s = new Scanner(System.in);

        System.out.println("Nome do restaurante: ");
        String nome = s.nextLine();

        System.out.println("CNPJ: ");
        String cnpj = s.nextLine();

        System.out.println("Posição x: ");
        String x  =s.nextLine();

        System.out.println("Posição y: ");
        String y = s.nextLine();

        Restaurante r = new Restaurante(nome,cnpj,x,y);
        restaurantes.add(r);



        for (Restaurante rest: restaurantes){

            System.out.println("|||||||||||||||||||||||||||||||");
            System.out.println("Restaurante: " +rest.nome);
            System.out.println("CNPJ: " +rest.cnpj);
            System.out.println("Posição x: " +rest.x);
            System.out.println("Posição y: " + rest.y);
            System.out.println("|||||||||||||||||||||||||||||||");
        }

    }
    public void cadastrarUsuario(){

        Scanner s = new Scanner(System.in);

        System.out.println("Nome: ");
        String nome = s.nextLine();

        System.out.println("CPF: ");
        String cpf = s.nextLine();

        System.out.println("Endereço entrega: ");
        String end = s.nextLine();

        Usuario u = new Usuario(nome, cpf, end);
        usuarios.add(u);

        for (Usuario user : usuarios){
            System.out.println("||||||||||||||||||||||||||");
            System.out.println("Nome: " +user.nome);
            System.out.println("CPF: " +user.cpf);
            System.out.println("Endereço: " +user.end);
            System.out.println("||||||||||||||||||||||||||");

        }


    }
}
