package bancario;
import cadastral.Pessoa;

public class Agencia {
	
	private String nome;
	private double saldo;
	private int numero;
	private int digito;
	private Pessoa gerente;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getDigito() {
		return digito;
	}
	public void setDigito(int digito) {
		this.digito = digito;
	}
	public Pessoa getGerente() {
		return gerente;
	}
	public void setGerente(Pessoa gerente) {
		this.gerente = gerente;
	}
	
	

}
