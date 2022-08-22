
	
	import java.io.BufferedReader;
	import java.io.FileReader;
	import java.io.FileWriter;
	import java.io.IOException;
	import java.io.PrintWriter;
	import java.util.Scanner;
	
	public class Questao2 {

		
		public void escrevendo()
		{
			FileWriter arq = null;  
			
			Scanner ler = new Scanner(System.in);
			String line ;

			System.out.printf("Escreva seu podema quando terminar digite -1 :\n");
			line = ler.nextLine();
					
			try {
				// cria o arquivo se nao existir cria e caso existindo apenda no final true
				arq = new FileWriter("C:\\PraticaArquivo\\Poema.txt",true);

				// fluxo que escreve
				PrintWriter gravarArq = new PrintWriter(arq); 

				
				while (!line.equals("-1")) { 
					gravarArq.printf("%s\n",line);
					line = ler.nextLine();
				}
				
				gravarArq.printf("+-------------+%n"); // observa % e nao \n

				arq.close();

			}catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.printf("\nFim de escrita");
		}
		
		public void lendo() 
		{
			FileReader arq = null;

			System.out.printf("\nConteúdo do arquivo texto:\n");
			try {
				arq = new FileReader("C:\\PraticaArquivo\\Poema.txt");
				BufferedReader lerArq = new BufferedReader(arq);

				String linha = lerArq.readLine(); 
				while (linha != null) {
					System.out.printf("%s\n", linha);

					linha = lerArq.readLine(); // lê da segunda até a última linha
				}

				arq.close();
			} catch (IOException e) {
				System.err.printf("Erro na abertura do arquivo: %s.\n",
						e.getMessage());
			}

			System.out.println();

		}	


	}

