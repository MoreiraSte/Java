package ex3;

public class CampoBatalha {

	public static boolean combate(Personagem atacante,Personagem defensor) {
		
		if(atacante.pontAtaque > defensor.capacDefesa) {
			defensor.vida -= atacante.pontAtaque;
		}
		else {
			defensor.capacDefesa -= atacante.pontAtaque / 2;
		}
		if (defensor.vida <= 0) {
			return true;
		}
		else {
			return false;
		}
		
	}
}
