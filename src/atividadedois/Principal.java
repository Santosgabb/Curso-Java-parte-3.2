package atividadedois;

public class Principal {

	public static void main(String[] args) {
		
		Operacao som = new Soma();
		System.out.println("Resultado da Soma: "+som.calcular(3, 6));

		Operacao sub = new Subtracao();
		System.out.println("Resultado da Subtração: " + sub.calcular(9, 7));

		Operacao mul = new Multiplicacao();
		System.out.println("Resultado da Multiplicação: "+mul.calcular(3, 3));

		Operacao div = new Divisao();
		System.out.println("Resultado da Divisão: " + div.calcular(12, 2));
	}

}
