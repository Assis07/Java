package Aula1;

public class Principal {
	
	public static void main(String[] args) {
		// Hello //
		//System.out.println("Ol� meu main");
		//Imprimir();
		
		// criar um objeto do tipo pessoa
		// criar uma inst�ncia da classe pessoa
		// tipo nome = new tipo ();
		
		Pessoa p1 = new Pessoa();
		
		// definindo valores aos atributos
		p1.peso = 60;
		p1.altura = 1.5;
		p1.cordosolhos = "Vermelho";
		p1.estafeliz = true;
		p1.estacomfome = false;
		
		// acessando/executando um m�todo 
		p1.falar();
		p1.sorrir();
		
		System.out.println(p1.toString());
	}
	
	
	
}
