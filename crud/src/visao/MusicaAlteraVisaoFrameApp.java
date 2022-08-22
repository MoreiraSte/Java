package visao;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import controle.MusicaControle;

public class MusicaAlteraVisaoFrameApp {

	public static void main(String[] args) {
		
		MusicaControle m = new MusicaControle();
		
		int cod= Integer.parseInt(JOptionPane.showInputDialog( "Digite o codigo da musica:"));
			
		MusicaAlteraVisaoFrame musicaAlterFrame = new MusicaAlteraVisaoFrame(m);
		
		musicaAlterFrame.setResizable(false);
	
		musicaAlterFrame.setSize( 300, 300 ); // set frame size
		
		musicaAlterFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
		
		musicaAlterFrame.setVisible(true);	
		
	}// fim metodo main

}// fim da classe



