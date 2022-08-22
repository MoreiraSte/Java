import java.io.File;
import java.util.Scanner;

public class ExemploFile {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.printf("\nEntre com o caminho do diretório , pasta ou arquivo :\n");
		String nome = ler.nextLine();

		File objFile = new File(nome);
		if (objFile.exists()) {
			if (objFile.isFile()) {
				System.out.printf("\n nome eh : %s tamanho: %d\n", objFile.getName(),  objFile.length());
			}
			else {
				System.out.printf("\nConteúdo do diretório:\n");
				String diretorio[] = objFile.list();
				for (String item: diretorio) {
					System.out.printf("%s\n", item);
				}
			}
		} else System.out.printf("Erro: arquivo ou diretório informado não existe!\n");
	}
}
