/* Stephany Moreira
 * Feito : 28/04/21
 */
import java.util.Scanner;
public class Operacoes2 {
		
	double resultado2 ;
	
	public void soma(double n1, double n2)
    {
        resultado2 = n1 + n2;
        System.out.println("O resultado da soma é: " + resultado2);
        return;
    }
    
    public void subtracao(double n1, double n2)
    {
        resultado2 = n1 - n2;
        System.out.println("O resultado da subtração é: " + resultado2);
        return;
    }
    
    public void mult(double n1, double n2)
    {
        resultado2 = n1 * n2;
        System.out.println("O resultado da multiplicacao é: " + resultado2);
        return;
    }
    public void divi(double n1, double n2)
    {
        resultado2 = n1 / n2;
        System.out.println("O resultado da divisao é: " + resultado2);
        return;
    }
    public void media(double n1, double n2)
    {
        resultado2 = (n1 + n2)/2;
        System.out.println("O resultado da media aritmética é: " + resultado2);
        return;
    }
    public void triangulo(double n1, double n2)
    {
        resultado2 = (n1 * n2)/2;
        System.out.println("O resultado da área do triangulo é: " + resultado2);
        return;
    }
    
	
}
