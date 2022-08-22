
package visao;

import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import controle.MusicaControle;

public class MusicaVisao {

	private MusicaControle musicaControle;
	private Scanner entrada;

	public MusicaVisao() {

		musicaControle = new MusicaControle();
		
		entrada = new Scanner(System.in);
		entrada.useDelimiter("\r\n");
		
	}
	
	// mostra o menu e faz a chamada para o metodo
	public void menu() {

		int opc; //opcao do usuario

		// do/wuile para ocorrer pelo vez 
		do
		{
			System.out.print("\n============= ENTRE COM A OPÇÃO =============");
			System.out.print("\n\n 1 - Criar Nova Musica");            // cadastra um filme
			System.out.print("\n\n 2 - Realizar Alteracao");          // altera o dados de um filme
			System.out.print("\n\n 3 - Listar Musicas");               // lista todos os filmes cadastrados
			System.out.print("\n\n 4 - Remover Musica");               // remove um filme cadastrado 
			System.out.print("\n\n 5 - Sair\n");
			System.out.print("\nOPÇÃO: ");
			opc = entrada.nextInt();
			
			//escolha da opção
			switch(opc) 
			{	
				case 1:
					criaNovaMusica();
					break;
				
				case 2:
					alterarMusica();
					break;
					
				case 3: 
					listarMusica();
					break;
				
				case 4:
					removerMusica();
					break;
					
				case 5:
					
					System.out.print("\n SAIDA DO PROGRAMA REALIZADA COM SUCESSO!");
					System.out.print("\n DIGITE QUALQUER TECLA PARA SAIR DO PROGRAMA");
					entrada.next();
					
					break;

				default :
					System.out.print("\n OPÇÃO INVÁLIDA -- DIGITE QUALQUER TECLA PARA CONTINUAR");
					entrada.next();
					
			} //fim switch
			
		} while  ( opc != 6 );
	
		System.out.print("\n FINALIZANDO O PROGRAMA...\n - DIGITE QUALQUER TECLA PARA SAIR");
		entrada.next();
		
		entrada.close(); 
		
	} // fim menu

	private void criaNovaMusica() {

		MusicaAdicionaVisaoFrame musicaAddFrame = new MusicaAdicionaVisaoFrame(musicaControle);
		
		musicaAddFrame.setResizable(false);
	
		musicaAddFrame.setSize( 300, 300 ); // set frame size
		
		musicaAddFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		musicaAddFrame.setVisible(true);
	

	}
	
	private void alterarMusica() {
		
		int cod= Integer.parseInt(JOptionPane.showInputDialog( "Digite o codigo da musica:"));
		
		MusicaAlteraVisaoFrame musicaAlterFrame = new MusicaAlteraVisaoFrame(musicaControle);
		
		musicaAlterFrame.setResizable(false);
	
		musicaAlterFrame.setSize( 300, 300 ); // set frame size
		
		musicaAlterFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		musicaAlterFrame.setVisible(true);
	
	}//fim 
	
	private void listarMusica() {

		MusicaListaVisaoFrame musicaFrame = new MusicaListaVisaoFrame(musicaControle);
		
		musicaFrame.setResizable(false);
	
		musicaFrame.setSize( 450, 600 ); // set frame size
		
		musicaFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		musicaFrame.setVisible(true);

	} // fim 
	
	private void removerMusica() {
		
		int cod= Integer.parseInt(JOptionPane.showInputDialog( "Digite o codigo da musica:"));
		
		MusicaRemoveVisaoFrame musicaRemovFrame = new MusicaRemoveVisaoFrame(musicaControle);
		
		musicaRemovFrame.setResizable(false);
	
		musicaRemovFrame.setSize( 300, 300 ); // set frame size
		
		musicaRemovFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		musicaRemovFrame.setVisible(true);
		
	} // fim 
	

} // fim classe