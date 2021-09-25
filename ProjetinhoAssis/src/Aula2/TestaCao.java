package Aula2;

public class TestaCao {

	public static void main(String[] args) {
		// criando um objeto da classe cao
		// instancia -> instanciamento de objeto
		// NomeClasse nomeObjeto = new NomeClasse();
		
		
		// criando objeto com o construtor padrao
		cao dog1 = new cao();
		dog1.setNome("Jaguara"); 
		dog1.setRaca("Labrador");
		dog1.setIdade(10); 
		dog1.setPeso(10);
		dog1.setSexo('M');
		System.out.println("Nome: " +dog1.getNome());
		System.out.println("Raça: " +dog1.getRaca());
		System.out.println("Idade: "+dog1.getIdade());
		System.out.println("Peso: "+dog1.getPeso());
		System.out.println("Sexo: "+dog1.getSexo());
		
		cao dog2 = new cao("Zeca","Roncador",12,8.2,'M');
		System.out.println("Nome: " +dog2.getNome());
		System.out.println("Raça: " +dog2.getRaca());
		System.out.println("Idade: "+dog2.getIdade());
		System.out.println("Peso: "+dog2.getPeso());
		System.out.println("Sexo: "+dog2.getSexo());
	}

}
