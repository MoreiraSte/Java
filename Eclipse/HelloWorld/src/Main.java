import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
			int idade;
			float altura;
			Scanner s = new Scanner (System.in);
			
			System.out.printf("\nDigite sua idade : ");
			idade = s.nextInt();
			
			
			
			if(idade >=18) {
				System.out.println("\nVocê é maior de idade,"+ idade +" anos");

			}
			else {
				System.out.println("Você é de menor");


			}

			System.out.printf("\nDigite sua altura : ");
			altura = s.nextFloat();
			
			System.out.println("\nSua altura eh,"+ altura +" metros");

			
			try {
				
				System.out.printf("\nDigite sua idade : ");
				idade = s.nextInt();
				
				
				if(idade >=18) {
					System.out.println("\nVocê é maior de idade,"+ idade +" anos");

				}
				else {
					System.out.println("Você é de menor");

				}
				
				System.out.printf("\nDigite sua altura : ");
				altura = s.nextFloat();
				
				System.out.println("Sua altura eh,"+ altura +"metros");
				
				
			}
			catch(Exception e){
				System.out.println("Valores invalidos");

			}
	}

}
