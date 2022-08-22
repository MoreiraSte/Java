
public class Carro {
	// atributos (caracteristicas)
	int velocidade, km, qtdPorta;
	String cor, modelo;
	float potenciaMotor;
	
	public Carro() { 	// contrutor - m�todo que � invocado ap�s a cria��o de um objeto, responsavel por alocar os recursos do objeto

		
		this.potenciaMotor = 1.0f; //this - usada para referenciar a inst�ncia atual do m�todo no qual � usada.
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
