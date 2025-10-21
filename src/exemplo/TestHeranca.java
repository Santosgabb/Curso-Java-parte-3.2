package exemplo;

public class TestHeranca {

	public static void main(String[] args) {
		// Criação do obj 
		Cachorro dog = new Cachorro("REX","Labrador");//utilizando o construtor
		
		dog.latir();//da classe cachorro 
		dog.comer();//Herança da classe Animal pois a classe cachorro nao possui esse metodo
	
	//sobrescrita de metodo
		dog.fazerSom();
	
		//utiliza o atributo da classe pai
	//	dog.nome = "Betove";// pq ha uma herança
		System.out.println("O nome do animal :"+ dog.nome);
		System.out.println("O Raça do animal :"+ dog.raca);
	}

}
