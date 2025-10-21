package atividadedois;

public class Subtracao extends Operacao {

	@Override
	public double calcular(double a, double b) {

		if (b > a) {
			System.out.print("O segundo numero é maior que o primeiro,Resultado negativo: ");
		} 
			return a - b;
	}
}
