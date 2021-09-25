package Pessoas;

public class PessoaJuridica extends Pessoa {
	private int cnpj;
	private String dt_fundacao;
	private String razaosocial;
	
	protected int getCnpj() {
		return cnpj;
	}
	protected void setCnpj(int cnpj) {
		this.cnpj = cnpj;
	}
	protected String getDt_fundacao() {
		return dt_fundacao;
	}
	protected void setDt_fundacao(String dt_fundacao) {
		this.dt_fundacao = dt_fundacao;
	}
	protected String getRazaosocial() {
		return razaosocial;
	}
	protected void setRazaosocial(String razaosocial) {
		this.razaosocial = razaosocial;
	}
	
	public static void ImprimirPJ(String[] args) {
	
	PessoaJuridica p1 = new PessoaJuridica();
	p1.razaosocial= "Empresa Gigante";
	p1.dt_fundacao= "20/01/2001";
	p1.cnpj= 12321354;
	p1.setEmail("juridicozao@gmail.com");
	p1.setEndereco("Disney");
	p1.setTelefone(479838433);
	
	System.out.println("Nome: "+p1.getCnpj());
	System.out.println("Nome: "+p1.getDt_fundacao());
	System.out.println("Nome: "+p1.getRazaosocial());
	System.out.println("Nome: "+p1.getEmail());
	System.out.println("Nome: "+p1.getEndereco());

	}
	
}
