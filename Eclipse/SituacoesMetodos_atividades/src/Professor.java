import java.util.Scanner;
public class Professor {

	Scanner s = new Scanner(System.in);
		float nota1,nota2,nota3,nota4,media;
		
		public void calcularNotas() {
			
			System.out.printf("Digite a nota do 1° bimestre: ");
			nota1 = s.nextFloat();
			
			System.out.printf("Digite a nota do 2° bimestre: ");
			nota2 = s.nextFloat();
			
			System.out.printf("Digite a nota do 3° bimestre: ");
			nota3= s.nextFloat();
			
			System.out.printf("Digite a nota do 4° bimestre: ");
			nota4 = s.nextFloat();
			
			media = (nota1+nota2+nota3+nota4)/4;
			
			if(media>=6.0) {
				System.out.printf("Voce esta aprovado: %.2f ",media);
			}
			else
				System.out.printf("Voce foi reprovado: %.2f",media);
		}
		
}
