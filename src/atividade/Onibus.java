package atividade;

public class Onibus extends Veiculo {
	// atributos
	private int assentos;

	// herança de construtor
	public Onibus(String placa, int ano, int assentos) {
		super(placa, ano);
		this.assentos = assentos;
	}

	// Sobrescreve o metodo
	@Override
	public String exibirInfo() {
		return super.exibirInfo() + " Assentos no Onibus: " + assentos;
	}

}
