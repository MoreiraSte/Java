
public class Banco {
	
		private int senha;
		private double saldo,saque,cpmf,limite;
		private String nome,sobrenome;

	public Banco(String nom, String sobre)
	{
		this.nome = nome;
		this.sobrenome= sobre;
	}
	public Banco(int sen)
	{
			this.senha = sen;
	}
	public Banco(double sald, double saq, double cp, double lm)
	{
		if (sald > 0.00 && saq > 0.00)
		this.saldo = sald;
		this.saque = saq;
		this.cpmf = cp;
		this.limite = lm;
	}

	public void setNome(String n)
	{
		nome = n;
	}

	public void setSobre(String s)
	{
		sobrenome = s;
	}

	public void setSaldo(double sa)
	{
		saldo = sa;
	}

	public void setSaq(double sq)
	{
		saque = sq;
	}

	public void setCpmf(double cm)
	{
		cpmf = cm;
	}

	public void setLimite(double lt)
	{
		limite = lt;
	}

	public void setSenha(int sh)
	{
		senha = sh;
	}

	//exibe o valor armazenado no set

	public String getNome()
	{
		return nome;
	}

	public String getSobre()
	{
		return sobrenome;
	}


	public double getSald()
	{
		return saldo;
	}

	public double getSaque()
	{
		return saque;
	}

	public double getCpmf()
	{
		return cpmf;
	}

	public double getLimite()
	{

		return limite;
	}

	public int getSenha()
	{
		return senha;
	}

	}
