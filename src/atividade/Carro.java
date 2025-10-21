package atividade;

public class Carro extends Veiculo {

	public Carro(String placa, int ano) {
		super(placa, ano);
		// TODO Auto-generated constructor stub
	}

	@Override//sobescreve o método e tudo que ha na classe pai passa pra ela
	public void acelerar() {
		System.out.println("Carro Acelerando");
		super.acelerar();// atravez disso

	}

}
