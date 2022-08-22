/* Este programa trabalha com herança e possui subclasses com formas bidimencionais e tridimensionais,
 * calculando o perimetro do quadrado e o volume do cubo.
 * Feito : 18/05/21
 * 
 * Stephany Moreira Casa Grande ht3001946 Turma A
 */




import java.util.Scanner;
class Forma {
	
		
}
		class Bidimensional extends Forma{
			 
			 String quadrado ; 

}
		class Tridimensional extends Forma{
		
		     String cubo ; 

}
		class Quadrado extends Bidimensional{
			
			Scanner tec = new Scanner(System.in);
		    double lado,perimetro;
		    
		    public void perimetro(double lado)
		    {
		        
		    	  perimetro = 4*lado;
			        System.out.println("O perimetro do quadrado é: " +perimetro);
			        return ;
			    }	  	 
		        
}
		class Cubo extends Tridimensional{
			
			Scanner tec = new Scanner(System.in);
		    double aresta,volume;
		   
		    public void volume(double aresta)
		    {
		    	 
		    	volume = aresta*aresta*aresta;
		        System.out.println("O volume do cubo é: " +volume);
		        return ;
		    	 
		        
		       
		    }
		  
}
		
		
		
		