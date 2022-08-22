import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class ListaProduto extends JFrame {

	//rotulos label para os campos
	private JLabel labelCodigo; // JLabel elemento grafico de rotulo
	private JLabel labelNome; 
	private JLabel labelDtCompra; 
	private JLabel labelVlUnitario; 
	
	//caixa de textos
	private JTextField textFieldCodigo;
	private JTextField textFieldNome;
	private JTextField textFieldDtCompra; 
	private JTextField textFieldVlUnitario; 
	
	private TratBotao tratBotao;
	
	// botoes
	private JButton buttonCarrega;
	private JButton buttonLimpa;
	private JButton buttonFecha;

	// no construtor cria os os objetos da interface
	// depois vamos mover para um metodo inicializa()
	public ListaProduto() {
		super( "Lista Produto" );  // define o nome-titulo da janela

		// FlowLayout f = new FlowLayout(); setLayout( f ); // igual a linha de baixo 
		setLayout( new FlowLayout() ); // set frame layout

		//criando e configurando os rotulos  (label)
		labelCodigo = new JLabel("           Codigo:");
		labelNome = new JLabel("             Nome:");
		labelDtCompra = new JLabel("     Dt Compra:");
		labelVlUnitario = new JLabel("   Vl Unitario:");
		
		// criando e configurando os objetos
		textFieldCodigo = new JTextField(15);
		textFieldNome = new JTextField(15);
		textFieldDtCompra = new JTextField(15);
		textFieldVlUnitario = new JTextField(15);
		
		tratBotao = new TratBotao();
		
		buttonCarrega = new JButton("carrega");
		buttonCarrega.addActionListener(tratBotao);
		buttonLimpa = new JButton(" Limpa ");
		buttonLimpa.addActionListener(tratBotao);
		buttonFecha = new JButton("  Fecha  ");
		buttonFecha.addActionListener(tratBotao);

		
		// No gerenciador FowLayout
		//adicionando os elementos na ordem correta no frame
		add(labelCodigo);
		add(textFieldCodigo);

		add(labelNome);
		add(textFieldNome);
		
		add(labelDtCompra);
		add(textFieldDtCompra);

		add(labelVlUnitario);
		add(textFieldVlUnitario);

		add(buttonCarrega);
		add(buttonFecha);
		add(buttonLimpa);


	}
        
	private void carrega () {
	
	  Date dtCompra = new Date ();
	  BigDecimal vlUnitario;
	  int codigo = 1;
	  String nome = "Steh";
	  
	  vlUnitario = new BigDecimal(1.33); 
	  
	  ProdutoVO pVo = new ProdutoVO (codigo, nome , dtCompra, vlUnitario );
	  	  
	  SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	 
	  String date = sdf.format(pVo.getDataCompra());
	  
	  textFieldCodigo.setText(String.valueOf(pVo.getCodigo()));
	  textFieldNome.setText(pVo.getNome());
	  textFieldDtCompra.setText(date);
	  
	  DecimalFormat df = new DecimalFormat("#,###.##");
	  textFieldVlUnitario.setText(df.format(pVo.getVlUnitario()));
	  
	  
	}

	public void limpa() {
		
		// JOptionPane.showMessageDialog(this, "limpa");
		 
		 textFieldCodigo.setText("");
		 textFieldNome.setText("");
		 textFieldDtCompra.setText("");
		 textFieldVlUnitario.setText("");
			
			
		 textFieldCodigo.requestFocus();
	}
	

	public void fecha() {
		
		 JOptionPane.showMessageDialog(ListaProduto.this, "Fechando tela");
		 
		 this.dispose();
		 
	}

	// classe interna que trata o botão
	private class TratBotao implements ActionListener {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == buttonCarrega)
					ListaProduto.this.carrega();
				else if (e.getSource() == buttonLimpa )
					ListaProduto.this.limpa();
				else 
					ListaProduto.this.fecha();
	
			} 
		
	    	
	    }

}
