import java.math.BigDecimal;
import java.util.Date;

public class ProdutoVO {

	private int codigo;
	private String nome;
	private Date dataCompra;
	private BigDecimal vlUnitario;
	
	public ProdutoVO(int codigo, String nome, Date dataCompra, BigDecimal vlUnitario) {
		this.codigo = codigo;
		this.nome = nome;
		this.dataCompra = dataCompra;
		this.vlUnitario = vlUnitario;
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
	
	public Date getDataCompra() {
		return dataCompra;
	}
	
	public void setDataCompra(Date dataCompra) {
		this.dataCompra = dataCompra;
	}
	
	public BigDecimal getVlUnitario() {
		return vlUnitario;
	}
	
	public void setVlUnitario(BigDecimal vlUnitario) {
		this.vlUnitario = vlUnitario;
	}

	
	
}
