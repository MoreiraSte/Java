package Classes;

public class Paciente {
	
	private Double altura;
	private Double peso;
	
	public Paciente (Double altura , Double peso) {
		this.altura = altura;
		this.peso = peso;
	}
	
	public Double getAltura() {
		
		return altura;
	}
	public Double getPeso() {
		
		return peso;
	}
	public Double calcularIMC() {
		
		return (peso/(altura*altura));
	}
	
	public String diagnostico() {
		Double imc = this.calcularIMC();
		String result ="";
		if(imc <= 16) {
			result = "•	Baixo peso muito grave ";
		}
		else if(imc >= 16 && imc <= 16.99) {
			result = "•	Baixo peso grave ";
		}
		else if(imc >= 17 && imc <= 18.49) {
			result = "•	Baixo peso ";
		}
		else if(imc >= 18.50 && imc <= 24.99) {
			result = "•	Peso normal ";
		}
		else if(imc >= 25 && imc <= 29.99) {
			result = "•	Sobrepeso";
		}
		else if(imc >= 30 && imc <= 34.99) {
			result = "•	Obesidade grau I ";
		}
		else if(imc >= 35 && imc <= 39.99) {
			result = "•	Obesidade grau II ";
		}
		else if(imc >= 40) {
			result = "•	Obesidade grau III (obesidade mórbida) ";
		}
		
		return result;
	}

}
