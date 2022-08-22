import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class CadastroProduto extends JFrame {

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
	private JButton buttonAdiciona;
	private JButton buttonLimpa;
	private JButton buttonFecha;

	// no construtor cria os os objetos da interface
	// depois vamos mover para um metodo inicializa()
	public CadastroProduto() {
		super( "Cadastro Produto" );  // define o nome-titulo da janela

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
		
		buttonAdiciona = new JButton("Adiciona");
		buttonAdiciona.addActionListener(tratBotao);
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

		add(buttonAdiciona);
		add(buttonFecha);
		add(buttonLimpa);


	}
        
	private void adiciona () {
		
	  String codigo , nome , dtCompraStr , vlUnitStr;
	  int codigoInt;
	  Date dtCompra = null ;
	  BigDecimal vlUnit;
	  codigo = textFieldCodigo.getText();
	  nome = textFieldNome.getText();
	  dtCompraStr = textFieldDtCompra.getText();
	  vlUnitStr = textFieldVlUnitario.getText();

	  
	  JOptionPane.showMessageDialog(this, "codigo:" + codigo + "\n nome : "+ nome + "\ndtCompraStr:"+ dtCompraStr + "\nvlUnitStr:"+ vlUnitStr);
	  
	    codigoInt = Integer.parseInt(codigo);
	  SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	  try {
		dtCompra = sdf.parse(dtCompraStr);
	  }
	  catch (ParseException e) {
		  JOptionPane.showMessageDialog(this, "Erro na data digitada entre com o dd/mm/yyyy");
	  }
	  
	  vlUnit = new BigDecimal (vlUnitStr);
	  
	  ProdutoVO pVo = new ProdutoVO (codigoInt, nome , dtCompra, vlUnit );
	
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
		
		 JOptionPane.showMessageDialog(CadastroProduto.this, "Fechando tela");
		 
		 this.dispose();
		 
	}

	// classe interna que trata o botão
	private class TratBotao implements ActionListener {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == buttonAdiciona )
					CadastroProduto.this.adiciona();
				else if (e.getSource() == buttonLimpa )
					CadastroProduto.this.limpa();
				else 
					CadastroProduto.this.fecha();
	
			} 
		
	    	
	    }

}
