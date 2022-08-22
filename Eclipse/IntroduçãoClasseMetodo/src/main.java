
public class main {

	public static void main(String[] args) {
		
		Carro carro1 = new Carro();
		Carro carro2 = new Carro();
		
		carro1.cor = "Preto";
		carro1.km = 10000;
		carro1.qtdPorta = 5;
		carro1.modelo = "Sedan";
		carro1.acelerar();
		
		
		carro2.km = 50000;
		carro2.velocidade = 20;
		carro2.potenciaMotor = 2.0f;
		carro2.acelerar();
		
		System.out.println("Carro1:\n"
			+"\nCor:" + carro1.cor
			+"\nKm:" + carro1.km
			+"\nVel:" + carro1.velocidade
			+"\nPot:" + carro1.potenciaMotor
			+"\nPortas:" + carro1.qtdPorta
			+"\nTipo:" + carro1.modelo);
		
		System.out.println("\nCarro2:\n"
				+"\nCor:" + carro2.cor
				+"\nKm:" + carro2.km
				+"\nVel:" + carro2.velocidade
				+"\nPot:" + carro2.potenciaMotor
				+"\nPortas:" + carro2.qtdPorta
				+"\nTipo:" + carro2.modelo);
		
	

	}

}
