package visao;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import controle.MusicaControle;

public class MusicaRemoveVisaoFrameApp {

	public static void main(String[] args) {
		
		MusicaControle m = new MusicaControle();
		
		int cod= Integer.parseInt(JOptionPane.showInputDialog( "Digite o codigo da musica:"));
			
		MusicaRemoveVisaoFrame musicaRemovFrame = new MusicaRemoveVisaoFrame(m);
		
		musicaRemovFrame.setResizable(false);
	
		musicaRemovFrame.setSize( 500, 500 ); // set frame size
		
		musicaRemovFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
		
		musicaRemovFrame.setVisible(true);	
		
	}// fim metodo main
	
}// fim classe

