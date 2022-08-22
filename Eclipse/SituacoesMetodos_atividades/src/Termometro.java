import java.util.Scanner;
public class Termometro {

		Scanner s = new Scanner(System.in);
		float celsius;
		
		
		public void medir() {
			
			System.out.printf("Digite sua temperatura: ");
			celsius = s.nextFloat();
			
			if(celsius>36 && celsius<37.5) {
				System.out.printf("Temperatura normal ");

			}
			else if(celsius<=35) {
				System.out.printf("Hipotermia");

			}
			else if(celsius>=37.6 && celsius>=39.5) {
				System.out.printf("Febre");

			}
			else if(celsius>=39.6 && celsius<=41) {
				System.out.printf("Febre alta");

			}
			else if(celsius>= 41) {
				System.out.printf("Hipertermia");

			}
		}
}
