
public class mainMoto {

	public static void main(String[] args) {
		
		Moto moto = new Moto();
		
		moto.acelerar();
		moto.frear();

		System.out.println("moto:\n"
				+"\nVel:" + moto.velocidade
				+"\nPot:" + moto.potenciaMotor);
	}

}
