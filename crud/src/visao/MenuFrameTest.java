package visao;

import javax.swing.JFrame;
import javax.swing.UIManager;

public class MenuFrameTest
{
   public static void main( String[] args )
   { 

	   MenuFrame menuFrameSimples = new MenuFrame(); // cria MenuFrame 
	   menuFrameSimples.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
	   menuFrameSimples.setSize( 800, 700 ); // set tamanho da janela
	   menuFrameSimples.setVisible( true ); // mostra frame

   } // fim main
} // fim classe
