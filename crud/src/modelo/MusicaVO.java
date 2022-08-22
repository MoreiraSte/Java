package modelo;

//classe de representa as informaçoes que serão armazenadas
public class MusicaVO {

	private int codigo;  //atributo determinante
	private String nome;
	private String estilo; // formato em minutos
	private String cantor;
	private String ano;  
	
	public MusicaVO(int codigo) {

		this.codigo = codigo;
	}
	
	public MusicaVO(int codigo, String nome, String estilo, String cantor, String ano) {
		this.codigo = codigo;
		this.nome = nome;
		this.estilo = estilo;
		this.cantor = cantor;
		this.ano = ano;
	}

	public int getCodigo() {
		return codigo;
	}
	
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEstilo() {
		return estilo;
	}
	
	public void setEstilo(String estilo) {
		this.estilo = estilo;
	}
	
	public String getCantor() {
		return cantor;
	}
	
	public void setCantor(String cantor) {
		this.cantor = cantor;
	}
	
	public String getAno() {
		return ano;
	}
	
	public void setAno(String ano) {
		this.ano = ano;
	}
	
}
