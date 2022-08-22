import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import com.toedter.calendar.JDateChooser;
import com.toedter.calendar.JTextFieldDateEditor;

public class UsandoJCalendar extends JFrame {

	//rotulos label para os campos
	private JLabel labelProntuario; // JLabel so com texto
	private JLabel labelNome; // JLabel no construtor com texto e icone
	private JLabel labelDtNascimento; // JLabel adicionado via metodos texto e icone
	private JLabel labelVazio; // JLabel adicionado via metodos texto e icone
	
	//caixa de textos
	private JTextField textFieldProntuario;
	private JTextField textFieldNome;
	// botoes
	private JButton buttonAdiciona;
	private JButton buttonLimpa;
	private JButton buttonFecha;

	 private JDateChooser dateChooser;
	  
	// no construtor cria os os objetos da interface
	// depois vamos mover para um metodo inicializa()
	public UsandoJCalendar() {
		super( "Cadastro Novo Aluno" );  // define o nome-titulo da janela

		// FlowLayout f = new FlowLayout(); setLayout( f ); // igual a linha de baixo 
		setLayout( new FlowLayout() ); // set frame layout

		//criando e configurando os rotulos  (label)
		labelProntuario = new JLabel("                 Pront.:");
		labelNome = new JLabel("                   Nome:");
		labelDtNascimento = new JLabel("    Dt Nascimento:");
		labelVazio = new JLabel("                         ");
		
		// criando e configurando os objetos
		textFieldProntuario = new JTextField(15);
		textFieldNome = new JTextField(15);
		
		buttonAdiciona = new JButton("Adiciona");
		buttonLimpa = new JButton(" Limpa ");
		buttonFecha = new JButton("  Fecha  ");
		
		// mosta formata da data, mascara e o que mostrar (-) qd nao tiver nada
		dateChooser = new JDateChooser("dd/MM/yyyy", "##/##/#####", '-');
		// demensiona o tamaho da caixa de texto do JDateChooser
		dateChooser.setPreferredSize(new Dimension(165, 20));
		// demensiona o tamaho do calendario do JDateChooser
		dateChooser.getJCalendar().setPreferredSize(new Dimension(200, 250));//		cal = new JCalendar();
		
		// No gerenciador FowLayout
		//adicionando os elementos na ordem correta no frame
		add(labelProntuario);
		add(textFieldProntuario);

		add(labelNome);
		add(textFieldNome);
		
		add(labelDtNascimento);
		add(dateChooser);
		
		// apenas para dar um centralizada nos botoes (estetica)
		add(labelVazio);
		add(labelVazio);
		
		add(buttonAdiciona);
		add(buttonFecha);
		add(buttonLimpa);

		// cria o objeto que trata que trata o evento do botao ButtonHandler
		ButtonHandler handler= new ButtonHandler();
		buttonAdiciona.addActionListener( handler);
		buttonLimpa.addActionListener(handler);
		buttonFecha.addActionListener(handler);

		
	}

	private void adicionaAluno() 
	{
		String resultado = "Cadastro realizado com sucesso.";
		
		Date dataSelecionada;

		//obtem a data do dateChooser
		dataSelecionada = dateChooser.getDate(); 

		String pront, nome, dataString;

		pront = textFieldProntuario.getText();  
		nome = textFieldNome.getText();
		
		// getDate retorna um objeto do tipo date
		dataSelecionada = dateChooser.getDate(); 

		//precisa converter para String caso deseja mostrar a informação
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		dataString = sdf.format(dataSelecionada);
		resultado = resultado + pront + " \n " + nome + "\n " + dataString;

		JOptionPane.showMessageDialog( this, resultado);
		limpa();
	}

	
	private void limpa() 
	{
		//limpando os camp
		textFieldProntuario.setText("");
		textFieldNome.setText("");
		dateChooser.setCalendar(null); // limpa o campo JDateChooser 
		
		textFieldProntuario.requestFocus();
	}
	
	// metodo chamado quando o botao de Fecha
	private void fecha() 
	{
			
		JOptionPane.showMessageDialog( UsandoJCalendar.this, "Fechando a tela de Adiciona");
		//		System.exit(0); encerra a aplicação.
		this.dispose(); //fecha somente o JFrame em questão, onde this = JFrame.
	}
	
	
	// classe interna para manipulação do evento do botão
	private class ButtonHandler implements ActionListener {
		
		// metodo que trata o evento do botao
		public void actionPerformed( ActionEvent event )
		{
			
			if(event.getSource() == buttonAdiciona)
				UsandoJCalendar.this.adicionaAluno();
			else if (event.getSource() == buttonLimpa)
				UsandoJCalendar.this.limpa();
			else
				UsandoJCalendar.this.fecha();
			
		} // fim metodoactionPerformed


	} // fim classe interna ButtonHandler
}
