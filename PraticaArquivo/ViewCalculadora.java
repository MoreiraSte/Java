
import java.awt.BorderLayout;// imports
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.Panel;

import javax.swing.SwingConstants;
import javax.swing.ButtonGroup;
import java.util.Scanner;


public class ViewCalculadora extends JFrame { //class
	
	Double valor1, valor2; // váriaveis usadas para realizar os cálculos
	String sinal; 
	

	int n, p;
	
	JButton btn_1;
	JButton btn_2;
	JButton btn_3;
	JButton btn_4;
	JButton btn_5;
	JButton btn_6;
	JButton btn_7;
	JButton btn_8;
	JButton btn_9;
	JButton btn_0;
	JButton btn_10;
	JButton btn_11;


	JButton btnPermutacao;
	JButton btnCombinacao;
	JButton btnArranjo;
	JButton btnPermutCir;
	
	private JPanel contentPane;
	private JTextField txtViewCalculadora;
	private JTextField txtResultado;
	private JTextField txtN;
	private JTextField txtP;
	
	public static void main(String[] args) {
			ViewCalculadora frame = new ViewCalculadora();
			frame.setVisible(true);
	} 

	//Criando o frame//
	
	public ViewCalculadora() {
		super("Calculadora Combinatoria");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 462, 520);
		contentPane = new JPanel();
		contentPane.setBackground(Color.black);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
			//Botão Limpar Tudo//
			
