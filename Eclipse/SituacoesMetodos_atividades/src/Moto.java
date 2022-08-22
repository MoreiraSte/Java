public class Moto {

	int velocidade;
	float potenciaMotor;
	
	public Moto() {
		this.potenciaMotor = 1.0f; //this - usada para referenciar a instância atual do método no qual é usada.
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
