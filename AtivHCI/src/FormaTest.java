/* Este programa trabalha com herança e possui subclasses com formas bidimencionais e tridimensionais,
 * calculando o perimetro do quadrado e o volume do cubo.
 * Feito : 18/05/21
 * 
 * Stephany Moreira Casa Grande ht3001946 Turma A
 */


import java.util.Scanner;

public class FormaTest {

	public static void main(String[] args) {
         Scanner leia = new Scanner(System.in);
        
		System.out.println("\n Minhas Operações:\n");
		
		
        System.out.println("\nInforme do valor do lado do quadrado:\n ");
        double lado = leia.nextDouble();        
        
        System.out.println("\nInforme do valor da aresta do cubo:\n ");
        double aresta = leia.nextDouble();
        
        Quadrado calculos = new Quadrado();
        calculos.perimetro(lado);
        
        Cubo calculos2 = new Cubo();
        calculos2.volume(aresta);
        
        
    }
}
