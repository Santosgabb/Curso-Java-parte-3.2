package atividade;

public abstract class Veiculo { 
	// classe abstrata nao pode criar um objeto dela
	//atributos
	private String placa ;
	private int ano;
	
	//construtores
	public Veiculo() {

	}
	public Veiculo (String placa, int ano) {
		this.placa = placa ;
		this.ano = ano ;
	}
	//metodos pra exibir info boas pratica
	public  String exibirInfo() {
		return "Placa do veiculo: " +placa + " Ano do Veiculo: " +ano;
	}
	public void acelerar() {
		// TODO Auto-generated method stub
		
	}
}
