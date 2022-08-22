
public class Carro {
	// atributos (caracteristicas)
	int velocidade, km, qtdPorta;
	String cor, modelo;
	float potenciaMotor;
	
	public Carro() { 	// contrutor - método que é invocado após a criação de um objeto, responsavel por alocar os recursos do objeto

		
		this.potenciaMotor = 1.0f; //this - usada para referenciar a instância atual do método no qual é usada.
		this.velocidade = 0;
		this.km = 0;
		this.cor = cor;
		this.modelo = "hatch";
		this.qtdPorta = 3;
		
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
