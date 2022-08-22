import java.io.File;
import java.util.Scanner;

public class ExemploFile {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.printf("\nEntre com o caminho do diret�rio , pasta ou arquivo :\n");
		String nome = ler.nextLine();

		File objFile = new File(nome);
		if (objFile.exists()) {
			if (objFile.isFile()) {
				System.out.printf("\n nome eh : %s tamanho: %d\n", objFile.getName(),  objFile.length());
			}
			else {
				System.out.printf("\nConte�do do diret�rio:\n");
				String diretorio[] = objFile.list();
				for (String item: diretorio) {
					System.out.printf("%s\n", item);
				}
			}
		} else System.out.printf("Erro: arquivo ou diret�rio informado n�o existe!\n");
	}
}
