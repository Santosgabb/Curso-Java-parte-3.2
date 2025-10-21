package exemplo;

public class Cachorro extends Animal {
	public String raca ; 
	
	Cachorro (String nomeI,String racaI ){
		super(nomeI);//chama o construtor da Superclasse
		this.raca = racaI;
	}
	
	public void latir() {
		super.fazerSom();//faz com q o metodo da classe pai seja utilizado
		System.out.println("O cachorro está latindo: au au au au");
	}

	// Sobrescrita de metodo
	public void fazerSom() {
		System.out.println("O cachorro faz som");
	}
}
