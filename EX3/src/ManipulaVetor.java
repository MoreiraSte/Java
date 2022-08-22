// esse programa acumula o numero de participantes , os resultados das notas e suas frequencias//
public class ManipulaVetor {

	public void perquisar (String[]args){
		
		int resposta[] = new int [20];
		int freq[] = new int[6];
		int valorInt;
		
		int participantes;
		String nomeAtividade;
		
		//mostra os elementos do vetor args recebido
		
		nomeAtividade = args[0];
		System.out.printf("Atividade: %s\n",nomeAtividade);
		
		participantes = args.length - 1;
		System.out.printf("total de participantes: %d",participantes);
		
//		for(int i =1; i < args.length ; i++) {
//				System.out.printf("\n%s",args[i]);
//		}
		
		
		for(int i = 1; i < args.length ; i++) {
			        valorInt  = Integer.parseInt(args[i]);
			        resposta[i-1] = valorInt;
		}
		
//		System.out.print("\nVetor resposta");
//		for(int i =0; i < resposta.length ; i++) {
//			System.out.printf("\n%s",resposta[i]);
//		}
		
		
		for(int i =0; i < resposta.length ; i++) 
		   ++freq[resposta[i]];
		
		
		System.out.print("\nVetor freq");
		for(int i = 1; i < freq.length ; i++) {
			System.out.printf("\n%d - %d",i ,freq[i]);
		}
		
		for(int i=0; i < resposta.length;i++){
			if(valorInt=1){
				System.out.printf("\nMuito Ruim:%d",valorInt);
			}
			else if(valorInt=2){
				System.out.printf("\nRuim:%d",valorInt);
			}
			else if(valorInt=3){
				System.out.printf("\nRegular:%d",valorInt);
			}
			else if(valorInt=4){
				System.out.printf("\nBom:%d",valorInt);
			}
			else if(valorInt=5){
				System.out.printf("Otimo:%d",valorInt);
			}
		}

	}
	
}
