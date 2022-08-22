
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

public class MusicaAdicionaVisaoFrame extends JFrame {
	
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
		private JButton buttonAdiciona;
		private JButton buttonLimpa;
		private JButton buttonFecha;
		
	// no construtor cria os os objetos da interface
	public MusicaAdicionaVisaoFrame(MusicaControle controle) {
			
		super( "Cadastro Nova Musica" );  // define o nome-titulo da janela
		
		this.controle = controle;
		
		//FlowLayout f = new FlowLayout(); setLayout( f ); // igual a linha de baixo
		//cria flowlayout e configura o layout de frame
		setLayout( new FlowLayout() ); // set frame layout
		
		//criando e configurando os rotulos  (label)
		labelCodigo = new JLabel("        Código: ");
		labelNome = new JLabel("            Nome: ");
		labelCantor = new JLabel("Banda/Cantor: ");
		labelEstilo = new JLabel("          Estilo: ");
	
		
		// criando e configurando os objetos
		textFieldCodigo = new JTextField(15);
		textFieldNome = new JTextField(15);
		textFieldEstilo = new JTextField(15);
		textFieldCantor = new JTextField(15);
	
		
		//obtendo o filme com codigo
		
		
		//botoes
		buttonAdiciona = new JButton("Adicionar");
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
				
				
				add(buttonAdiciona);
				add(buttonFecha);
				add(buttonLimpa);
		
		// cria o objeto que trata o evento do botao: ButtonHandler
		ButtonHandler handler= new ButtonHandler();
		
		buttonAdiciona.addActionListener( handler);
		buttonLimpa.addActionListener(handler);
		buttonFecha.addActionListener(handler);
		
		// cria objeto que trata o evento de perda de foco FocusHandler
		FocusHandler focusHandler = new FocusHandler();
		textFieldCodigo.requestFocus();
		textFieldCodigo.addFocusListener(focusHandler);
		
		this.setLocationRelativeTo(null);
		
	}
	
	private void adicionaMusica() {
		
		MusicaVO novaMusica;
		
		int codigo;  //atributo determinante
		String nome;
		String estilo;
		String cantor;
		
		
		codigo = Integer.parseInt(textFieldCodigo.getText()); 
		nome = textFieldNome.getText();
		estilo = textFieldEstilo.getText();
		cantor = textFieldCantor.getText();
		
		
		novaMusica = new MusicaVO(codigo);
		novaMusica.setNome(nome);
		novaMusica.setEstilo(estilo);
		novaMusica.setCantor(cantor);
	
		
		novaMusica = new MusicaVO (codigo, nome, cantor, estilo);
		
		controle = new MusicaControle ();
		
		controle.adiciona(novaMusica);
		
		JOptionPane.showMessageDialog( this, "cadastrado com sucesso");//resultado);
		limpa();
		
	//	controle.adiciona(novaMusica);
	}//fim 
	
	// metodo chamado quando o botao de Limpa
	private void limpa() {
			
		//limpando os campos
		textFieldCodigo.setText("");
		textFieldNome.setText("");
		textFieldEstilo.setText("");
		textFieldCantor.setText("");
		
		
		textFieldCodigo.requestFocus();
		
	}
	
	// metodo chamado quando o botao de Fecha
	private void fecha() {
				
		JOptionPane.showMessageDialog( MusicaAdicionaVisaoFrame.this, "Fechando a tela de Adiciona");
		//System.exit(0); encerra a aplicação.
		this.dispose(); //fecha somente o JFrame em questão, onde this = JFrame.
		
	}
	
	// classe interna para manipulação do evento do botão
	private class ButtonHandler implements ActionListener {
			
		// metodo que trata o evento do botao
		public void actionPerformed( ActionEvent event )
		{
			if(event.getSource() == buttonAdiciona)
			
				MusicaAdicionaVisaoFrame.this.adicionaMusica();
				else if (event.getSource() == buttonLimpa)
					MusicaAdicionaVisaoFrame.this.limpa();
				else
					MusicaAdicionaVisaoFrame.this.fecha();
				
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
	}// fim FocusHandler
	
}//fim da classe
