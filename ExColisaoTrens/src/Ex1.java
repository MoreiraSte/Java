import java.util.Scanner;
import java.text.DecimalFormat;

public class Ex1 {
    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);
        double velA, velB, pA, pB, t, Sa, Sb, S, se = 0, h = 0, min = 0;
        String resp = "";

        while (!resp.equals("N") || !resp.equals("n")) {


            try {
                System.out.println("Entre com a velocidade do trem A: ");
                velA = s.nextDouble();
                System.out.println("Entre com a velocidade do trem B: ");
                velB = s.nextDouble();
                System.out.println("Entre com a posição do trem A: ");
                pA = s.nextDouble();
                System.out.println("Entre com a posição do trem B: ");
                pB = s.nextDouble();

                if (pB < pA) {
                    System.out.println("Os trens não se colidem");
                } else if (pA > 1000 && pA < 0) {
                    System.out.println("O numero deve ser maior ou igual a zero e menor que 1000, mas não negativo");
                }
                if (velA >= 0 || velB < 0 || pA >= 0 || pA <= 10.000 || pB >= 0 || pB <= 10.000) {
                    t = (pA - pB) / (velB - velA);
                    Sb = pB - (velB * t);
                    Sa = pA + (velA * t);
                    S = pA + (velA * t);
                    t = t*3600;
                    h = (17+t);
                    min = t * 60;
                    se = ((t*3600) / 100);

                    DecimalFormat df = new DecimalFormat();
                    df.applyPattern("0.00");
                    DecimalFormat horas = new DecimalFormat("#");
                    // dg.applyPattern("00:00:00");

                    System.out.print("A colisão dos trens acontecerá no KM " + df.format(S) + " ocorrerá após " + df.format(t) + " segundos. Às "
                            + horas.format(h) + ":" + horas.format(min) + ":" + horas.format(se)+ " horas.");
                } else {
                    System.out.println("A velocidade do trem A é positiva e a de trem B é negativa! As posições em KM precisam ser entre 0 e 10.000, sem ultrapassagem!");
                }
                System.out.println("Deseja executar novamente? [S/N]:  ");
                s.nextLine();
                resp = s.nextLine();
               // System.out.print("Hello");


                if (resp.equals("S") || resp.equals("s")) {
                    continue;

                } else if (resp.equals("N") || resp.equals("n")) {

                    System.out.println("Fim..");
                    break;

                } else {
                    System.out.println("Caracter inválido! Digite S para sim e N para não.");
                }
            } catch (Exception e) {
                System.out.println("Digite apenas numeros");
            }
        }



    }
}
