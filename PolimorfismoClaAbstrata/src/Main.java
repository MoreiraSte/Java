import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main (String[]args){

        System.out.println("Feijão:\n\n");

        Scanner s  =new Scanner(System.in);
        String nomeFeijao = "";
        System.out.println("Insira o nome: ");
        nomeFeijao = s.next();

        Feijao feifei = new Feijao(nomeFeijao);

        System.out.println("digite a caloria do feijão: ");
        feifei.setKcal(s.nextDouble());

        System.out.println("digite o tipo: ");
        feifei.setTipo(s.next());

        System.out.println("digite a origem: ");
        feifei.setOrigem(s.next());



//        System.out.println("Batata:\n\n");
//
//        BatataBK wil = new BatataBK();
//        System.out.println("Quantidade batatas: "+ Batata.totalDeBatatas);
//
//        Scanner s  =new Scanner(System.in);
//        String nomeBatata = "";
//        System.out.println("Insira o nome: ");
//        nomeBatata = s.next();
//
//        Batata batata = new Batata(nomeBatata);
//
//        System.out.println(Batata.qualidade);
//        Batata.qualidade = 10;
//        System.out.println(Batata.qualidade);
//
//        System.out.println("digite a caloria da batata: ");
//        batata.setKcal(s.nextDouble());
//
//        System.out.println("Insira a nacionalidade: ");
//        batata.nacionalidade = s.next();
//
//        System.out.println("Insira o tempo de colheita: ");
//        batata.tempoColheita = s.nextInt();
//
//        System.out.println("Insira o tempo de cozimento: ");
//        batata.tempoCozimento = s.nextInt();
//
//        System.out.println("A batata esta comestivel? (S/N)");
//        String resposta = s.next();
//        if (resposta.toUpperCase().equals("S")){
//            batata.comestivel = true;
//        }
//
//       // System.out.println(batata);
//        batata.calcKcal();
//        System.out.println(batata);
//        System.out.println("Chocolate:\n\n");
//
//        Scanner s2  =new Scanner(System.in);
//        String nomeChocolate = "";
//        System.out.println("Insira o nome: ");
//        nomeChocolate = s2.next();
//
//        Chocolate choc = new Chocolate(nomeChocolate);
//
//
//
//
//        System.out.println("Insira a marca: ");
//        choc.marca = s2.next();
//
//        System.out.println("Porcentagem de cacau: ");
//        choc.porcentagemCacau = s2.nextDouble();
//
//        System.out.println("Insira o tipo: ");
//        choc.tipo = s2.next();
//
//        System.out.println("Insira as calorias do chocolate: ");
//        choc.setKcal(s2.nextDouble());
//
//        System.out.println("é diet? (S/N)");
//        String resposta2 = s2.next();
//        if (resposta2.toUpperCase().equals("S")){
//            choc.diet = true;
//        }
//
//
//        System.out.println(choc);
//        choc.calcKcal();
//        System.out.println(choc);

   }
}
