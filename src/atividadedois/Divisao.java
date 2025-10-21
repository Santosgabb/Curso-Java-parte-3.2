package atividadedois;

public class Divisao extends Operacao {

	@Override
	public double calcular(double a, double b) {
		if(b == 0) {
			System.out.println("Não é divisivel por 0 ");
		}
		return a/ b;
	}

}
