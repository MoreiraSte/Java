// essa classe faz os metodos de encontrar o maior dos vetores , e a media deles, e depois retorna-lo//
public class ManipulaVetor {
		
			public void mostra (int []a) {
				
				System.out.printf("8%s,7%s","posição","vetor");
				
				for(int i=0;i<a.length;i++) {
					System.out.printf("10%d,12%d\n",i,a[i]);	
				}
				return ;
			}

			
			public int maior (int []a) {
				
				int maior = a[0];
				
				for(int i = 0; i < a.length; i++) {
					if(a[i]>maior) {
						maior = a[i];
					}
				}
				
				return maior;
			}
			
			
			public float media (int []a) {
				float media;
				int soma;
				soma = 0;
				media=0;
				for(int i=0;i<a.length;i++) {
					soma = soma + a[i];
				}
				
				media = soma / a.length;
				return media;
			}
}
