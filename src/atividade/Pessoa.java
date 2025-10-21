package atividade;

public class Pessoa {
	// atributos protected pra outras classes acessar o atributo
	private String nome;
	private int idade;

	// construtores s parametro
	public Pessoa() {
	}

	// construtor c parametros
	// se nao diferenciar o nome do parametro dos atributos é necessario utilizar o
	// this.
	public Pessoa(String nomeI, int idadeI) {
		nome = nomeI;
		idade = idadeI;
	}
	//para exibir o nome atravez do get
	public String getNome() {
		return nome;
	}

	public int getIdade() {
		 return idade ;
	}
	
	
	//metodos
	public void exibirInfo() {
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
	}

}
