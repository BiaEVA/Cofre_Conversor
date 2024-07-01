package Cofrinho;

public class Dolar extends Moeda {

	public Dolar(Double valor) {
		super(valor);
	}
	@Override
	double Converter() {
		Double total =  valor * 5;
		return total;
	}
	@Override
	void info() {
		System.out.println("Dolar: " + valor);
	}

		
}