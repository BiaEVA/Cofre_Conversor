package Cofrinho;

public class Euro extends Moeda {

	
	public Euro(Double valor) {
		super(valor);
	}
	@Override
	double Converter() {
		Double total =  valor * 6;
		return total;
	}
	@Override
	void info() {
		System.out.println("Euro: " + valor);
	}

	
}
