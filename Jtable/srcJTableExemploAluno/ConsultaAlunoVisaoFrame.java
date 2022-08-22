/****
 * Exemplo com o uso de JTable. JTable foi implementado
 * utilizando a arquitetura MVC. JTable seria a visão e DefaultTableModel é o modelo
 * Assim as mudanças nos dados são feitas no modelo e ele é automaticamente
 * atualizado na visão. (Embora possa ser feito alteração no JTable isto não é refletido no modelo)
 */

import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Properties;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class ConsultaAlunoVisaoFrame extends JFrame{

	private ArrayList<AlunoVO> lista;

	private JScrollPane painel;

	private DefaultTableModel modelo;
	private JTable tabela;

	private JButton buttonListar;
	private JButton buttonGerarRelatorio;
	private JButton buttonFechar;
	
	public ConsultaAlunoVisaoFrame() {

		try { 
			// Aqui é possível configurar o visual de um sistema operacional
			//UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel"); //Unix Motif
			//UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
			//UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
			//UIManager.setLookAndFeel("javax.swing.plaf.mac.MacLookAndFee");
			UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");	// Java Swing Nimbus		
		} 
		catch (Exception e) 
		{ 
			
		}

		inicializa();
	}

	private void inicializa() {

		setLayout( new FlowLayout() ); // set frame layout

		this.setBounds(70,50,100,100);
		this.setTitle("Consultar Alunos");

		this.criaJTable();

		this.iniciandoComponentes();

		this.montaPainel(); // aqui adiciona os elementos gráficas no JFrame
	}

	private void criaJTable() {

		tabela = new JTable();
		modelo = new DefaultTableModel() {
			public boolean isCellEditable(int row, int column) {
				return false;  // false nao permite e true permite editar tabela
			}
		};
		
		tabela.setModel(modelo);

		//Objeto responsavel por ordenar os dados em ordem cresc ou desc no modelo	
		TableRowSorter tableSorter = new TableRowSorter(modelo); // permitir ordenação
		
		tabela.setRowSorter(tableSorter);
		
		// aqui define os nome das coluna, ordem criação 
		modelo.addColumn("Prontuário");
		modelo.addColumn("Nome");
		modelo.addColumn("Idade");
		modelo.addColumn("Disciplina");
		modelo.addColumn("Média");
		modelo.addColumn("Dt Nascimento");

		modelo.setNumRows(0); // limpa todas as colunas da tabela (modelo)
	}

	//inicia os componentes gráfico
	private void iniciandoComponentes() {
		
		painel = new JScrollPane(tabela);

		buttonListar = new JButton("Mostrar Alunos");
		buttonGerarRelatorio = new JButton ("Gerar Arquivo");
		buttonFechar = new JButton ("Fechar");

		buttonListar.addActionListener(//classe interna anonima
				new ActionListener() { //metodo ouvinte
					public void actionPerformed(ActionEvent e) {
						modelo.setNumRows(0);
						lista = pesquisarAlunos(); //busca no banco os dados
						
						//Utilizado para formatar a data de nascimento (Date)
						SimpleDateFormat formataDtNas =  new SimpleDateFormat("dd/MM/yyyy");

						//Utilizado para formatar valor com casas decimais média (BigDecimal) 
						DecimalFormat formataMedia = new DecimalFormat("##.00");  
								
						for(AlunoVO aluno  :lista) {
							//adiciona uma linha na tabela
							//// AlunoVO(String prontuario, String nome, int idade, String curso, BigDecimal media, Date dataNascimento);
							modelo.addRow(new Object[] {aluno.getProntuario(), aluno.getNome(), aluno.getIdade(),aluno.getDisciplina(), formataMedia.format(aluno.getMedia()),formataDtNas.format(aluno.getDataNascimento())});
						}

					} // fim actionPerformed

				} // fim construtor ActionListener
			);	// fim do método addActionListener

		buttonGerarRelatorio.addActionListener(//classe interna anonima
				new ActionListener() { //metodo ouvinte
					public void actionPerformed(ActionEvent e) {

						JOptionPane.showMessageDialog(ConsultaAlunoVisaoFrame.this, "implementar o código para gerar o dados em arquivo.");
						//colocar aqui a chamada do método que
						// obtem os dados da tabela e gera o arquivo
					
					}
				}
			);		

		buttonFechar.addActionListener(//classe interna anonima
				new ActionListener() { //metodo ouvinte
					public void actionPerformed(ActionEvent e) {

						ConsultaAlunoVisaoFrame.this.fechar();

					}
				}
		);		

	}

	public void fechar() {

		this.dispose();

	}

	
	//Funcionamento do JGoodies
	private void montaPainel() {

		//aqui adiciona os elemento gráficos na tela
		add(painel);
		add(buttonListar);
		add(buttonGerarRelatorio);
		add(buttonFechar);
	}

	// Metodo pesquisa no banco os dados da tabela
	private ArrayList<AlunoVO> pesquisarAlunos() {
		
											   //acesso ao banco de dados
		ArrayList<AlunoVO> listaReservaVO = new ArrayList<AlunoVO>(); 

		// AlunoVO(String prontuario, String nome, int idade, String curso, BigDecimal media, Date dataNascimento);
		AlunoVO a1 = new AlunoVO( "ht101", "Aninha", 14, "LPA TA", new BigDecimal(8.50), new Date() );
		AlunoVO a2 = new AlunoVO( "ht102", "Joãozinho", 15, "LPA TA", new BigDecimal(7.50), new Date() );
		AlunoVO a3 = new AlunoVO( "ht103", "Mariazinha", 16, "LPA TA", new BigDecimal(10.00), new Date() );

		listaReservaVO.add(a1);
		listaReservaVO.add(a2);
		listaReservaVO.add(a3);
		
		return listaReservaVO;
	}


	public static void main(String[]args) {
		
		ConsultaAlunoVisaoFrame c = new ConsultaAlunoVisaoFrame();
		c.setSize(580, 600);
		c.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		c.setVisible(true);
	}
}

