import java.util.Scanner;
public class Opera�oesTest {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
        
		System.out.println("\n Minhas Opera��es:\n");
		
		
        System.out.println("\nDigite o primeiro n�mero:\n ");
        double n1 = leia.nextDouble();        
        
        System.out.println("\nDigite o segundo n�mero:\n ");
        double n2 = leia.nextDouble();
        
        Operacoes calculos = new Operacoes();
        calculos.soma(n1, n2);
        calculos.subtracao(n1, n2);
        
        
    }

}


