package visao;

import javax.swing.JFrame;
import controle.MusicaControle;

public class MusicaListaVisaoFrameApp {

	public static void main(String[] args) {
		
		MusicaControle m = new MusicaControle();
			
		MusicaListaVisaoFrame musicaListFrame = new MusicaListaVisaoFrame();
		
		musicaListFrame.setResizable(false);
	
		musicaListFrame.setSize( 600, 600 ); // set frame size
		
		musicaListFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
		
		musicaListFrame.setVisible(true);	
		
	}// fim metodo main

}// fim classe

