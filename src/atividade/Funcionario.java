package atividade;

public class Funcionario {
	//atributos 
	String nome ; 
	double salario;
	
	
	//contrutor
	public Funcionario(String nomeI, double salarioI) {
		// a palavra this referese ao atributo
		this.nome = nomeI ;
		this.salario = salarioI ;
	}
	
	//metodos
	public void addAumento (double valor ) {
		salario +=valor ;
		//System.out.println("Salario com o aumento:" +salario);
	}
	public void ganhoAnual() {
		salario *= 12;
		//System.out.println("SAlario Anual: " + salario);
	}


}
