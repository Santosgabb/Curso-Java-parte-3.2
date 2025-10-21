package aulapolimorfismo;

public class PrincipalPolimorfismo {

	public static void main(String[] args) {
		//Criando obj polimorfico
		Animal dog = new Cachorro();
		Animal cat = new Gato();
		
		//imprime os metodos de cada Subclasse
		dog.fazerSom();
		cat.fazerSom();
		
		//utilizando o metodo da Superclasse
		dog.tipoObjeto();
		cat.tipoObjeto();
	}

}
