package exemplo;

public class Animal {
	public String nome;
	
	public Animal(String nomeI){
		this.nome = nomeI;
	}
	
	public void comer() {
		System.out.println("O animal está comendo");
	}
//Sobrescrita de metodo
	public void fazerSom() {
		System.out.println("O animal faz som");
	}
}
