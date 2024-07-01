package Cofrinho;

public abstract class Moeda {
	Double valor;
	
	
	public Moeda(Double valor) {
		super();
		this.valor = valor;
	}


	abstract double Converter();
	abstract void info();


	
}
