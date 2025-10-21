package atividade;

public class PrincipalFuncionario {

	public static void main(String[] args) {
		// criação de obj
		Funcionario f = new Funcionario("Joao",3000);
		Assistente a = new Assistente("Joaozinho", 3000);
		
				
		a.addAumento(500);
		a.ganhoAnual();
		System.out.println("Nome: " + a.nome + " Salario Anual: " + a.salario);
		System.out.println("----");
		f.addAumento(00);
		f.ganhoAnual();
		System.out.println("Nome: " + f.nome+" Salario Mensal de "  + " Salario Anual: " + f.salario);
	}

}
