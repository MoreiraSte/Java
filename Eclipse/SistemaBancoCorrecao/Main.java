import javax.swing.JOptionPane;

public class main {

	public static void main(String[] args) {
	
		int autenticado = 0, loopSenha = 0;
		String senhaCorreta="senai123";
		int tentativasSenha = 0;
		String senhaDigitada ="";
		int opcao=0;
		float saldo = 500f, valor = 0f;
		
		JOptionPane.showMessageDialog(null, "Bem-vindo ao nosso banco");
		
		while(loopSenha == 0)
		{
			senhaDigitada = JOptionPane.showInputDialog(null, "Digite a senha: ");
			
			if(senhaDigitada.equalsIgnoreCase(senhaCorreta)) {
				
				autenticado = 1;
				loopSenha =1;
				
				JOptionPane.showMessageDialog(null, "Usuario autenticado com sucesso");
			}
			else{
				tentativasSenha++;
			  
		
		
				if(tentativasSenha >=3 ){
					
					JOptionPane.showMessageDialog(null,"senha incorreta, cartao bloqueado");
					loopSenha = 1;
					
				}
				else{
					
					JOptionPane.showMessageDialog(null,"senha incorreta, tentativa" + tentativasSenha + "/3");
				}
			}
					
		}
		while(autenticado == 1){
			
			opcao = Integer.parseInt(JOptionPane.showInputDialog(null, "\nEscolha a opcao desejada" 
					+"\n1-saldo"+ "\n2-saque" +"\n3-depositos"+
					"\n4-encerrar"));
			
			
		
		switch(opcao){
			case 1:
				JOptionPane.showMessageDialog(null,"\nSeu saldo eh:" + saldo);
				
				break;
				
			case 2:
			
				valor =	Integer.parseInt(JOptionPane.showInputDialog(null, "Saldo em conta:" + saldo + "Digite o valor a ser sacado:"));

				
				if(valor > saldo ){
					JOptionPane.showMessageDialog(null,"Saldo insuficiente");
				}
				else{
					saldo = saldo - valor;
					JOptionPane.showMessageDialog(null,"\nSaldo:" + saldo);
				}
				
				break;
				
			case 3:
			
				valor =	Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor a ser depositado"));
				
				saldo += valor;
				
				break;
				
			case 4:
				JOptionPane.showMessageDialog(null,"Agradecemos a sua confiança");
				autenticado = 0;
				break;
				
				
				default:
					JOptionPane.showMessageDialog(null,"Opcao invalida, tente novamente");
				
				break;
		}
	}
}
		
		

	
	}