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

public class MusicaAlteraVisaoFrame extends JFrame {
	
	MusicaControle controle = new MusicaControle();
	
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
		private JButton buttonAltera;
		private JButton buttonLimpa;
		private JButton buttonFecha;
		
	// no construtor cria os os objetos da interface
	public MusicaAlteraVisaoFrame(MusicaControle controle) {
			
		super( "Atualizacao das Musicas" );  // define o nome-titulo da janela
		
		this.controle = controle;
		
		controle = new MusicaControle();
		
		FlowLayout f = new FlowLayout(); setLayout( f ); // igual a linha de baixo 
		setLayout( new FlowLayout() ); // set frame layout
		
		//criando e configurando os rotulos  (label)
		labelCodigo = new JLabel("Código:          ");
		labelNome = new JLabel("Novo Nome:     ");
		labelEstilo = new JLabel("Novo Estilo: ");
		labelCantor = new JLabel("Novo Cantor:   ");
		
		
		// criando e configurando os objetos
		textFieldCodigo = new JTextField(15);
		textFieldNome = new JTextField(15);
		textFieldEstilo = new JTextField(15);
		textFieldCantor = new JTextField(15);
			
		
		

		//botoes
		buttonAltera = new JButton("Alterar");
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
		
		
		
		add(buttonAltera);
		add(buttonFecha);
		add(buttonLimpa);

		// cria o objeto que trata o evento do botao: ButtonHandler
		ButtonHandler handler= new ButtonHandler();
		
		buttonAltera.addActionListener( handler);
		buttonLimpa.addActionListener(handler);
		buttonFecha.addActionListener(handler);
		
		// cria objeto que trata o evento de perda de foco FocusHandler
		FocusHandler focusHandler = new FocusHandler();
		textFieldCodigo.requestFocus();
		textFieldCodigo.addFocusListener(focusHandler);
		
		this.setLocationRelativeTo(null);
		
	}// fim construtor
	
	private void alteraMusica() {
		
		int codigo = Integer.parseInt(textFieldCodigo.getText());
		MusicaVO musica = new MusicaVO(codigo);
		
		musica.setNome(textFieldNome.getText());
		musica.setEstilo(textFieldEstilo.getText());
		musica.setCantor(textFieldCantor.getText());
	
		controle = new MusicaControle();
		
		controle.alterarMusica(musica);
		
		
		
		JOptionPane.showMessageDialog( MusicaAlteraVisaoFrame.this, "Musica alterada com sucesso");
	}//fim 
	
	private void limpa() {
		
		//limpando os campos
		textFieldCodigo.setText("");
		textFieldNome.setText("");
		textFieldEstilo.setText("");
		textFieldCantor.setText("");
		
		
		textFieldCodigo.requestFocus();
		
	}// fim limpa()
	
	// metodo chamado quando o botao de Fecha é acionado
	private void fecha() {
				
		JOptionPane.showMessageDialog( MusicaAlteraVisaoFrame.this, "Fechando a tela de Adiciona");
		//System.exit(0); encerra a aplicação.
		this.dispose(); //fecha somente o JFrame em questão, onde this = JFrame.
		
	}// fim fecha()
	
	// classe interna para manipulação do evento do botão
		private class ButtonHandler implements ActionListener {
			
			// metodo que trata o evento do botao
			public void actionPerformed( ActionEvent event )
			{
				if(event.getSource() == buttonAltera)
					MusicaAlteraVisaoFrame.this.alteraMusica();
				else if (event.getSource() == buttonLimpa)
					MusicaAlteraVisaoFrame.this.limpa();
				else
					MusicaAlteraVisaoFrame.this.fecha();
				
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