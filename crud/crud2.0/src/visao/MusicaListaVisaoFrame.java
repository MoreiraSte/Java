
package visao;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

import controle.MusicaControle;
import modelo.MusicaVO;

public class MusicaListaVisaoFrame extends JFrame {
	
	MusicaControle controle;
	
	private JTextArea listagem;

	// botoes 
		private JButton buttonFecha;
		
	// no construtor cria os os objetos da interface
	public MusicaListaVisaoFrame(MusicaControle controle) {
			
		super( "Lista de Musicas" );  // define o nome-titulo da janela
		
		controle = new MusicaControle();
		
		this.controle = controle;
		
		FlowLayout f = new FlowLayout(); setLayout( f ); // igual a linha de baixo 
		setLayout( new FlowLayout() ); // set frame layout
		
		listagem = new JTextArea();
		
		//adicionar a janela do usuario.
		add(listagem);
		
		//botoes
		buttonFecha = new JButton("Fechar");
		
		//adicionando os elementos na ordem correta no frame
		add(buttonFecha);
		
		// cria o objeto que trata o evento do botao: ButtonHandler
		ButtonHandler handler= new ButtonHandler();
				
		buttonFecha.addActionListener(handler);
				
		// cria objeto que trata o evento de perda de foco FocusHandler
		FocusHandler focusHandler = new FocusHandler();
		
		listaMusica();
		
		this.setLocationRelativeTo(null);
		
	}//fim controle
	
	private void listaMusica() {
		
		
		String texto = new String();
		
		texto += "Codigo\tNome\tEstilo\tCantor\tAno";
	
		
		ArrayList<MusicaVO> cinemateca = controle.obterTodasMusicas();
		
		//Percorre o ArrayList
		for (MusicaVO musica: cinemateca)
		{
			texto+= "\n" + musica.getCodigo() + "\t" + musica.getNome() + "\t" +
					musica.getEstilo()+ "\t" + musica.getCantor()+ "\t" ;
				
		}// fim for
		
		//fazer listagem
		listagem.setText(texto);
		
		JOptionPane.showMessageDialog( MusicaListaVisaoFrame.this, "Listagem realizada com sucesso");
		
	}//fim 
	
	private void fecha() {
		
		JOptionPane.showMessageDialog( MusicaListaVisaoFrame.this, "Fechando a tela de Adiciona");
		//System.exit(0); encerra a aplicação.
		this.dispose(); //fecha somente o JFrame em questão, onde this = JFrame.
		
	}// fim fecha()
	
	// classe interna para manipulação do evento do botão
		private class ButtonHandler implements ActionListener {
				
			// metodo que trata o evento do botao
			public void actionPerformed( ActionEvent event )
			{
				if(event.getSource() == buttonFecha)
				
					MusicaListaVisaoFrame.this.fecha();
					
				} // fim metodoactionPerformed


		} // fim classe interna ButtonHandler
		
		//classe interna para manipular os eventos de perda de foco
		private class FocusHandler implements FocusListener{

		@Override
			public void focusGained(FocusEvent arg0) {
			
		
		
			}
		
			@Override
			public void focusLost(FocusEvent arg0) {

			}
			
		}// fim metodoFocusHandler
		
}// fim da classe






