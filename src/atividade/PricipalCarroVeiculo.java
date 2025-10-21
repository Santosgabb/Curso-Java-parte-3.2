package atividade;

public class PricipalCarroVeiculo {

	public static void main(String[] args) {
		//criaçao de obj  cm classe abstrata
		Veiculo vei = new Carro(null, 0);
		Carro car = new Carro(null, 0);
	
		//as duas saida 
		vei.acelerar();
		car.acelerar();//por que herdar o metodo da classe pai
	
	}

}
