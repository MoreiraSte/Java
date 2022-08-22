import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class main {
    public static void main (String[]args) throws IOException {
        //log = o que acontece no nosso programa

        ArrayList<String> logs = new ArrayList<>();
        logs.add("Programa iniciado"+ LocalDateTime.now());

        System.out.println(Mensagens.BemVindo.getMsg());

        Scanner input = new Scanner(System.in);

        System.out.println("Qual o nome da lista ? ");
        String nomeLista = input.nextLine();

        ArrayList<String> conteudo = new ArrayList<>();
        int  x = 0;
        while(x != 4) {
            System.out.println("Valores da lista " + nomeLista + ": ");
            String valores = input.nextLine();
            conteudo.add(valores);
            logs.add(valores+ "Adicionado na lista, as "+LocalDateTime.now());

            int x2 =0;
            System.out.println("Deseja adicionar outro valor? [1-sim/2-nao]: ");
            x2 = input.nextInt();
            input.nextLine();
            if (x2 == 1){
                continue;
            }
            if (x2 == 2) {
                break;
            }

        }

        System.out.println("Digite o nome do arquivo: ");
        String nomeArquivo = input.nextLine();

        System.out.println("Digite" + Opcoes.NAO.getValue()+"para nao e" + Opcoes.SIM.getValue()+" para sim: ");
        int op = input.nextInt();


            if (op == Opcoes.NAO.getValue()){
                System.out.println("Usuario escolheu o: nao");

            }
            else if(op == Opcoes.SIM.getValue()){

                ManipularTxt arquivo =new ManipularTxt();
                arquivo.gravarTxt(nomeArquivo,conteudo);
                System.out.println("Usuario escolheu o: sim");

            }
            else {
                System.out.println("Digite" + Opcoes.NAO.getValue() + "para nao e" + Opcoes.SIM.getValue() + " para sim");

            }
        logs.add("Programa finalizado"+ LocalDateTime.now());
            EscreverLog escreve = new EscreverLog();
            escreve.escrever(logs);

    }
}
