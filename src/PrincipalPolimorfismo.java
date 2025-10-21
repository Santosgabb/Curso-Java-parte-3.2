
public class PrincipalPolimorfismo {

	public static void main(String[] args) {
		// Utilização do Object que está na Superclasse
		// Para criar um polimorfismo utizando o Object

		Object dog = new Cachorro();
		Object cat = new Gato();

		/*
		 * //mas os metodos não são executados dog.fazerSom(); não vai ser executados pq
		 * dentro da classe Obj , nao possui esses metodos cat.fazerSom();
		 */

		// Para executar esse metodo é preciso fazer uma conversão
		Cachorro objConvertido = (Cachorro) dog; // Casting Object
		objConvertido.fazerSom();

		/*
		 * Converte e chama
		 * 2°maneira de se utilizar mais rapido
		 *
		 */
		//((nome da classe) nome obj).metodo();
		((Gato) cat).fazerSom();

	}

}
