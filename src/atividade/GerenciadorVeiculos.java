package atividade;

public class GerenciadorVeiculos {

	public static void main(String[] args) {
		//Criação Obj cm Polimorfismo
		Veiculo bus = new Onibus("NXW-2377", 2025, 10);
		Veiculo cam = new Caminhao("WNR-9935", 2013, 2);
		
		//utilizando os metods cm retorno 
		System.out.println(bus.exibirInfo());
		System.out.println(cam.exibirInfo());
		
	}

}
