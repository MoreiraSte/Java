import java.util.Arrays;
import java.util.Scanner;

public class Validator {
    public static void main(String[] args){

        int numCpf, ultDigito,num,cont=10,cont2 =11,soma=0,soma2=0;
        long cpfInteiro = 0;

        int d1 = 0;
        int d2 = 0;
        int[] cpf = new int[11];
        String cpfString;

        System.out.println("Digite seu CPF: ");

        Scanner s = new Scanner(System.in);
        numCpf = s.nextInt();


        // Calculando 1° digito
        for(int i = 8; i > -1; i--){
            ultDigito = numCpf % 10;
            cpf[i] = ultDigito;
            numCpf /= 10;
        }
        for(int x:cpf){
            num = x * cont;
            soma += num;
            cont -= 1;
        }
        d1 = 11 - (soma%11);

        if (d1>9){
            d1 = 0;
            cpf[9] =d1;
        }
        else {

            cpf[9] = d1;
        }
        //Calculando 2° digito
        for(int x:cpf){
            num = x * cont2;
            soma2 += num;
            cont2 -= 1;
        }
       d2 = 11-(soma2%11);

        if (d2>9){
            d2 = 0;
            cpf[10] = d2;
        }
        else {
            cpf[10] = d2;
        }
        for (int i = 0; i <= 10; i++){
            cpfInteiro *= 10;
            cpfInteiro += cpf[i];
        }
        cpfString = Long.toString(cpfInteiro);
        System.out.println(cpfString.substring(0, 3) + "." + cpfString.substring(3, 6) + "." + cpfString.substring(6, 9) + "-" + cpfString.substring(9, 11));

    }
}

