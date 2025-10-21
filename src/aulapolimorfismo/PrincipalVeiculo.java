package aulapolimorfismo;

public class PrincipalVeiculo {

	public static void main(String[] args) {
		// metodos polimorfico

		Veiculo moto = new Moto();
		Veiculo carro = new Carro();
		
		//utilizando o metodo de cada classe q é uma implementação de um interface
		carro.acelerar();
		moto.acelerar();
	}
}
