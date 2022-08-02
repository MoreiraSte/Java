import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Pessoas {

    public static void main (String[]args){


        List<String> nomes = new ArrayList<String>();

        nomes.add("Natasha");
        nomes.add("Steve");
        nomes.add("Buck");
        nomes.add("Challa");
        nomes.add("Tony");
        nomes.add("Groot");
        nomes.add("Gamora");
        nomes.add("Drax");
        nomes.add("Thor");
        nomes.add("Peter");
        nomes.add("Strange");
        nomes.add("Peter Quill");
        nomes.add("Feiticeira Escarlate");
        nomes.add("Gaviao Arqueiro");
        nomes.add("Hulk");
        nomes.add("Loki");

        Collections.shuffle(nomes);
        Random rand = new Random();

        int randomSeriesLength = 8;

        List<String> randomSeries = nomes.subList(0, randomSeriesLength);

        ImageIcon thanos = new ImageIcon("thanos.jpg");
        ImageIcon ving = new ImageIcon("ving.gif");
        ImageIcon peace = new ImageIcon("peace.gif");

        JOptionPane.showMessageDialog(null,"Thanos fez metade de nossos \n 16 heróis virar pó!","Se preparem",JOptionPane.INFORMATION_MESSAGE,thanos);
        JOptionPane.showMessageDialog(null, "Pronto para chorar?");
        JOptionPane.showMessageDialog(null,"Heróis que se tornaram pó:"+ "\n"+randomSeries,"Foi de base ;-;",JOptionPane.INFORMATION_MESSAGE,ving);
        JOptionPane.showMessageDialog(null,"Agora ele esta indo para outro planeta\ndescansar ao ver um universo agradecido!","Ainda bem que morreu no Ultimato",JOptionPane.INFORMATION_MESSAGE,peace);

        

    }
}

