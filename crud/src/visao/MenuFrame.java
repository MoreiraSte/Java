/***
 * Mostra uso de menu COM InternalFrame 
 */
package visao;
import java.awt.event.ActionListener;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JMenuBar;

public class MenuFrame extends JFrame 
{
	private JDesktopPane desktop; //Janela PAI para uso InternalFrame
 
    public MenuFrame() 
    {
        // herda classe
        super("Menu Principal - Musicas");
         
      //Menus da barra:cadastro / Relatorios / Ajuda
      		JMenu cadastroMenu = new JMenu( "Cadastro" ); // cria menu cadastro
      		cadastroMenu.setMnemonic( 'C' ); // set mnemonico para C

   
      		JMenu ajudaMenu = new JMenu( "Ajuda" ); // cria menu ajuda
      		ajudaMenu.setMnemonic( 'A' ); // set mnemonico para A

      		// SubMenu Cadastro: musica
      		JMenu musicaMenu = new JMenu( "Musica" ); // cria menu Aluni
      		musicaMenu.setMnemonic( 'l' ); // set mnemonico para l
      		JMenuItem sairItem = new JMenuItem( "Sair" ); // cria item sair
      		sairItem.setMnemonic( 'S' ); // set mnemonic to S
      		
      		//Adiciona ao MENU CADASTRO
      		cadastroMenu.add(musicaMenu);
      		cadastroMenu.addSeparator();
      		cadastroMenu.addSeparator();
      		cadastroMenu.add(sairItem);

      		// criar os item de menu para MUSICA:CRUD
      		JMenuItem adicionaMusicaItem = new JMenuItem( "Adiciona" );
      		musicaMenu.add(adicionaMusicaItem);
      		JMenuItem listaMusicaItem = new JMenuItem( "Lista" );
      		musicaMenu.add(listaMusicaItem);
      		JMenuItem alteraMusicaItem = new JMenuItem( "Altera" );
      		musicaMenu.add(alteraMusicaItem);
      		JMenuItem removeMusicaItem = new JMenuItem( "Remove" );
      		musicaMenu.add(removeMusicaItem);

      		//Item de AJUDA
      		JMenuItem sobreItem = new JMenuItem( "Sobre..." );
      		sobreItem.setMnemonic( 'S' ); // set mnemonico para S
      		ajudaMenu.add( sobreItem ); //adiciona o item no Menu

      		// CRIANDO A BARRA E ADICIONANDO OS MENU
      		JMenuBar barra = new JMenuBar(); // cria a barra de menu
      		setJMenuBar( barra ); // adiciona a barra de menu bar para na janela
      		barra.add( cadastroMenu ); // adiciona o menu Cadastro para a barra menu
      		barra.add(ajudaMenu);

      		//Cria o JDesktopPane que gerencia os Frames internos JInternalFrame
      		desktop = new JDesktopPane();
      		add(desktop); // adiciona o Painel Pai no no frame
      		
      		//TRATAMENTO DOS EVENTOS DOS ITENS DO MENU
      		adicionaMusicaItem.addActionListener(
      				new ActionListener(){ // classe interna anonima
      					public void actionPerformed( ActionEvent event ){
      						MusicaAdicionaVisaoFrame musicaAddInternalFrame = new MusicaAdicionaVisaoFrame();		
      						musicaAddInternalFrame.setResizable(false);
      						musicaAddInternalFrame.setSize( 300, 300 ); // set frame size
      						musicaAddInternalFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
      					
      						desktop.add(musicaAddInternalFrame);

      						musicaAddInternalFrame.setVisible(true);
      					
      					} // fim  metodo actionPerformed
      				} // fim classe interna anonima 
      				); // fim chamada para addActionListener

      		listaMusicaItem.addActionListener(
      				new ActionListener(){ // classe interna anonima
      					public void actionPerformed( ActionEvent event ){
      						MusicaListaVisaoFrame musicaAddInternalFrame = new MusicaListaVisaoFrame();
      						musicaAddInternalFrame.setResizable(false);
      						musicaAddInternalFrame.setSize( 300, 400 ); // set frame size
      						musicaAddInternalFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE );
      						
      						desktop.add(musicaAddInternalFrame);
      						
      						musicaAddInternalFrame.setVisible(true);
      					} // fim  metodo actionPerformed
      				} // fim classe interna anonima 
      				); // fim chamada para addActionListener


      		removeMusicaItem.addActionListener(
      				new ActionListener(){ // classe interna anonima
      					public void actionPerformed( ActionEvent event ){
      						MusicaRemoveVisaoFrame musicaRemoveFrame = new MusicaRemoveVisaoFrame();
      						musicaRemoveFrame.setResizable(false);
      						musicaRemoveFrame.setSize( 300, 300 ); // set frame size
      						musicaRemoveFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );

      						desktop.add(musicaRemoveFrame);
      						
      						musicaRemoveFrame.setVisible(true);
      					} // fim  metodo actionPerformed
      				} // fim classe interna anonima 
      				); // fim chamada para addActionListener

      		alteraMusicaItem.addActionListener(
      				new ActionListener(){ // classe interna anonima
      					public void actionPerformed( ActionEvent event ){
      						JOptionPane.showMessageDialog( MenuFrame.this,
      								"Colocar o código para a janela InternalFrame\n"
      								+ "de ALTERA musica AQUI!!!",
      								"Altera musica", JOptionPane.PLAIN_MESSAGE );
      					} // fim  metodo actionPerformed
      				} // fim classe interna anonima 
      				); // fim chamada para addActionListener

      		sairItem.addActionListener(
      				new ActionListener() {
      					public void actionPerformed( ActionEvent event ){
      						JOptionPane.showMessageDialog( MenuFrame.this,
      								"Colocar o código para chamar o método\n"
      										+ "que FECHA O BANCO AQUI antes do exite!!!",
      										"Fechando aplicação", JOptionPane.PLAIN_MESSAGE );

      						System.exit( 0 ); // encerra aplicação
      					} // fim  metodo actionPerformed
      				} // fim classe interna anonima 
      				); // fim chamada para addActionListener

      		sobreItem.addActionListener(
      				new ActionListener(){ // anonymous inner class
      					public void actionPerformed( ActionEvent event ){
      						JOptionPane.showMessageDialog( MenuFrame.this,
      								"Este é um exemplo de usando \n MENU em Java\n"
      								+ "utilizando JInternalFrame",
      								"Sobre", JOptionPane.PLAIN_MESSAGE );
      					} // fim  metodo actionPerformed
      				} // fim classe interna anonima 
      				); // fim chamada para addActionListener

      		
      	} // fim construtor  MenuFrameExamplo constructor

      } // fim classe


