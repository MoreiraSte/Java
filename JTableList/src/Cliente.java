import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Cliente extends JFrame {
    private DefaultTableModel modelo;

    public static void main(String[] args) {
        new Cliente();
    }

    public Cliente(){

        Container painel = new JPanel();
        painel.setSize(new Dimension(400,300));

        DefaultTableModel dadosClientes = new DefaultTableModel();
        dadosClientes.addColumn("ID");
        dadosClientes.addColumn("Nome");
        dadosClientes.addColumn("Email");
        dadosClientes.addColumn("Dt Nascimento");


        JTable table = new JTable(dadosClientes);
        painel.add(table);

       JScrollPane painelTable = new JScrollPane(table);
       painelTable.setPreferredSize(new Dimension(300,200));
       painel.add(painelTable);


        JButton bAdd = new JButton("Adicionar");
       bAdd.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               String nome,email,dtNasc;
               int id =  dadosClientes.getRowCount() + 1;

               //id = JOptionPane.showInputDialog(null,"Entre com o id: \n");
               nome = JOptionPane.showInputDialog(null,"Entre com o nome: \n");
               email= JOptionPane.showInputDialog(null,"Entre com o email: \n");
               dtNasc = JOptionPane.showInputDialog(null,"Entre com a Data de Nacimento: \n");

               dadosClientes.addRow(new Object[]{id,nome,email,dtNasc});





           }
       });

        painel.add(bAdd);

        Container conteudo = getContentPane();
        conteudo.add(painel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400,400);
        setVisible(true);
    }
}
