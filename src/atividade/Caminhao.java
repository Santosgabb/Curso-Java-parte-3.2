package atividade;

public class Caminhao extends Veiculo {
	//Atributos
	private int eixos;
	//Construtores
	public Caminhao(String placa, int ano, int eixos) {
		super(placa, ano);
		this.eixos = eixos;
	}
	//metodos
	// Sobrescreve o metodo
		@Override
		public String exibirInfo() {
			return super.exibirInfo() + " Eixos no Caminhão: " + eixos;
		}
	
	
}
