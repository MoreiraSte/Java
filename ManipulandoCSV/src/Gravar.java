import javax.swing.*;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Gravar {
    // salvar dados no csv
    public void salvarCSV() throws IOException {
        List<String> listaColunas = new ArrayList<>();
        List<String> listaLinhas = new ArrayList<>();
        List<List<String>> listaTudo = new ArrayList<>();


        while(true){

            String selecionar = JOptionPane.showInputDialog(null,"Deseja adicionar uma coluna ou uma linha? (escreva corretamente)");

            if (selecionar.toLowerCase(Locale.ROOT).equals("coluna")){

                int colunaQtd = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite a quantidade de coluna: "));
                for (int i = 0; i < colunaQtd; i++) {

                    String coluna = JOptionPane.showInputDialog(null,"Digite o nome da coluna:").toLowerCase(Locale.ROOT);

                    listaColunas.add(coluna);

                }

            }
            if (selecionar.toLowerCase(Locale.ROOT).equals("linha")){

                int linhaQtd = Integer.parseInt(JOptionPane.showInputDialog("Quantas linhas quer adicionar? "));

                for (int i = 0; i < linhaQtd; i++) {

                    String linha = JOptionPane.showInputDialog(null, "Digite os dados da linha: ");
                    listaLinhas.add(linha); 
                }
            }
            String resposta = JOptionPane.showInputDialog(null,"Deseja sair ou adicionar ? (escreva corretamente) ");

            if (resposta.toLowerCase(Locale.ROOT).equals("sair")){

                Path caminho = Paths.get("registros.csv");
                listaTudo.add(listaColunas);


                for (int i = 0; i < listaLinhas.size(); i++) {
                    listaTudo.add(listaLinhas[i]);
                }

                Files.write(caminho,listaTudo, StandardCharsets.UTF_8);

                break;

            }
            if(resposta.toLowerCase(Locale.ROOT).equals("adicionar")){
                continue;
            }

        }

//        List<String> lista = new ArrayList<>();
//        lista.add("Nome, Idade, CPF");
//        lista.add("Wilson, 19, 12333345");
//        lista.add("Igor, 20, 4679206587");
//
//        Path caminho = Paths.get("dados.csv");
//
//        Files.write(caminho,lista, StandardCharsets.UTF_8);
    }

}
