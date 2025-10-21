package atividadedois;

public class Multiplicacao extends Operacao {

	@Override
	public double calcular(double a, double b) {
		if (a == 0 && b == 0) {
			System.out.println("Não é possivel fazer a operação");
		return 0 ;
		}
		return a * b;
	}

}
