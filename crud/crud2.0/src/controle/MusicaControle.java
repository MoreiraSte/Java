package controle;

import java.util.ArrayList;
import modelo.MusicaModelo;
import modelo.MusicaVO;

public class MusicaControle {

	private MusicaModelo musicaModelo;
	
	public MusicaControle() {

		musicaModelo = new MusicaModelo();
	}
	
	public boolean ehCinematecaVazia() {
		
		if (musicaModelo.ehCinematecaVazia())
			return true;
		else
			return false;
	}

	public ArrayList<MusicaVO> obterTodasMusicas() {

		ArrayList<MusicaVO> cinemateca = musicaModelo.obterTodasMusicas();			
		return cinemateca;
	}

	public boolean existeMusica(int codigo) {
	
		boolean existe;		
		existe = musicaModelo.existeMusica(codigo);		
		return existe;
	}

	public void adiciona(MusicaVO novaMusica) {
		
		musicaModelo.adiciona(novaMusica);		
	}

	
	public MusicaVO obterMusica(int cod) {
	
		MusicaVO musica = null;		
		musica = musicaModelo.obterMusica(cod);		
		return musica;
	}
	
	public void remove(MusicaVO musica) {
	
		musicaModelo.remove(musica);		
	}

	public void alterarMusica(MusicaVO musicaAlterada) {
				
		musicaModelo.alterarMusica(musicaAlterada);		
	}
}
