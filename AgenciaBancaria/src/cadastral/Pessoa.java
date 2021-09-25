package cadastral;


public class Pessoa {

	private String nome;
	private String dataNasc;
	
	private Endereco endereco_p; // endereco
	
	private String cpf;
	
	
	public Endereco getEndereco_p() {
		return endereco_p;
	}
	public void setEndereco_p(Endereco endereco_p) {
		this.endereco_p = endereco_p;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDataNasc() {
		return dataNasc;
	}
	public void setDataNasc(String dataNasc) {
		this.dataNasc = dataNasc;
	}

	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	
	
}
