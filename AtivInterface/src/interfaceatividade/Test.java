package interfaceatividade;

public class Test {

	public static void main(String[] args) {

			iJogos meuJogo = new Ubsoft(2019,"Abril",23);
			
			nome(meuJogo);
			
	}
	public static void nome(iJogos meuJogo) {
		meuJogo.nomeJogo();
	}

	
}
