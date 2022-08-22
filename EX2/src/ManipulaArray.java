// essa classe mostra e le o vetor, mostrandos suas frequencias//
import java.util.Scanner;
public class ManipulaArray {
		
		public void mostra (int v[]) {
			
				System.out.printf("8%s,7%s\n","posição","vetor");
				for(int i=0;i<v.length;i++) {
					System.out.printf("10%d,12%d",i,v[i]);
				}
				return mostra;
		}
		public void leVetor (int []v) {
			 Scanner tec  = new Scanner (System.in);
			 for(int i=0;i<v.length;i++){
				 System.out.printf("Entre com a sua idade:");
				 v[i]=tec.nextInt();
			 }
			 
		}
		public int Frequencia (int []v){
			int []freq = new int[18];
		
		
		for ( int i = 0; i < Frequencia.length ; i++){
			Frequencia[i]=0;
			
		}
		for ( int i = 0; i < Frequencia.length ; i++){
			frequencia[v[i]]=frequencia[v[i]]+1;
		}
		return freq;
		}
		
		

}
