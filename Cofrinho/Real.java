package Cofrinho;

public class Real extends Moeda {

	public Real(Double valor) {
		super(valor);
	}

	@Override
	double Converter() {
		double total = valor * 1;
		return total;
	}
	@Override
	void info() {
		System.out.println("Real: " + valor);
	}
}
