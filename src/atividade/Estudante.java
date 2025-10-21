package atividade;

public class Estudante extends Pessoa {
	// atributos
	private int matricula;

	// construtor herdando da suprclasse sempre precisa colocar os parametros que
	// vamos utilizar
	public Estudante(String nome, int idade, int matricula) {
		super(nome, idade);
		this.matricula = matricula;
	}

	// criação do get para exibir o nome
	public int getMatricula() {
		return matricula;
	}

	// sobrescrita de metodo utilizando a herança
	@Override
	public void exibirInfo() {
		System.out.println();
		super.exibirInfo();
		System.out.println("Matricula: " + matricula);
	}
}
