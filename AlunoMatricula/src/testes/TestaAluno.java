package testes;

import academico.Aluno;
import academico.Cidade;
import academico.Estado;

public class TestaAluno {

	public static void main(String[] args) {
		
		// criando um objeto utilizando construtor padrão
		
		Aluno al1 = new Aluno();
		
		al1.setNome("José");
		al1.setIdade(10);
		al1.setSexo('M');
	
		
		Estado estado_al1 = new Estado("Santa Catarina", "SC", 25000);
		
		
		Cidade cidade_al1 = new Cidade("Blumenau", estado_al1, 250000);

		al1.setCidade(cidade_al1);
		al1.setEstado(estado_al1);
		
	
		// criar um objeto utilizando construtor personalizado (reescrito)
		
		Aluno al2 = new Aluno("Matheus", 'M', 17, cidade_al1, estado_al1);
		System.out.println(al2.toString());
	}

}
