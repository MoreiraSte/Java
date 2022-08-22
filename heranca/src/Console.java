import java.util.Scanner;

public class Console {
    static Scanner s = new Scanner(System.in);

    public static double lerNumero(String msg,int min, int max) {

        double var1 = 0;
        while (true) {
            System.out.print(msg);
            var1 = s.nextDouble();
            if (min < var1 && var1 < max)
                break;
            System.out.println("Digite o numero entre" +min+ "e" +max);


        }
        return var1;
    }
}
