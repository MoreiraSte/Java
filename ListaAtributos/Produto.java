public class Produto {
	private int numero ;
	private String nome;
	private int qtdDisponivel;
	private double preco;
	
	Produto a = new Produto (int num , String nom , int qtd , double pre);
	
	int setNumero (){
		System.out.printf("\nEntre com o numero do produto:");
		return numero;
	}
	String setNome(){
		System.out.printf("\nEntre com o nome do produto:");
		return nome;
	}
	double setpreco (){
		System.out.printf("\nInforme o preço:");
		return preco;
	}		
	public void adicionaProduto ( int qtdDisponivel ){
		
		if (qtdDisponivel>1){
			qtdDisponivel = adicionaProduto;
		}
		else{
			System.out.printf("Valor inválivo");
		}
	}
	public void getQtdDisponível( ) {
		
		int getQtd;
		return;
	}
	public void alteraPreco (){
		setAlterapreco (double pre);
		Alterapreco = pre;
	}
	public void mostraDados () {
		double valorTotal=0;
		valorTotal = qtd * preco ;
		
		System.out.printf("\nproduto numero: %d",numero);
		System.out.printf("\nproduto nome: %d",nome);
		System.out.printf("\nproduto preco: %d",preco);
		System.out.printf("\nproduto quantidade: %d",Qtd);
		System.out.printf("\nproduto valor: %d",valorTotal);
	}
}



		
		
		
	