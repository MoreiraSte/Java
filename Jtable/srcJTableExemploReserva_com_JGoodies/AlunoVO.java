import java.math.BigDecimal;
import java.util.Date;

/*
 * A classe AlunoVO é o objeto armazenado em formato
 * tabela no banco de dados (AlunoVO vira uma tabela e os atributos 
 * são as colunas da tabela
 * criado por naur jr
 * útima alteração: 24/02/2021 
 */

public class AlunoVO {

	private String prontuario;
	 
	private String nome;
	
	private int idade;

	private String disciplina;
	
	private BigDecimal media;

	private Date dataNascimento;

	public AlunoVO(String prontuario, String nome, int idade, String disciplina, BigDecimal media, Date dataNascimento) {
		this.prontuario = prontuario;
		this.nome = nome;
		this.idade = idade;
		this.disciplina = disciplina;
		this.media = media;
		this.dataNascimento = dataNascimento;
	}

	public String getProntuario() {
		return prontuario;
	}

	//este método não deve estar diponibilizado
	// pois não deve ser permitido alterar o prontuário
	// este é uma chave primária no banco
//	public void setProntuario(String prontuario) {
//		this.prontuario = prontuario;
//	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}

	public BigDecimal getMedia() {
		return media;
	}

	public void setMedia(BigDecimal media) {
		this.media = media;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

}
