package ex3;

public class Main {

	public static void main(String[] args) {

		Personagem goku = new Personagem ("sayajin", 300, 65,40,false);
		Personagem naruto = new Personagem("ninja", 400,78,75,true);
		
//		boolean matou = CampoBatalha.combate(danilinho,josias);
//		System.out.println(matou + "\nvida:    " + josias.vida + "\ndefesa:   " + josias.capacDefesa);
		
	//	CampoBatalha campo = new CampoBatalha();

		boolean matou;
		
		do {
			
			matou = CampoBatalha.combate(naruto, goku);
			System.out.println("          " + goku.vida + " vida:  " + goku.capacDefesa);
			
		}while(matou == false);
	}

}
