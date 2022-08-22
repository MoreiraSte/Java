import java.util.Scanner;
public class OperaçoesTest {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
        
		System.out.println("\n Minhas Operações:\n");
		
		
        System.out.println("\nDigite o primeiro número:\n ");
        double n1 = leia.nextDouble();        
        
        System.out.println("\nDigite o segundo número:\n ");
        double n2 = leia.nextDouble();
        
        Operacoes calculos = new Operacoes();
        calculos.soma(n1, n2);
        calculos.subtracao(n1, n2);
        
        
    }

}


