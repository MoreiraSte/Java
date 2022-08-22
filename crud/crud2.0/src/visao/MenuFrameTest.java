package visao;

import javax.swing.JFrame;
import javax.swing.UIManager;

public class MenuFrameTest
{
   public static void main( String[] args )
   { 
 //      UIManager.setLookAndFeel();

	   MenuFrame menuFrameSimples = new MenuFrame(); // cria MenuFrame 
	   menuFrameSimples.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
	   menuFrameSimples.setSize( 300, 200 ); // set tamanho da janela
	   menuFrameSimples.setVisible( true ); // mostra frame

   } // fim main
} // fim classe
