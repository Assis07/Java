package Animais;

public class testeanimais {

	public static void main(String[] args) {
		
	cachorro c1 = new cachorro(); // criando um catioro
	c1.setNome("Mike");
	c1.brincar(); // puxa o brincar da classe catioro
	
	gato g1 = new gato(); // criando um gatito
	g1.setNome("Garfield");
	g1.brincar();
	/*gato n�o possui m�todo criada na CLASSE GATO 
	por isso ele chama o m�todo do PAI > MAMIFERO
	*/
	
	mamifero m1 = new mamifero();
	m1.brincar("COMEEEEEEEEEEEEEEEEEEE�OOOOOOOOOOUUUUUUUUUUUUUUU");
	}

}
