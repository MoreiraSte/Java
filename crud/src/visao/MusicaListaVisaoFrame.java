
package visao;
/***
 * Mostra uso de menu COM InternalFrame 
 */

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

//import controle.AlunoControle;
//import modelo.vo.AlunoVO;

public class MusicaListaVisaoFrame extends JInternalFrame{
	
//	AlunoControle controle;
	private JTextArea textAreaListaMusica;

	// botoes
	private JButton buttonLista;
	private JButton buttonLimpa;
	private JButton buttonFecha;

	public MusicaListaVisaoFrame() { //MusicaControle controle) {
		super( "Listagem de Musicas");  // define o nome-titulo da janela

//		this.controle = controle;

		// FlowLayout f = new FlowLayout(); setLayout( f ); // igual a linha de baixo 
		setLayout( new FlowLayout() ); // set frame layout

		//criando e configurando os rotulos  (label)
		textAreaListaMusica = new JTextArea("",10, 25);
		textAreaListaMusica.setEditable(false);
		
		//botoes
		buttonLista = new JButton("Listar"); // internacionalizar
		buttonLimpa = new JButton(" Limpa ");     // internacionalizar
		buttonFecha = new JButton("  Fecha  ");   // internacionalizar

		//adicionando os elementos na tela
		add(textAreaListaMusica);
	
		add(buttonLista);
		add(buttonFecha);
		add(buttonLimpa);

		// cria o objeto que trata que trata o evento do botao ButtonHandler
		ButtonHandler handler= new ButtonHandler();
		buttonLista.addActionListener( handler);
		buttonLimpa.addActionListener(handler);
		buttonFecha.addActionListener(handler);

	}
	
	//metodo que monta a Area com a lista de musica
	private void listaMusica()
	{
		String strMusica = ""; // monta uma string com a lista de musicas
		

		strMusica = strMusica.concat("\n----- LISTAGEM DE MUSICA --------------\n\n");
		strMusica = strMusica.concat(String.format("%s\t\t %s\n %s\n %s\n %s\n ", "Prontuario", "Nome", "Cantor", "Estilo", "Ano"));


		textAreaListaMusica.setText(strMusica);

	}
	
	// metodo chamado quando o botao de Limpa
	private void limpa() 
	{
		textAreaListaMusica.setText("");
	}

	// metodo chamado quando o botao de Fecha
	private void fecha() 
	{
			
		JOptionPane.showMessageDialog( MusicaListaVisaoFrame.this, "Fechando a tela de Listagem");
		//		System.exit(0); encerra a aplicação.
		this.dispose(); //fecha somente o JFrame em questão, onde this = JFrame.
	}

	// classe interna para manipulação do evento do botão
		private class ButtonHandler implements ActionListener {
			
			// metodo que trata o evento do botao
			public void actionPerformed( ActionEvent event )
			{
				if(event.getSource() == buttonLista)
					MusicaListaVisaoFrame.this.listaMusica();
				else if (event.getSource() == buttonLimpa)
					MusicaListaVisaoFrame.this.limpa();
				else
					MusicaListaVisaoFrame.this.fecha();
				
			} // fim metodoactionPerformed
		
		}// fim classe interna Tratador

}
