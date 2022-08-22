public class Moto {

	int velocidade;
	float potenciaMotor;
	
	public Moto() {
		this.potenciaMotor = 1.0f; //this - usada para referenciar a inst�ncia atual do m�todo no qual � usada.
		this.velocidade = 0;
	}
	public void acelerar () {
		
		this.velocidade += (this.potenciaMotor * 10);
	}
	public void frear () {
	
		this.velocidade -= (this.potenciaMotor * 10);
		
		if(this.velocidade < 0) {
			this.velocidade = 0;
		}	
	}
}
