import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Pedido {


    Usuario usuario ;
    Restaurante restaurante;
    ArrayList<Lanche> pedidoFeitos = new ArrayList<>();


    public Pedido(Usuario usuario, Restaurante restaurante) {
        this.usuario = usuario;
        this.restaurante = restaurante;
    }

    void fazerPedido(int escolha){
        System.out.println("Escolha o Lanche: ");
        pedidoFeitos.add(restaurante.cardapio.get(escolha));
    }

    void imprimirPedido(){
        float total = 0 ;

        for(Lanche lanche: pedidoFeitos){
            total=total+lanche.preco;
            System.out.printf(">>> %s ------- %f \n",lanche.nomeLanche,lanche.preco);

        }
        System.out.printf("\n>>> %f ",total);

    }



//    ArrayList<Integer> pedido = new ArrayList<>();
//
//    public Pedido() {
//
//    }
//
//    public ArrayList fazerPedido(ArrayList<Usuario> usuarios, ArrayList<Restaurante>restaurantes){
//        Scanner entrada = new Scanner(System.in);
//
//        //escolher usuario
//        for(int i = 0;i<usuarios.size();i++){
//            System.out.println(i+ " - nome: " + usuarios.get(i).nome );
//            //+ "\n - CPF: " + usuarios.get(i).cpf + "\n - Endereço: " + usuarios.get(i).end);
//            //System.out.println("--------------------------------------------------");
//        }
//        System.out.println("Escolha o úsuario: ");
//        int userEscolhido = entrada.nextInt();
//
//        //pedido.add(userEscolhido);
//
//        // escolher restaurante
//        for(int i = 0;i<restaurantes.size();i++){
//            System.out.println(i+ " - " + restaurantes.get(i).nome);
//        }
//        System.out.println("Escolha o restaurante: ");
//        int restauranteEsc = entrada.nextInt();
//
//        //pedido.add(restauranteEsc);
//
//        //escolher lanche
//        System.out.println("CARDÁPIO DE " + restaurantes.get(restauranteEsc).nome.toUpperCase(Locale.ROOT)+ "\n");
//        restaurantes.get(restauranteEsc).imprimirCardapio();
//
//        System.out.println("Escolha o item :");
//        int itemEsc = entrada.nextInt();
//
//        //lanches.add(restaurantes.get(restauranteEsc).cardapio.get(itemEsc));
//
//        pedido.add(userEscolhido);
//        pedido.add(restauranteEsc);
//        pedido.add(itemEsc);
//
//        return pedido;
//    }


}
