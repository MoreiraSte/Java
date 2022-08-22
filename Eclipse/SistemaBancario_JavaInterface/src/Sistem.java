import javax.swing.JOptionPane;

public class Sistem {

	public static void main(String[] args) {

		Banco objtlimite = new Banco(0.00, 1.00, 5.00, 0.50);

		Banco objtnome = new Banco("a", "b");

		Banco objtsobre = new Banco("c", "d");

		Banco objtsaldo = new Banco(0.00, 1.00, 5.00, 0.50);

		Banco objtsaque = new Banco(0.00, 1.00, 5.00, 0.50);

		Banco objtcpmf = new Banco(0.00, 1.00, 5.00, 0.50);

		Banco obtjsenha = new Banco("456", "8521");

			String name = JOptionPane.showInputDialog("Digite seu nome");
			objtnome.setNome(name);

			String sobre = JOptionPane.showInputDialog("Digite seu sobrenome");
			objtsobre.setSobre(sobre);

			String senha = JOptionPane.showInputDialog("Digite sua senha para acesso");
			int se = Integer.parseInt(senha);
			obtjsenha.setSenha(se);

		String aviso = String.format("Dados cadastrados com sucesso! Sr.(a) %s", name);
		String aviso2 =  String.format("ID: %s\nSenha: %s ", name, senha);
		
		JOptionPane.showMessageDialog(null, aviso);
		JOptionPane.showMessageDialog(null, aviso2);
		

	//valida dados

			String id = JOptionPane.showInputDialog("Digite sua id");
			String ss = JOptionPane.showInputDialog("Digite sua senha");

			int sh = Integer.parseInt(ss);
			
			 
		if (id != name && se != sh){
		JOptionPane.showMessageDialog(null, "Dados Inválidos");
		}
		else
		{		
	String deposito = JOptionPane.showInputDialog("Faça um deposito na conta ");
		
		double dep = Double.parseDouble(deposito);
			
		if (dep < 20.00)
		{
		JOptionPane.showMessageDialog(null, "De acordo com o contrato valor inválido para deposito");
		}
		else {
		JOptionPane.showMessageDialog(null, "Obrigado por realizar um deposito");

		dep = dep;
		objtsaldo.setSaldo(dep);
		
			double limit;
			limit = dep * (2);
			objtlimite.setLimite(limit);

		String avisolimite = String.format("Seu limite para emprestimos é: R$ %.2f", objtlimite.getLimite() );

		JOptionPane.showMessageDialog(null, avisolimite);
		
		String saque = JOptionPane.showInputDialog("Realize um saque ");
			double saq = Double.parseDouble(saque);
			if (saq > dep) {
			JOptionPane.showMessageDialog(null, "Saldo Insuficiente");
			}
			else {
			saq = saq;
			objtsaque.setSaq(saq);
			
			double r;
			r = dep - saq;
					
			double cpm = (saq * 2) / 100;
			
			objtcpmf.setCpmf(cpm);
			
			double set = r - cpm;
			
			objtsaldo.setSaldo(set);
			
			limit = set * (2);
			objtlimite.setLimite(limit);
			int cont = 785236;
	String exibi = String.format("Número da Conta %s\nSaldo R$%.2f\nSaque realizado R$ %.2f\nLimite para emprestimo R$%.2f\nValor de CPMF R$%.2f\nSistema Desenvolvido por Camilo Lopes Version 1.1", cont, objtsaldo.getSald(), objtsaque.getSaque(), objtlimite.getLimite(), objtcpmf.getCpmf());

			JOptionPane.showMessageDialog(null, exibi);
			}		
		
			
		
		}
		}

	}

}