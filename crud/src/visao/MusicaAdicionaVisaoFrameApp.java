package visao;

import javax.swing.JFrame;
import controle.MusicaControle;

public class MusicaAdicionaVisaoFrameApp {

	public static void main(String[] args) {
		
		MusicaControle m = new MusicaControle();
			
		MusicaAdicionaVisaoFrame musicaAddFrame = new MusicaAdicionaVisaoFrame();
		
		musicaAddFrame.setResizable(false);
	
		musicaAddFrame.setSize( 300, 300 ); // set frame size
		
		musicaAddFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
		
		musicaAddFrame.setVisible(true);	
	
	}// fim metodo main

}// fim da classe

