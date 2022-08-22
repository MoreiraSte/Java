package interfaceatividade;

public class Ubsoft implements iJogos{
	
	private int diaLancamento;
	private String mesLancamento;
	private int anoLancamento;

	public Ubsoft(int anoLancamento, String mesLancamento,int diaLancamento) {
		this.anoLancamento = anoLancamento;
		this.mesLancamento = mesLancamento;
		this.diaLancamento = diaLancamento;
	}
	
	@Override
	public void nomeJogo() {
		System.out.println("Mortal Kombat");
	}
	
	
}
