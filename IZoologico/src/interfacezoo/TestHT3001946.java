package interfacezoo;

import java.util.Scanner;

public class TestHT3001946 {

	public static void main(String[] args) {
		
		
		IZoologico a1 = new LoboHT3001946();
		IZoologico a2 = new TigreHT3001946();

		Lobo(a1);
		Tigre(a2);
		
			
	}
	public static void Lobo(IZoologico a1 ) {
		
		
		a1.somAnimal();
		
		Scanner tec = new Scanner (System.in);
		System.out.println("Informe o mês(em número) em que o lobo emgravidou");
		int dataGravidez = tec.nextInt();
		
		a1.previsaoNascimento(dataGravidez);
	}
public static void Tigre(IZoologico a2 ) {
		
	a2.somAnimal();
	
	Scanner tec1 = new Scanner (System.in);
	System.out.println("Informe o mês em que o  tigre emgravidou");
	int dataGravidez = tec1.nextInt();
	
	a2.previsaoNascimento(dataGravidez);
	}

	
}
