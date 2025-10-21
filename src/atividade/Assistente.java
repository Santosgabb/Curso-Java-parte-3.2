package atividade;

public class Assistente extends Funcionario {

	public Assistente(String nomeI, double salarioI) {
		super(nomeI, salarioI);
	}
	public void ganhoAnual() {
		salario += 1000;
		System.out.println("Salario Anual do assistente: " + salario);
	}
	
}
