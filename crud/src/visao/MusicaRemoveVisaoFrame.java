
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

public class MusicaRemoveVisaoFrame extends JInternalFrame {


	
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
		private JButton buttonRemove;
		private JButton buttonLimpa;
		private JButton buttonFecha;
		
	// no construtor cria os os objetos da interface
	// depois vamos mover para um metodo inicializa()
	public MusicaRemoveVisaoFrame() { //MusicaControle controle) {
		super( "Exclui Musica" );  // define o nome-titulo da janela

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
		
		add(labelAno);
		add(textFieldAno);
		
		add(buttonRemove);
		add(buttonFecha);
		add(buttonLimpa);
		
		// cria o objeto que trata que trata o evento do botao ButtonHandler
		ButtonHandler handler= new ButtonHandler();
		buttonRemove.addActionListener( handler);
		buttonLimpa.addActionListener(handler);
		buttonFecha.addActionListener(handler);

		// cria objeto que trata o evento de perda de foco FocusHandler
		FocuHandler focusHandler = new FocuHandler();
		textFieldCodigo.requestFocus();
		textFieldCodigo.addFocusListener(focusHandler);

		
	}//fim construtor

	// metodo chamado quando o botao de Adiciona
	private void removeMusica() 
	{
		int opcao = JOptionPane.showConfirmDialog(this,"Confirma exclusão de musica", "Confirmação de exclusão", JOptionPane.OK_CANCEL_OPTION );
		
		// cancel
		if( opcao == 2)
		{
			JOptionPane.showMessageDialog( this, "Exclusão cancelada!");
		}
		else
		{
			String resultado;
//			MusicaVO a = controle.obterMusica(textFieldCodigo.getText());
//			resultado = controle.remove(a);
			
			JOptionPane.showMessageDialog( this, "removido com sucesso!");//resultado);
		}
		
		limpa();
	}

	// metodo chamado quando o botao de Limpa
	private void limpa() 
	{
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
			
		JOptionPane.showMessageDialog( MusicaRemoveVisaoFrame.this, "Fechando a tela de Excluir");
		//		System.exit(0); encerra a aplicação.
		this.dispose(); //fecha somente o JFrame em questão, onde this = JFrame.
	}
	
	// metodo que verifia que existe codigo cadastrado
	// monta os campos com os valores
	private void verificaExisteCodigoMontaCampos()
	{
//		MusicaVO m;
		
		String codigo = textFieldCodigo.getText();
		
//		m = controle.obterMusica(codigo);
		
//		if ( m == null)
//		{
//			JOptionPane.showMessageDialog(this, "NÃO existe musica cadastrada com este codigo", "Cadastra Musica",JOptionPane.ERROR_MESSAGE);	
//		
//			//retorna o foco para o campo codigo
//			textFieldCodigo.requestFocus();
//		
//			//seleciona todo o campo para o usuario apenas digitar
//			textFieldCodigo.selectAll();
//			
//			return;
//		}
//		
//		textFieldNome.setText(a.getNome());
//		buttonFecha.requestFocus();
	}
	
	
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
	private class FocuHandler implements FocusListener{

		@Override
		public void focusGained(FocusEvent arg0) {
			// TODO Auto-generated method stub
	//		JOptionPane.showMessageDialog( MusicaAdicionaVisaoFrame.this, "Ganhou o foco");
			
		}

		@Override
		public void focusLost(FocusEvent arg0) {
			// TODO Auto-generated method stub
			//if(!textFieldCodigo.getText().isEmpty())
				//MusicaRemoveVisaoFrame.this.verificaExisteCodigoMontaCampos();	
			//else
				//JOptionPane.showMessageDialog( MusicaRemoveVisaoFrame.this, "funcionou");
		}
		
	} // fim classe interna FocusHandler
}
