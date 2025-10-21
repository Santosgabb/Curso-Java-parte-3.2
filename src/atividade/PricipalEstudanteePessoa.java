package atividade;

public class PricipalEstudanteePessoa {

	public static void main(String[] args) {
		//Criação de objeto
		Estudante est = new Estudante("Gabriel" , 15,3455);//sub-classe
		Pessoa pes = new Pessoa("João brown", 10);//Super-classe
		
		//exibind as informaçoes atravez d um metodo
		pes.exibirInfo();//exibindo o metodo da superclase 
		est.exibirInfo();//herdando o metodo da superclasse e implementando outras informaçoes
		System.out.println("-_-_-_-_-_-_-");
		
		//tambem é possivel exibir os valores do objetos pelo get
		//criando outro obj e exindo atravez dos GETTERS se tivesse o sett seria possivel alterar as informaçoes
		Estudante aluno = new Estudante("Maria", 18,230723);	
		System.out.println("Nome: "+aluno.getNome());
		System.out.println("Idade: "+aluno.getIdade());
		System.out.println("Matricula: "+aluno.getMatricula());
	
	}

}
