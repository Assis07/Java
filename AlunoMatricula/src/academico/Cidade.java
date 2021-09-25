package academico;

public class Cidade {
	
	private String nome;
	private Estado estado;
	private double populacao;
	
	
	
	public double getPopulacao() {
		return populacao;
	}
	public void setPopulacao(double populacao) {
		this.populacao = populacao;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	public Estado getEstado() {
		return estado;
	}
	public void setEstado(Estado estado) {
		this.estado = estado;
	}
		
	public void setPopulacao(Integer populacao) {
		this.populacao = populacao;
	}
	
	public Cidade(String nome, Estado estado, Integer populacao) {
		super();
		this.nome = nome;
		this.estado = estado;
		this.populacao = populacao;
	}
	
	
	

}
