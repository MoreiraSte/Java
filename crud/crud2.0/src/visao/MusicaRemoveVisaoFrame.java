
package visao;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import controle.MusicaControle;
import modelo.MusicaVO;

public class MusicaRemoveVisaoFrame extends JFrame {
	
	MusicaControle controle;
	
	
	private JLabel labelCodigo;
	private JLabel labelNome;
	private JLabel labelEstilo;
	private JLabel labelCantor;
	
	
	// Caixa de textos dos atributos
	private JTextField textFieldCodigo;
	private JTextField textFieldNome;
	private JTextField textFieldEstilo;
	private JTextField textFieldCantor;


	// botoes 
	private JButton buttonRemove;
	private JButton buttonLimpa;
	private JButton buttonFecha;
		
	// no construtor cria os os objetos da interface
	public MusicaRemoveVisaoFrame(MusicaControle controle) {
			
		super( "Remoção de Musicas" );  // define o nome-titulo da janela
		
		this.controle = controle;
		
		FlowLayout m = new FlowLayout(); setLayout( m ); // igual a linha de baixo 
		setLayout( new FlowLayout() ); // set frame layout
		
		//criando e configurando os rotulos  (label)
				labelCodigo = new JLabel("Código: ");
				labelNome = new JLabel(" Nome:   \n\n ");
				labelEstilo = new JLabel(" Estilo: ");
				labelCantor = new JLabel(" Cantor: ");
				
				
				// criando e configurando os objetos
				textFieldCodigo = new JTextField(12);
				textFieldNome = new JTextField(12);
				textFieldEstilo = new JTextField(12);
				textFieldCantor = new JTextField(12);
				
				
	
		//botoes
		buttonRemove = new JButton("Remover");
		buttonLimpa = new JButton("Limpar");
		buttonFecha = new JButton("Fechar");
		
		//adicionando os elementos na ordem correta no frame
		add(labelCodigo);
		add(textFieldCodigo);
		
		add(labelNome);
		add(textFieldNome);
		
		add(labelEstilo);
		add(textFieldEstilo);
		
		add(labelCantor);
		add(textFieldCantor);
		
		
		add(buttonRemove);
		add(buttonFecha);
		add(buttonLimpa);

		// cria o objeto que trata o evento do botao: ButtonHandler
		ButtonHandler handler= new ButtonHandler();
		
		buttonRemove.addActionListener( handler);
		buttonLimpa.addActionListener(handler);
		buttonFecha.addActionListener(handler);
		
		// cria objeto que trata o evento de perda de foco FocusHandler
		FocusHandler focusHandler = new FocusHandler();
		textFieldCodigo.requestFocus();
		textFieldCodigo.addFocusListener(focusHandler);
		
		this.setLocationRelativeTo(null);
		
	}// fim construtor
	
	private void removeMusica() {
		
		int codigo = Integer.parseInt(textFieldCodigo.getText());
		
		controle = new MusicaControle();
		
		MusicaVO musica = controle.obterMusica(codigo);
		
		controle.remove(musica);
		
		JOptionPane.showMessageDialog( MusicaRemoveVisaoFrame.this, "Musica removida com sucesso");
	
	}// fim removeFilme()
	
	private void limpa() {
		
		//limpando os campos
		textFieldCodigo.setText("");
		textFieldNome.setText("");
		textFieldEstilo.setText("");
		textFieldCantor.setText("");
		
		
		textFieldCodigo.requestFocus();
		
	}// fim limpa()
	
	// metodo chamado quando o botao de Fechar é acionado
	private void fecha() {
				
		JOptionPane.showMessageDialog( MusicaRemoveVisaoFrame.this, "Fechando a tela de Remoção");
		//System.exit(0); encerra a aplicação.
		this.dispose(); //fecha somente o JFrame em questão, onde this = JFrame.
		
	}// fim fecha()
	
	// classe interna para manipulação do evento do botão
	private class ButtonHandler implements ActionListener {
		
		// metodo que trata o evento do botao
		public void actionPerformed( ActionEvent event )
		{
			if(event.getSource() == buttonRemove)
				MusicaRemoveVisaoFrame.this.removeMusica();
			else if (event.getSource() == buttonLimpa)
				MusicaRemoveVisaoFrame.this.limpa();
			else
				MusicaRemoveVisaoFrame.this.fecha();
				
		} // fim metodoactionPerformed


		} // fim classe interna ButtonHandler
		
		//classe interna para manipular os eventos de perda de foco
		private class FocusHandler implements FocusListener{

		@Override
			public void focusGained(FocusEvent arg0) {
			
	
		
			}
		
			@Override
			public void focusLost(FocusEvent arg0) {
			

			
			}// fim metodofocusGained
		
		}// fim classe FocusHandler
	
}// fim da classe

