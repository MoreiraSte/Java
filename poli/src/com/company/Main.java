package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        BatataBk btt = new BatataBk();
//        System.out.println("Quantidade de  Batatas: " + Batata.totalBatatas);
//        BatataBk btt2 = new BatataBk();
//      System.out.println("Quantidade de Batatas " + Batata.totalBatatas);
//        String nomeBatata;
//        double kcalBatata;
//        System.out.println("Digite o nome da batata: ");
//        nomeBatata = scanner.next();
//        System.out.println("Digite as calorias da batata: ");
//        kcalBatata = scanner.nextDouble();
//        Batata batata = new Batata(nomeBatata,kcalBatata);
//        System.out.println(Batata.qualidade);
//        Batata.qualidade = 10;
//        System.out.println(Batata.qualidade);
//        System.out.println("Digite a nacionalidade da batata: ");
//        batata.naciolidade = scanner.next();
//        System.out.println("Digite o tempo de colheita: ");
//        batata.tempoColheita = scanner.nextInt();
//        System.out.println("Digite o tempo de cozimento: ");
//        batata.tempoCozimento = scanner.nextInt();
//        System.out.println("A batata é comivel? s/n");
//        String op = scanner.next();
//        if (op.toLowerCase(Locale.ROOT).equals("s")){
//            batata.comivel = true;
//        }
//        System.out.println(batata);
//        batata.calckcal();
//        System.out.println(batata);
//
//
//        String nomeChoco;
//        double kcal;
//        System.out.println("Digite o nome do chocolate: ");
//        nomeChoco = scanner.next();
//        System.out.println("Digite as calorias do chocolate: ");
//        kcal = scanner.nextDouble();
//        Chocolate chocolate = new Chocolate(nomeChoco,kcal);
//        System.out.println("Digite a marca do chocolate: ");
//        chocolate.marca = scanner.nextLine();
//        System.out.println("Digite a porcentagem do chocolate: ");
//        chocolate.porcentagemCacau = scanner.nextDouble();
//        System.out.println("Digite o tipo do chocolate: ");
//        chocolate.tipo = scanner.next();
//        System.out.println("O chocolate é diet? S/N");
//        String op1 = scanner.next();
//        if (op1.toLowerCase(Locale.ROOT).equals("s")){
//            chocolate.diet = true;
//        }
//        System.out.println(chocolate);
//        chocolate.calckcal();
//        System.out.println(chocolate);
        String nome;
        System.out.println("Digite o nome do feijão: ");
        nome = scanner.next();
        Feijao feijão = new Feijao(nome);
        System.out.println("Digite o tipo do feijão: ");
        feijão.setTipo(scanner.next());
        System.out.print("O feijão é doce? s/n");
        String op3 = scanner.next();
        if (op3.toLowerCase(Locale.ROOT).equals("s")){
            feijão.setDoce(true);
        }
        System.out.println("O feijão está cozinhando? s/n ");
        String op4 = scanner.next();
        boolean op = false;
        if (op4.toLowerCase(Locale.ROOT).equals("s")){
            op = true;
        }
        feijão.cozinhar(op);
        System.out.println(Feijao.totalcozinhando);
        System.out.println(feijão);

    }
}
