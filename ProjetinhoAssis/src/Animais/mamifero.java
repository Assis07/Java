package Animais;

public class mamifero {

	// atributos -> sempre privados
	// tudo oq for comum está aqui 
	private String nome;
	private String raca;
	private int idade;
	private double peso;
	private char sexo;
	
	protected String getNome() {
		return nome;
	}

	protected void setNome(String nome) {
		this.nome = nome;
	}

	protected String getRaca() {
		return raca;
	}

	protected void setRaca(String raca) {
		this.raca = raca;
	}

	protected int getIdade() {
		return idade;
	}

	protected void setIdade(int idade) {
		this.idade = idade;
	}

	protected double getPeso() {
		return peso;
	}

	protected void setPeso(double peso) {
		this.peso = peso;
	}

	protected char getSexo() {
		return sexo;
	}

	protected void setSexo(char sexo) {
		this.sexo = sexo;
	}

	protected void brincar() {
		System.out.println("O Mamífero está brincando");		
	}
	
	protected void brincar(String frase) {
		System.out.println("Frase: "+frase);	
	}
}
