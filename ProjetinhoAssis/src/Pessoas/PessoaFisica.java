package Pessoas;

public class PessoaFisica extends Pessoa{
	private int cpf;
	private int celular;
	private int idade;
	
	protected int getCpf() {
		return cpf;
	}
	
	protected void setCpf(int cpf) {
		this.cpf = cpf;
	}

	protected int getCelular() {
		return celular;
	}
	
	protected void setCelular(int celular) {
		this.celular = celular;
	}

	protected int getIdade() {
		return idade;
	}

	protected void setIdade(int idade) {
		this.idade = idade;
	}


	public static void ImprimirPF(String[] args) {
		
	PessoaFisica pf = new PessoaFisica();
	pf.cpf= 1234567891;
	pf.celular = 98875390;
	pf.idade = 19;
	pf.setEmail("assis@gmail.com");
	pf.setEndereco("Rua ali em casa");
	pf.setNome("Jurandir");
	
	System.out.println("Nome: "+pf.getNome());
	System.out.println("Nome: "+pf.getIdade());
	System.out.println("Nome: "+pf.getCpf());
	System.out.println("Nome: "+pf.getCelular());
	System.out.println("Nome: "+pf.getEmail());
	System.out.println("Nome: "+pf.getEndereco());

	}

	
}
