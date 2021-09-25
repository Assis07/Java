package Aula2;



public class cao {
		
	// atributos -> sempre privados
	private String nome;
	private String raca;
	private int idade;
	private double peso;
	private char sexo;
	
	// método construtor  padrao
	public cao() {
		System.out.println("Usou o construtor padrão");	
	}
	
	
	// criar método construtor com parâmetros
	public cao(String nomee, String racaa, int idadee, 
			    double pesoo, char sexoo){
		this.nome = nomee;
		this.raca= racaa;
		this.idade= idadee;
		this.peso= pesoo;
		this.sexo= sexoo;
		
		
		
	}
	
	
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getRaca() {
		return raca;
	}
	public void setRaca(String raca) {
		this.raca = raca;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	
	
	
}
