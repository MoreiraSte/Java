import java.util.Scanner;
public class Operacoes2Test {
   
	public static void main(String[] args) {
	 
       double n1;
       double n2;
		Scanner leia = new Scanner(System.in);
        
		System.out.println("\n Nesse programa podem ser calculados : soma,subtra��o,divis�o,m�dia aritmica,�rea do tri�ngulo");
		
		
        System.out.println("\nDigite o primeiro n�mero(base):\n ");
         n1 = leia.nextDouble();        
        
        System.out.println("\nDigite o segundo n�mero(altura):\n ");
         n2 = leia.nextDouble();
        
        Operacoes2 a = new Operacoes2();
        a.soma(n1, n2);
        a.subtracao(n1, n2);
        a.mult(n1, n2);
        a.divi(n1 , n2);
        a.media(n1, n2);
        a.triangulo(n1, n2);

        
	}
}
