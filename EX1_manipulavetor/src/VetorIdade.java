//esse programa chama os metodos da classe manipulaVetor//
public class VetorIdade {
		
	private int [] a = { 12,13,15,12,11,12,14,15,15,16};
		
	public void manipulaVetor () {
		
		int maior;
		float media;
		
		ManipulaVetor m = new ManipulaVetor ();
			
		m.mostra(a);
			
		maior = m.maior(a);
		System.out.printf("o maior vetor eh:%d",maior);
			
		media = m.media(a);
		System.out.printf("a media eh:%.2f",media);
	}
}
