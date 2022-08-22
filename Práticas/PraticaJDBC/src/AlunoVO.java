
import java.math.BigDecimal;

				
public class AlunoVO {

	private String nome;
	
	private String disciplina;
	
	private String prontuario;
	
	private BigDecimal media;

	
	public AlunoVO(String nome, String disciplina, String prontuario ,BigDecimal media) {
		this.disciplina = disciplina;
		this.nome = nome;
		this.prontuario = prontuario;
		this.media = media;
	}
	
	public AlunoVO() {
	}

	public String getnome() {
		return nome;
	}

	public void setnome(String nome) {
		this.nome = nome;
	}

	public String getdisciplina() {
		return disciplina;
	}

	public void setdisciplina(String disciplina) {
		this.disciplina = disciplina;
	}

	public String getprontuario() {
		return prontuario;
	}

	public void setprontuario(String prontuario) {
		this.prontuario = prontuario;
	}
	
}
