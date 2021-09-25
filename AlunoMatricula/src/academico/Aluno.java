package academico;

public class Aluno {
	
	private String nome;
	private char sexo;
	private int idade;
	
	private Cidade cidade;
	private Estado estado;
	
	// construtor padrão da classe (sem parâmetros)
	public Aluno(){
		System.out.println("Construtor padrão!");
	}
	
	
	
	public Estado getEstado() {
		return estado;
	}



	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	// construtor personalizado (com parâmetros)
	
	public Aluno(String nome, char sexo, int idade, Cidade cidade, Estado estado) {
		super();
		System.out.println("Construtor Personalizado");
		this.nome = nome;
		this.sexo = sexo;
		this.idade = idade;
		this.cidade = cidade;
		this.estado = estado;
	}
	
    public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	
	public Cidade getCidade() {
		return cidade;
	}


	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}


	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", sexo=" + sexo + ", idade=" + idade + ", cidade=" + cidade + "]";
	}

	
	
	
	
}
