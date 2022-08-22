package modelo.vo;

//Programa realizado por: Maria Eduarda Alves de Lima e Stephany Moreira
public class MusicaVO {

	private String codigo;
	private String nome;
	private String cantor;
	private String estilo;
	private String ano;
	
	//Construtor com prontuario
	public MusicaVO(String codigo) {
		this.codigo = codigo;
	}

	public MusicaVO(String cod, String novoNome, String novoCantor, String novoEstilo, String novoAno)
	{
		
		this.codigo = cod;
		this.nome = novoNome;
		this.cantor = novoCantor;
		this.estilo = novoEstilo;
		this.ano = novoAno;

	}

	// utilizado para mostrar apenas um aluno
	public void mostra()
	{
		System.out.printf(" Codigo: %s ", getCodigo());
		System.out.printf(" Nome: %s", getNome());
		System.out.printf(" Banda ou Cantor: %s", getCantor());
		System.out.printf(" Estilo: %s", getEstilo());
		System.out.printf(" Ano: %s", getAno());
		System.out.println();
		
	}
	
	// utilizado para mostra alunos em modo listagem
	public void mostraLista()
	{
		System.out.println();
		System.out.printf("\t%s \t\t %s ", getCodigo(), getNome(), getCantor(), getEstilo(), getAno());
	}

	public String getCodigo() {
		return codigo;
	}

	
	public String getNome() {
		return nome;
	}

	public String getCantor() {
		return cantor;
	}

	public String getEstilo() {
		return estilo;
	}
	public String getAno() {
		return ano;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

}