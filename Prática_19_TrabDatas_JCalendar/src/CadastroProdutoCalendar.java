import java.awt.Dimension;
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

import com.toedter.calendar.JDateChooser;

public class CadastroProdutoCalendar extends JFrame {

	//rotulos label para os campos
	private JLabel labelCodigo; // JLabel elemento grafico de rotulo
	private JLabel labelNome; 
	private JLabel labelDtCompra; 
	private JLabel labelVlUnitario; 
	
	//caixa de textos
	private JTextField textFieldCodigo;
	private JTextField textFieldNome;
	private JDateChooser dateChooser;
	private JTextField textFieldVlUnitario; 
	
	private TratBotao tratBotao;
	
	// botoes
	private JButton buttonAdiciona;
	private JButton buttonLimpa;
	private JButton buttonFecha;
	

	// no construtor cria os os objetos da interface
	// depois vamos mover para um metodo inicializa()
	public CadastroProdutoCalendar() {
		super( "CadastroProdutoCalendar " );  // define o nome-titulo da janela

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
		textFieldVlUnitario = new JTextField(15);
		
		
		tratBotao = new TratBotao();
		
		buttonAdiciona = new JButton("Adiciona");
		buttonAdiciona.addActionListener(tratBotao);
		buttonLimpa = new JButton(" Limpa ");
		buttonLimpa.addActionListener(tratBotao);
		buttonFecha = new JButton("  Fecha  ");
		buttonFecha.addActionListener(tratBotao);
		
		// mosta formata da data, mascara e o que mostrar (-) qd nao tiver nada
				dateChooser = new JDateChooser("dd/MM/yyyy", "##/##/#####", '-');
				// demensiona o tamaho da caixa de texto do JDateChooser
				dateChooser.setPreferredSize(new Dimension(165, 20));
				// demensiona o tamaho do calendario do JDateChooser
				dateChooser.getJCalendar().setPreferredSize(new Dimension(200, 250));//		cal = new JCalendar();

		
		// No gerenciador FowLayout
		//adicionando os elementos na ordem correta no frame
		add(labelCodigo);
		add(textFieldCodigo);

		add(labelNome);
		add(textFieldNome);
		
		add(labelDtCompra);
		add(dateChooser);

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
	  dtCompra= dateChooser.getDate(); 
	  BigDecimal vlUnit;
	  codigo = textFieldCodigo.getText();
	  nome = textFieldNome.getText();
	  vlUnitStr = textFieldVlUnitario.getText();
	  
	  
	    codigoInt = Integer.parseInt(codigo);
	  SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	  dtCompraStr = sdf.format(dtCompra) ;
	  
	  JOptionPane.showMessageDialog(this, "codigo:" + codigo + "\n nome : "+ nome + "\ndtCompraStr:"+ dtCompraStr + "\nvlUnitStr:"+ vlUnitStr);

	
	  
	 vlUnit = new BigDecimal (vlUnitStr);
	 
	  ProdutoVO pVo = new ProdutoVO (codigoInt, nome , dtCompra, vlUnit );
	  
	  
	
	}

	public void limpa() {
		
		// JOptionPane.showMessageDialog(this, "limpa");
		
		 textFieldCodigo.setText("");
		 textFieldNome.setText("");
//		 textFieldDtCompra.setText("");
		 textFieldVlUnitario.setText("");
			
			
		 textFieldCodigo.requestFocus();
	}
	

	public void fecha() {
		
		JOptionPane.showMessageDialog(CadastroProdutoCalendar.this, "Fechando tela");
		 
		 this.dispose();
	}

	// classe interna que trata o botão
	private class TratBotao implements ActionListener {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == buttonAdiciona )
					CadastroProdutoCalendar.this.adiciona();
				else if (e.getSource() == buttonLimpa )
					CadastroProdutoCalendar.this.limpa();
				else 
					CadastroProdutoCalendar.this.fecha();
	
			} 
		
	    	
	    }

}
