package interfacezoo;
// Esse Programa foi feito por : Stephany Moreira ht3001936 Tuma A //

import java.util.Scanner;
public class TigreHT3001946 implements IZoologico{
		

		
		@Override
		public void somAnimal() {
			System.out.println("Grrrrrr");
		}

		@Override
		public void previsaoNascimento(int dataGravidez) {
			
			

			if (dataGravidez == 1) {
				System.out.println("O mês previsto é abril");
				
		}
			else if(dataGravidez == 2) {
				System.out.println("O mês previsto é maio");
		
		
		}
			else if(dataGravidez == 3) {
				
				System.out.println("O mês previsto é junho");
				
			}
			else if(dataGravidez == 4) {
				
				System.out.println("O mês previsto é julho");
				
			}
			else if(dataGravidez == 5) {
				
				System.out.println("O mês previsto é agosto");
				
			}
			else if(dataGravidez == 6) {
				System.out.println("O mês previsto é setembro");
				
				
			}
			else if(dataGravidez == 7) {
				System.out.println("O mês previsto é outubro");
				
				
			}
			else if(dataGravidez == 8) {
				
				System.out.println("O mês previsto é novembro");
				
			}
			else if(dataGravidez == 9) {
				
				System.out.println("O mês previsto é dezembro");
				
			}
			else if(dataGravidez == 10) {
				
				System.out.println("O mês previsto é janeiro");
				
			}
			else if(dataGravidez == 11) {
				
				System.out.println("O mês previsto é fevereiro");
				
			}
			else if(dataGravidez == 12) {
				
				System.out.println("O mês previsto é março");
				
			}
			
		
		
		}
	}
