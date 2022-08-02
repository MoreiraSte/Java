import java.util.Scanner;

public class main{
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        int n, cont=0;
        System.out.print("Entre com um numero: ");
        n = s.nextInt();

        for(int x =0;x<n;x++){
            if (n%x == 0 && n%1 ==0){
                cont+=1;
               
            }
        }
        if (cont==2){
            System.out.printf("O numero %d eh primo",n);
               
            }
        else{
            System.out.printf("O numero %d nao eh primo",n);

        }
    }
}
