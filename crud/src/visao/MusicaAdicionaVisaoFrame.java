
package visao;
/***
 * Mostra uso de menu COM InternalFrame 
 */

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class MusicaAdicionaVisaoFrame extends JInternalFrame {


	
	//rotulos label para os campos
	private JLabel labelCodigo; // JLabel so com texto
	private JLabel labelNome; // JLabel no construtor com texto e icone
	private JLabel labelCantor; // JLabel adicionado via metodos texto e icone
	private JLabel labelEstilo;
	private JLabel labelAno;
	
	// Caixa de textos dos atributos
	private JTextField textFieldCodigo;
	private JTextField textFieldNome;
	private JTextField textFieldEstilo;
	private JTextField textFieldCantor;
	private JTextField textFieldAno;

	// botoes 
	private JButton buttonAdiciona;
	private JButton buttonLimpa;
	private JButton buttonFecha;
	
	
	// no construtor cria os os objetos da interface
	// depois vamos mover para um metodo inicializa()
	public MusicaAdicionaVisaoFrame() { //MusicaControle controle) {
		super( "Cadastro Nova Musica" );  // define o nome-titulo da janela

//		this.controle = controle;
		
		// FlowLayout f = new FlowLayout(); setLayout( f ); // igual a linha de baixo 
		setLayout( new FlowLayout() ); // set frame layout

		//criando e configurando os rotulos  (label)
			labelCodigo = new JLabel("        Código: ");
			labelNome = new JLabel("            Nome: ");
			labelCantor = new JLabel("Banda/Cantor: ");
			labelEstilo = new JLabel("          Estilo: ");
			labelAno = new JLabel("                Ano: ");
				
		// criando e configurando os objetos
			textFieldCodigo = new JTextField(15);
			textFieldNome = new JTextField(15);
			textFieldEstilo = new JTextField(15);
			textFieldCantor = new JTextField(15);
			textFieldAno = new JTextField(15);
				
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
			
			add(labelAno);
			add(textFieldAno);
			
			add(buttonAdiciona);
			add(buttonFecha);
			add(buttonLimpa);
		
		// cria o objeto que trata que trata o evento do botao ButtonHandler
		ButtonHandler handler= new ButtonHandler();
		buttonAdiciona.addActionListener( handler);
		buttonLimpa.addActionListener(handler);
		buttonFecha.addActionListener(handler);

		// cria objeto que trata o evento de perda de foco FocusHandler
		FocuHandler focusHandler = new FocuHandler();
		textFieldCodigo.requestFocus();
		textFieldCodigo.addFocusListener(focusHandler);
		
	}//fim construtor

	// metodo chamado quando o botao de Adiciona
	private void adicionaMusica() 
	{
		String resultado;
		
		// variaveis locais: criado qd o metodo inicia 
		// e desaparece qd o metodo termina
		int cod;
		String codStr, nome, cantor, estilo, ano;

		codStr = textFieldCodigo.getText();  
		cod = Integer.parseInt(codStr);
	
		nome = textFieldNome.getText();
		estilo = textFieldEstilo.getText();
		cantor = textFieldCantor.getText();
		ano = textFieldAno.getText();
		
		
		JOptionPane.showMessageDialog( this, "cadastrado com sucesso");//resultado);
		limpa();
	}

	// metodo chamado quando o botao de Limpa
	private void limpa() 
	{
		//limpando os campos
				textFieldCodigo.setText("");
				textFieldNome.setText("");
				textFieldEstilo.setText("");
				textFieldCantor.setText("");
				textFieldAno.setText("");
				
				
		
		textFieldCodigo.requestFocus();
	}
	
	// metodo chamado quando o botao de Fecha
	private void fecha() 
	{
		JOptionPane.showMessageDialog( MusicaAdicionaVisaoFrame.this, "Fechando a tela de Adiciona");
		//		System.exit(0); encerra a aplicação.
		this.dispose(); //fecha somente o JFrame em questão, onde this = JFrame.
	}
	
	// metodo que verifia se já existe codigo cadastrado
	private void verificaExisteCodigo()
	{
		String codigoStr = textFieldCodigo.getText();
		
		int codigo = Integer.parseInt(codigoStr);
		
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
	private class FocuHandler implements FocusListener{

		@Override
		public void focusGained(FocusEvent arg0) {
			// TODO Auto-generated method stub
	//		JOptionPane.showMessageDialog( AlunoAdicionaVisaoFrame.this, "Ganhou o foco");
			
		}

		@Override
		public void focusLost(FocusEvent arg0) {
			// TODO Auto-generated method stub
		//	AlunoAdicionaVisaoFrame.this.verificaExisteCodigo();		
		}
		
	} // fim classe interna FocusHandler
}