		JButton btn_Limpar = new JButton("CE"); 
		btn_Limpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResultado.setText("");
				txtN.setText("");
				txtP.setText("");
			}
		}); 
		
		btn_Limpar.setBounds(307, 164, 70, 32);
		btn_Limpar.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		contentPane.add(btn_Limpar);
		
		//fim
		
		//Tela de resultado//
		
		txtResultado = new JTextField();
		txtResultado.setBounds(16, 23, 424, 37);
		contentPane.add(txtResultado);
		txtResultado.setColumns(10);
		//fim//
		
		//Espaço para digitar o número//
		
		JLabel num = new JLabel("Número:");
		num.setForeground(Color.white);
		num.setFont(new Font("Tohoma", 0, 15));
		num.setBounds(30, 164, 60, 37);
		contentPane.add(num);
		
		txtN = new JTextField();
		txtN.setBounds(33, 209, 50, 34);
		contentPane.add(txtN);
		txtN.setColumns(10);
		//fim//
		
		//Espaço para digitar a posição//
		
		JLabel posi = new JLabel("Posição:");
		posi.setForeground(Color.white);
		posi.setFont(new Font("Tohoma", 0, 15));
		posi.setBounds(120, 164, 60, 37);
		contentPane.add(posi);
		
		txtP = new JTextField();
		txtP.setBounds(123, 209, 50, 34);
		contentPane.add(txtP);
		txtP.setColumns(10);
		//fim//
		
		// Botão limpar variavel//
		
		JButton btnC_1 = new JButton("C"); 
		btnC_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor1 = null;
				valor2 = null;
				n = 0;
				p = 0;
				txtN.setText("");
				txtP.setText("");
			}
		}); 
		btnC_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btnC_1.setBounds(376, 164, 70, 32);
		contentPane.add(btnC_1);
		//fim
		JButton button_10 = new JButton("="); //button equal (=)
		button_10.addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent e) {
				valor2 = Double.parseDouble(txtResultado.getText());
				
				if (sinal == "soma") {
					txtResultado.setText (String.valueOf( valor1 + valor2));
				}
				
				if (sinal == "menos") {
					txtResultado.setText (String.valueOf( valor1 - valor2));
				}
				

				if (sinal == "vezes") {
					txtResultado.setText (String.valueOf( valor1 * valor2));
				}
				

				if (sinal == "divisao") {
					txtResultado.setText (String.valueOf( valor1 / valor2));
				}
			}
		}); // completion
		button_10.setBounds(384, 280, 54, 180);
		button_10.setFont(new Font("Arial", Font.PLAIN, 15));
		contentPane.add(button_10);
		
		JButton btnN = new JButton("."); // point
		btnN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResultado.setText (txtResultado.getText() + ".");
				
			}
		}); // completion
		btnN.setBounds(307, 200, 70, 32);
		btnN.setFont(new Font("Arial Black", Font.PLAIN, 20));
		contentPane.add(btnN);
		
		JButton btnP = new JButton(","); // vírgula
		btnP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResultado.setText (txtResultado.getText() + ",");

			}
		}); // completion
		btnP.setBounds(376, 200, 70, 32);
		btnP.setFont(new Font("Arial Black", Font.PLAIN, 20));
		contentPane.add(btnP);
		
		JButton btnC = new JButton("+"); // button mais (+)
		btnC.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				valor1 = Double.parseDouble(txtResultado.getText());
				txtResultado.setText("");	
				sinal = "soma"; 	
			}
		}); // completion
		btnC.setBounds(280, 285, 60, 45);
		btnC.setFont(new Font("Arial", Font.PLAIN, 21));
		contentPane.add(btnC);
		
		JButton btnToClean = new JButton("-"); // button menos (-)
		btnToClean.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor1 = Double.parseDouble(txtResultado.getText());
				txtResultado.setText("");
				sinal = "menos";
			}
		}); // completion
		btnC.setBounds(280, 285, 60, 45);
		btnC.setFont(new Font("Arial", Font.PLAIN, 21));
		contentPane.add(btnC);
		
		// Botão 1 //
		
		JButton btn_1 = new JButton("1\r\n"); 
		btn_1.setBounds(40, 285, 80, 45);
		btn_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btn_1.setFocusable(false);
		btn_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (txtN.hasFocus() ) {
					txtN.setText (txtN.getText() + "1");
				}
				if (txtP.hasFocus() ) {
					txtP.setText (txtP.getText() + "1");
				}
			}
		}); 
		contentPane.add(btn_1);
		//fim
		
		//Botão 2 //
		
		btn_2 = new JButton("2"); 
		btn_2.setFocusable(false);
		btn_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (txtN.hasFocus() ) {
					txtN.setText (txtN.getText() + "2");
				}
				if (txtP.hasFocus() ) {
					txtP.setText (txtP.getText() + "2");
				}
			}
		}); 
		
		btn_2.setBounds(120, 285, 80, 45);
		btn_2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		contentPane.add(btn_2);
		//fim
		
		//Botão 3//
		
		btn_3 = new JButton("3"); 
		btn_3.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btn_3.setBounds(200, 285, 80, 45);
		btn_3.setFocusable(false);
		btn_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (txtN.hasFocus() ) {
					txtN.setText (txtN.getText() + "3");
				}
				if (txtP.hasFocus() ) {
					txtP.setText (txtP.getText() + "3");
				}
			}
		}); 
		contentPane.add(btn_3);
		//fim
		
		// Botão 4//
		
		 btn_4 = new JButton("4"); 
		 btn_4.setFocusable(false);
		btn_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (txtN.hasFocus() ) {
					txtN.setText (txtN.getText() + "4");
				}
				if (txtP.hasFocus() ) {
					txtP.setText (txtP.getText() + "4");
				}
			}
		});
		btn_4.setBounds(40, 330, 80, 45);
		btn_4.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		contentPane.add(btn_4);
		//fim
		
		// Botão 5 //
		
		btn_5 = new JButton("5\r\n");
		btn_5.setFocusable(false);
		 btn_5.addActionListener(new ActionListener() {
		 public void actionPerformed(ActionEvent e) {
				if (txtN.hasFocus() ) {
					txtN.setText (txtN.getText() + "5");
				}
				if (txtP.hasFocus() ) {
					txtP.setText (txtP.getText() + "5");
				}
			}
		}); 
		 btn_5.setBounds(120, 330, 80, 45);
		 btn_5.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		contentPane.add( btn_5);
		//fim
		
		//Botão 6//
		
		 btn_6 = new JButton("6");
		 btn_6.setFocusable(false);
		 btn_6.addActionListener(new ActionListener() {
		 public void actionPerformed(ActionEvent e) {
				if (txtN.hasFocus() ) {
					txtN.setText (txtN.getText() + "6");
				}
				if (txtP.hasFocus() ) {
					txtP.setText (txtP.getText() + "6");
				}
			}
		}); 
		 btn_6.setBounds(200, 330, 80, 45);
		 btn_6.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		contentPane.add( btn_6);
		//fim
		
		//Botão 7//
		
		 btn_7 = new JButton("7");
		 btn_7.setFocusable(false);
		 btn_7.addActionListener(new ActionListener() {
		 public void actionPerformed(ActionEvent e) {
				if (txtN.hasFocus() ) {
					txtN.setText (txtN.getText() + "7");
				}
				if (txtP.hasFocus() ) {
					txtP.setText (txtP.getText() + "7");
				}
			}
		});
		 btn_7.setBounds(40, 375, 80, 45);
		 btn_7.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		contentPane.add( btn_7);
		//fim
		
		//Botão 8//
		
		  btn_8 = new JButton("8");
		  btn_8.setFocusable(false);
		 btn_8.addActionListener(new ActionListener() {
		 public void actionPerformed(ActionEvent e) {
				if (txtN.hasFocus() ) {
					txtN.setText (txtN.getText() + "8");
					}
				if (txtP.hasFocus() ) {
					txtP.setText (txtP.getText() + "8");
				}
			 }	
		});
		 btn_8.setBounds(120, 375, 80, 45);
		 btn_8.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		contentPane.add( btn_8);
		//fim
		
		//Botão 9//
		
		 btn_9 = new JButton("9");
		 btn_9.setFocusable(false);
		 btn_9.addActionListener(new ActionListener() {
		 public void actionPerformed(ActionEvent e) {
				if (txtN.hasFocus() ) {
					txtN.setText (txtN.getText() + "9");
					}
					if (txtP.hasFocus() ) {
					txtP.setText (txtP.getText() + "9");
				}
			 }
		});
		 btn_9.setBounds(200, 375, 80, 45);
		 btn_9.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		contentPane.add( btn_9);
		//fim
		
		//Botão 0//
		
		 btn_0 = new JButton("0"); 
		 btn_0.setFocusable(false);
		 btn_0.addActionListener(new ActionListener() {
		 public void actionPerformed(ActionEvent e) {
				if (txtN.hasFocus() ) {
					txtN.setText (txtN.getText() + "0");
				}
				if (txtP.hasFocus() ) {
					txtP.setText (txtP.getText() + "0");
				}
			 }
		});
		 btn_0.setBounds(120, 420, 80, 45);
		 btn_0.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		contentPane.add( btn_0);
		//fim
		
		
		// Botão e calculo Permutação //
		
		
				btnPermutacao = new JButton(" P(n!/a,b,c)"); 
				btnPermutacao.setBorderPainted(false);
				btnPermutacao.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						n = Integer.parseInt(txtN.getText());
						p = Integer.parseInt(txtP.getText());
						int fat=1;
						int resul;
						
						if ( n!= 0) {
							
							if (n>=0) {
								for (int cont = 1; cont <= n; cont++) {
									fat = fat * cont;
							}
							
							resul = fat;
							txtResultado.setText(""+resul);		   
														
							}
						
						}
					}
				
				}); // completion
				btnPermutacao.setFont(new Font("Times New Roman", Font.PLAIN, 15));
				btnPermutacao.setBounds(232, 94, 105, 50);
				contentPane.add(btnPermutacao);
				
				//Botão e calculo Combinação//
				
				
				btnCombinacao = new JButton("C(n,p)"); 
				btnCombinacao.setBorderPainted(false);
				btnCombinacao.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						n = Integer.parseInt(txtN.getText());
						p = Integer.parseInt(txtP.getText());
						int cont;
						int fat = 1, fat2 = 1, fat3 = 1;
						int sub = 0;
