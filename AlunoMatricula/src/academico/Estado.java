package academico;

public class Estado {
	
	private String nome_estado;
	private String sigla;
	private double populacao;
	
	
	
	
	public Estado(String nome_estado, String sigla, double populacao) {
		super();
		this.nome_estado = nome_estado;
		this.sigla = sigla;
		this.populacao = populacao;
	}
	public String getNome_estado() {
		return nome_estado;
	}
	public void setNome_estado(String nome_estado) {
		this.nome_estado = nome_estado;
	}
	public String getSigla() {
		return sigla;
	}
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	public double getPopulacao() {
		return populacao;
	}
	public void setPopulacao(double populacao) {
		this.populacao = populacao;
	}
	
	

}
