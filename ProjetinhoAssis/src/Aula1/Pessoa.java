package Aula1;

public class Pessoa {
	// defini��o dos atributos ou estados
	
	double altura; 
	String cordosolhos;
	double peso;
	boolean estafeliz;
	boolean estacomfome;
	
	// definindo os m�todos(a��es)
	
	void sorrir() {
		System.out.println("Estou com os dent�o de fora");		
	}
	
	void falar() {
		System.out.println("Estou igual um papagaio");		
	}

	@Override
	public String toString() {
		return "Pessoa [altura=" + altura + ", cordosolhos=" + cordosolhos + ", peso=" + peso + ", estafeliz="
				+ estafeliz + ", estacomfome=" + estacomfome + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
}
