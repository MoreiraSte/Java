

import java.awt.BorderLayout;// imports
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;



import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
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


public class Calc extends JFrame { //class

    Double valor1, valor2; // váriaveis usadas para realizar os cálculos

    String sinal;
    private String digitosArray, recebeCampo, recebeArrayOp;

    JButton bntMA;
    JButton bntME;
    JButton bntDiv;
    JButton bntMult;
    JButton bntCE;
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
    JButton btnE;
    JButton btnPoint;



    private JPanel contentPane;
    private JTextField txtResultado;



    public static void main(String[] args) {
        Calc frame = new Calc();
        frame.setVisible(true);
    }

    //Criando o frame//

    public Calc() {
        super("Calculadora");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 445, 350);
        contentPane = new JPanel();
        contentPane.setBackground(Color.black);
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);





        // botao ponto

        JButton btnPoint = new JButton("."); // botão do ponto (.)
        btnPoint.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                txtResultado.setText(txtResultado.getText() + ".");

            }
        }); // completion
        btnPoint.setBounds(325, 215, 70, 32);
        btnPoint.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        contentPane.add(btnPoint);


        //Botão Limpar Tudo//

        JButton btnCE = new JButton("CE");
        btnCE.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                txtResultado.setText("");


            }
        });

        btnCE.setBounds(325, 171, 70, 32);
        btnCE.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        contentPane.add(btnCE);

        //fim

        //Tela de resultado//

        txtResultado = new JTextField();
        txtResultado.setEditable(false); // impede que cloque numeros através do teclado, além da caixa de texto não ser mais clicavel
        txtResultado.setBounds(0, 23, 429, 37);
        contentPane.add(txtResultado);
        txtResultado.setColumns(10);
        //fim//


        //Botão igual//

        JButton button_10 = new JButton("=");
        button_10.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                valor2 = Double.parseDouble(txtResultado.getText());

                if (sinal == "soma") {
                    txtResultado.setText(String.valueOf(valor1 + valor2));
                }

                if (sinal == "menos") {
                    txtResultado.setText(String.valueOf(valor1 - valor2));
                }


                if (sinal == "vezes") {
                    txtResultado.setText(String.valueOf(valor1 * valor2));
                }


                if (sinal == "divisao") {
                    txtResultado.setText(String.valueOf(valor1 / valor2));
                }

            }
        }); // completion
        button_10.setBounds(160, 240, 80, 45);
        button_10.setFont(new Font("Arial", Font.PLAIN, 15));
        contentPane.add(button_10);


        //Botão do + //

        JButton btnMA = new JButton("+");
        btnMA.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                valor1 = Double.parseDouble(txtResultado.getText());
                txtResultado.setText("");
                sinal = "soma";

            }
        }); // completion
        btnMA.setBounds(240, 90, 60, 45);
        btnMA.setFont(new Font("Arial", Font.PLAIN, 21));
        contentPane.add(btnMA);

        // Botão do - //

        JButton btnME = new JButton("-");
        btnME.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                valor1 = Double.parseDouble(txtResultado.getText());
                txtResultado.setText("");
                sinal = "menos";
            }
        }); // completion
        btnME.setBounds(240, 140, 60, 45);
        btnME.setFont(new Font("Arial", Font.PLAIN, 21));
        contentPane.add(btnME);

        //Botão da Multiplicação//

        JButton btnMult = new JButton("x");
        btnMult.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                valor1 = Double.parseDouble(txtResultado.getText());
                txtResultado.setText("");
                sinal = "vezes";

            }
        }); // completion
        btnMult.setBounds(240, 240, 60, 45);
        btnMult.setFont(new Font("Arial", Font.PLAIN, 21));
        contentPane.add(btnMult);

        //Botão da Divisão//

        JButton bntDiv = new JButton("/");
        bntDiv.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                valor1 = Double.parseDouble(txtResultado.getText());
                txtResultado.setText("");
                sinal = "divisao";
            }
        }); // completion
        bntDiv.setBounds(240, 190, 60, 45);
        bntDiv.setFont(new Font("Arial", Font.PLAIN, 21));
        contentPane.add(bntDiv);


        // Botão 1 //

        JButton btn_1 = new JButton("1\r\n");
        btn_1.setBounds(0, 90, 80, 45);
        btn_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        btn_1.setFocusable(false);
        btn_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                recebeCampo = txtResultado.getText();


                    txtResultado.setText(recebeCampo + "1");
            }
        });
        contentPane.add(btn_1);
        //fim

        //Botão 2 //

        btn_2 = new JButton("2");
        btn_2.setFocusable(false);
        btn_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                recebeCampo = txtResultado.getText();

                    txtResultado.setText(recebeCampo + "2");
            }
        });

        btn_2.setBounds(80, 90, 80, 45);
        btn_2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        contentPane.add(btn_2);
        //fim

        //Botão 3//

        btn_3 = new JButton("3");
        btn_3.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        btn_3.setBounds(160, 90, 80, 45);
        btn_3.setFocusable(false);
        btn_3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                recebeCampo = txtResultado.getText();

                    txtResultado.setText(recebeCampo + "3");
            }
        });
        contentPane.add(btn_3);
        //fim

        // Botão 4//

        btn_4 = new JButton("4");
        btn_4.setFocusable(false);
        btn_4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                recebeCampo = txtResultado.getText();

                    txtResultado.setText(recebeCampo + "4");
            }
        });
        btn_4.setBounds(0, 140, 80, 45);
        btn_4.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        contentPane.add(btn_4);
        //fim

        // Botão 5 //

        btn_5 = new JButton("5\r\n");
        btn_5.setFocusable(false);
        btn_5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                recebeCampo = txtResultado.getText();

                    txtResultado.setText(recebeCampo + "5");
            }
        });
        btn_5.setBounds(80, 140, 80, 45);
        btn_5.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        contentPane.add(btn_5);
        //fim

        //Botão 6//

        btn_6 = new JButton("6");
        btn_6.setFocusable(false);
        btn_6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                recebeCampo = txtResultado.getText();

                    txtResultado.setText(recebeCampo + "6");
            }
        });
        btn_6.setBounds(160, 140, 80, 45);
        btn_6.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        contentPane.add(btn_6);
        //fim

        //Botão 7//

        btn_7 = new JButton("7");
        btn_7.setFocusable(false);
        btn_7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                recebeCampo = txtResultado.getText();

                    txtResultado.setText(recebeCampo + "7");
            }
        });
        btn_7.setBounds(0, 190, 80, 45);
        btn_7.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        contentPane.add(btn_7);
        //fim

        //Botão 8//

        btn_8 = new JButton("8");
        btn_8.setFocusable(false);
        btn_8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                recebeCampo = txtResultado.getText();

                    txtResultado.setText(recebeCampo + "8");
            }
        });
        btn_8.setBounds(80, 190, 80, 45);
        btn_8.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        contentPane.add(btn_8);
        //fim

        //Botão 9//

        btn_9 = new JButton("9");
        btn_9.setFocusable(false);
        btn_9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                recebeCampo = txtResultado.getText();

                    txtResultado.setText(recebeCampo + "9");
            }
        });
        btn_9.setBounds(160, 190, 80, 45);
        btn_9.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        contentPane.add(btn_9);
        //fim

        //Botão 0//

        btn_0 = new JButton("0");
        btn_0.setFocusable(false);
        btn_0.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                recebeCampo = txtResultado.getText();

                    txtResultado.setText(recebeCampo + "0");
            }
        });
        btn_0.setBounds(80, 240, 80, 45);
        btn_0.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        contentPane.add(btn_0);
        //fim


    }
}