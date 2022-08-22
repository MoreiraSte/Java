package visao;

import java.awt.event.ActionListener;
import java.awt.Container;
import java.awt.event.ActionEvent;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JMenuBar;

public class MenuFrame extends JFrame 
{
	 private JLabel texto;
   // no-argument constructor set up GUI
   public MenuFrame()
   {
	   
      super( "Menu Principal");   
 
      
      
      // adiciona painel ao frame
      //Menus da barra:cadastro / Ajuda

      texto = new JLabel("Programa para cadastrar e alterar musicas!!");
      add(texto);
      
      JMenu cadastroMenu = new JMenu( "Cadastro" ); // cria menu cadastro
      cadastroMenu.setMnemonic( 'C' ); // set mnemonico para C

 
      JMenu ajudaMenu = new JMenu( "Ajuda" ); // cria menu ajuda
      ajudaMenu.setMnemonic( 'A' ); // set mnemonico para A

      
      // SubMenu Cadastro: Musica
      JMenu musicaMenu = new JMenu( "Musica" ); // cria menu Aluni
      musicaMenu.setMnemonic( 'l' ); // set mnemonico para l
      
  

      JMenuItem sairItem = new JMenuItem( "Sair" ); // create exit item
      sairItem.setMnemonic( 'S' ); // set mnemonic to x
      sairItem.addActionListener(
    		  new ActionListener() // anonymous inner class
    		  {  
    			  // terminate application when user clicks exitItem
    			  public void actionPerformed( ActionEvent event )
    			  {
    				  JOptionPane.showMessageDialog( MenuFrame.this,
  	                  "Colocar o código para chamar o método\n"
	    	                  + "que FECHA O BANCO AQUI antes do exite!!!",
	    	                  "Fechando aplicação", JOptionPane.PLAIN_MESSAGE );

    				  System.exit( 0 ); // encerra aplicação
    			  } // fim  metodo actionPerformed
    		  } // fim classe interna anonima 
    	); // fim chamada para addActionListener

      
	//Adiciona ao MENU CADASTRO
      cadastroMenu.add(musicaMenu);
      cadastroMenu.addSeparator();
      cadastroMenu.addSeparator();
      cadastroMenu.add(sairItem);
      
      
      //ADICIONA
      JMenuItem adicionaMusica = new JMenuItem( "Adiciona" );
      musicaMenu.add(adicionaMusica);
      adicionaMusica.addActionListener(
    	         new ActionListener() // classe interna anonima
    	         {  
    	            // mostra mensagem quando usuario seleciona adicona...
    	            public void actionPerformed( ActionEvent event )
    	            {
    	            	
    	            	MusicaAdicionaVisaoFrame musicaAddFrame = new MusicaAdicionaVisaoFrame(null);
    	            	musicaAddFrame.setResizable(false);
    	            	musicaAddFrame.setSize( 300, 300 ); // set frame size
    	            	musicaAddFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE );
    	            	musicaAddFrame.setVisible(true);
    	            
    	            } // fim  metodo actionPerformed
       		  } // fim classe interna anonima 
       	); // fim chamada para addActionListener
      

      //Consulta 
      JMenuItem listaMusicaItem = new JMenuItem( "Lista" );
      musicaMenu.add(listaMusicaItem);
      listaMusicaItem.addActionListener(
    	         new ActionListener() // classe interna anonima
    	         {  
    	            // mostra mensagem quando usuario seleciona adicona...
    	            public void actionPerformed( ActionEvent event )
    	            {

    	            	MusicaListaVisaoFrame musicaAddFrame = new MusicaListaVisaoFrame(null);
    	            	musicaAddFrame.setResizable(false);
    	            	musicaAddFrame.setSize( 390, 400 ); // set frame size
    	            	musicaAddFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE );
    	            	musicaAddFrame.setVisible(true);

    	            } // fim  metodo actionPerformed
       		  } // fim classe interna anonima 
       	); // fim chamada para addActionListener
      
      JMenuItem alteraMusicaItem = new JMenuItem( "Altera" );
      musicaMenu.add(alteraMusicaItem);
      alteraMusicaItem.addActionListener(
    		  new ActionListener() // classe interna anonima
  	         {  
  	            // mostra mensagem quando usuario seleciona adicona...
  	            public void actionPerformed( ActionEvent event )
  	            {
  	               
  	            	MusicaAlteraVisaoFrame musicaAddFrame = new MusicaAlteraVisaoFrame(null);
  	            	musicaAddFrame.setResizable(false);
  	            	musicaAddFrame.setSize( 300, 300 ); // set frame size
  	            	musicaAddFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE );
  	            	musicaAddFrame.setVisible(true);

  	            } // fim  metodo actionPerformed
     		  } // fim classe interna anonima 
     	); // fim chamada para addActionListener


      
      //REMOVE
      JMenuItem removeMusicaItem = new JMenuItem( "Remove" );
      musicaMenu.add(removeMusicaItem);
      removeMusicaItem.addActionListener(
    		  new ActionListener() // classe interna anonima
 	         {  
 	            // mostra mensagem quando usuario seleciona adicona...
 	            public void actionPerformed( ActionEvent event )
 	            {
 	               
 	            	MusicaRemoveVisaoFrame musicaAddFrame = new MusicaRemoveVisaoFrame(null);
 	            	musicaAddFrame.setResizable(false);
 	            	musicaAddFrame.setSize( 400,300 ); // set frame size
 	            	musicaAddFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE );
 	            	musicaAddFrame.setVisible(true);

 	            } // fim  metodo actionPerformed
    		  } // fim classe interna anonima 
    	); // fim chamada para addActionListener

      
      //Item de AJUDA
      JMenuItem sobreItem = new JMenuItem( "Sobre..." );
      sobreItem.setMnemonic( 'S' ); // set mnemonico para S
            
      ajudaMenu.add( sobreItem ); //adiciona o item no Menu
      sobreItem.addActionListener(
         new ActionListener() // anonymous inner class
         {  
            // display message dialog when user selects About...
            public void actionPerformed( ActionEvent event )
            {
               JOptionPane.showMessageDialog( MenuFrame.this,
                  "Este eh um programa que adiciona suas musicas!!",
                  "Sobre", JOptionPane.PLAIN_MESSAGE );
            } // fim  metodo actionPerformed
		  } // fim classe interna anonima 
	); // fim chamada para addActionListener
    
      // CRIANDO A BARRA E ADICIONANDO OS MENU
      JMenuBar barra = new JMenuBar(); // cria a barra de menu
      
      setJMenuBar( barra ); // adiciona a barra de menu bar para na janela
      
      barra.add( cadastroMenu ); // adiciona o menu Cadastro para a barra menu

      barra.add(ajudaMenu);
      
   } // fim construtor  MenuFrameExamplo constructor

} // fim classe