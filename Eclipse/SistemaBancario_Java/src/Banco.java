import java.util.Scanner;

public class Banco {

	public static void main(String[] args) {

			float saldo = 1000;
			float saque = 0;
			float deposito = 0;
			int opcao;
			int senha = 1234;
			int vezes =0;
			int contador = 2;
			int resta = 2;
			
			Scanner s = new Scanner (System.in);
			
			System.out.print("\n#Bem-vindo#\n");
			System.out.println("\nDigite sua senha: \n");
			
			senha = s.nextInt();
			
		 	while(senha!=1234){
		 		if(resta>0) {
		 			vezes++;
		 			
		 			System.out.printf("Senha Incorreta! Tentativas Restantes: %d",resta);
		 			
					resta = contador-vezes;
					
					System.out.println("\\n\\n Digite sua Senha:\\n");
					senha = s.nextInt();
					
		 		}
		 		else {
		 			System.out.println("\\n***CARTAO BLOQUEADO***");
		 			
		 		}
		 			
		 	}
		 	while(senha == 1234){


		 		System.out.println("\\n\\n---BANCO DS---");
		 		System.out.println("1 - Ver Saldo");
		 		System.out.println("2 - Sacar");
		 		System.out.println("3 - Depositar");
		 		System.out.println("4 - Encerrar");
		 		System.out.println("----------------\\n");

		 		opcao = s.nextInt();
		 		
		 		switch(opcao) {
		 		case 1:
		 			System.out.printf("\\nSaldo: R$ %.2f", saldo);
		 			break;
		 			
		 		case 2:
		 			if(saldo <=0) {
			 			System.out.println("\\n**Erro! Saldo Insuficiente**");

		 			}
		 			else {
			 			System.out.println("\\nQuantos Voce quer Sacar:\n");
			 			saque =s.nextFloat();
			 			
			 			if(saque>saldo) {
			 				System.out.println("\\n**Erro! Saldo Insuficiente**");
			 			}
			 			else {
			 				saldo = saldo - saque;
			 				System.out.printf("\\nSaldo: R$ %.2f",saldo);
			 			}

		 			}
		 			break;
		 			
		 		case 3:
		 			System.out.println("\\nQuanto Voce quer Depositar:");
		 			deposito = s.nextFloat();
		 			
		 			saldo = saldo+deposito;
		 			System.out.printf("(\"\\nSaldo: R$ %.2f",saldo);
		 			break;
		 		
		 		case 4:
		 			System.exit(contador);
		 			break;
		 		}
	}

}
}