//						int mult = 0;
						int resul = 0;
						
						if (n == 0) { 	
							txtResultado.setText("");
							return;
						}
						
						if ( n!= 0 && p != 0) {
							
						
								if (n>= 0) {
									for (cont = 1; cont <= n; cont++) {
										fat = fat * cont;
									}
									
									sub = (n-p);
									for (cont = 1; cont <= sub; cont++) {
										fat2 = fat2 * cont;
									}
								}
								
								if (p>= 0) {
										for (cont = 1; cont <= p; cont++) {
											fat3 = fat3 * cont;
										}
//									
//										mult = (fat2 * p);
//										for (cont = 1; cont <= mult; cont++) {
//											p = p * cont;
//										}
								}		
								resul = fat / (fat3 * fat2);
								txtResultado.setText(""+resul);

								
						} //fim  if ( n!= 0 && p == 0)
					}//fim action
				}); 
			
				
				btnCombinacao.setFont(new Font("Times New Roman", Font.PLAIN, 15));
				btnCombinacao.setBounds(122, 94, 105, 50);
				contentPane.add(btnCombinacao);
				
				n = 0;
				p =0;
				
						// Botão e calculo Arranjo//

				btnArranjo = new JButton("A(n,p)"); 
				btnArranjo.setBorderPainted(false);
				btnArranjo.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						n = Integer.parseInt(txtN.getText());
						p = Integer.parseInt(txtP.getText());
						int cont;
						int fat = 1, fat2 = 1;
						int sub = 0;
						int resul = 1000000;
							
						// obrigatorio
						if (n == 0) { 
							txtResultado.setText("");
							return;
						}
						
						if ( n!= 0 && p != 0) {
							
						//obrigatorio	
							if (n>= 0) {
								for (cont = 1; cont <= n; cont++) {
									fat = fat * cont;
								}
								
								sub = (n-p);
						       	
								for (cont = 1; cont <= sub; cont++) {
						       			fat2 = fat2 * cont;
								}
								resul = fat / fat2;
										
								txtResultado.setText(""+resul);
							}	
						}
					}
				}); 
				btnArranjo.setFont(new Font("Times New Roman", Font.PLAIN, 15));
				btnArranjo.setBounds(12, 94, 105, 50);
				contentPane.add(btnArranjo);
				
				//permutação circular
				btnPermutCir = new JButton("Pc(n-1!)"); 
				btnPermutCir.setBorderPainted(false);
				btnPermutCir.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					n = Integer.parseInt(txtN.getText());
					int cont;
					int fat = 1;
					int resul = 1000000;
					
					//obrigatorio
					if (n == 0) { 
						txtResultado.setText("");
						return;
					}
					
					if ( n!= 0) {
					
						//conta
						if(n >=0){
							n = n - 1;
					
							for(cont = 1; cont <= n; cont++){
								fat = fat * cont;
							}
							resul = fat;
							txtResultado.setText(""+resul);
						}
					}
				}
			});
			btnPermutCir.setFont(new Font("Times New Roman", Font.PLAIN, 15));
			btnPermutCir.setBounds(342, 94, 105, 50);
			contentPane.add(btnPermutCir);
	}
} //fim