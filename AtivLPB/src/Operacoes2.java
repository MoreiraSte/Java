/* Stephany Moreira
 * Feito : 28/04/21
 */
import java.util.Scanner;
public class Operacoes2 {
		
	double resultado2 ;
	
	public void soma(double n1, double n2)
    {
        resultado2 = n1 + n2;
        System.out.println("O resultado da soma �: " + resultado2);
        return;
    }
    
    public void subtracao(double n1, double n2)
    {
        resultado2 = n1 - n2;
        System.out.println("O resultado da subtra��o �: " + resultado2);
        return;
    }
    
    public void mult(double n1, double n2)
    {
        resultado2 = n1 * n2;
        System.out.println("O resultado da multiplicacao �: " + resultado2);
        return;
    }
    public void divi(double n1, double n2)
    {
        resultado2 = n1 / n2;
        System.out.println("O resultado da divisao �: " + resultado2);
        return;
    }
    public void media(double n1, double n2)
    {
        resultado2 = (n1 + n2)/2;
        System.out.println("O resultado da media aritm�tica �: " + resultado2);
        return;
    }
    public void triangulo(double n1, double n2)
    {
        resultado2 = (n1 * n2)/2;
        System.out.println("O resultado da �rea do triangulo �: " + resultado2);
        return;
    }
    
	
}
