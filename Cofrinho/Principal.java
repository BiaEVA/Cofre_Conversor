package Cofrinho;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		ArrayList<Moeda> listaMoedas = new ArrayList();
	while (true) {
			System.out.println("COFRINHO: ");
			System.out.println("1 - Adicionar moeda");
			System.out.println("2 - Remover moeda");
			System.out.println("3 - Listar moedas");
			System.out.println("4 - Converter moedas para real");
			System.out.println("0 - Encerrar");
			Double opcao = teclado.nextDouble();
			if (opcao == 1) {
			System.out.println("Escolha a moeda: ");
			System.out.println("1 - Dolar");
			System.out.println("2 - Euro");
			System.out.println("3 - Real");
			Double opcao2 = teclado.nextDouble();
			if(opcao2 == 1) {
				System.out.println("Digite o valor: ");
				Double valor = teclado.nextDouble();
				listaMoedas.add(new Dolar(valor));
				continue;
			}
			if(opcao2 == 2) {
				System.out.println("Digite o valor: ");
				Double valor = teclado.nextDouble();
				listaMoedas.add(new Euro(valor));
				continue;
			}
			if(opcao2 == 3) {
				System.out.println("Digite o valor: ");
				Double valor = teclado.nextDouble();
				listaMoedas.add(new Real(valor));
				continue;
			}
		}
		if (opcao == 2) {
			System.out.println("Escolha a moeda: ");
			System.out.println("1 - Dolar");
			System.out.println("2 - Euro");
			System.out.println("3 - Real");
			Double opcao2 = teclado.nextDouble();
			if(opcao2 == 1) {
				System.out.println("Digite o valor: ");
				Double valor = teclado.nextDouble();
				listaMoedas.remove(0);
				continue;
			}
			if(opcao2 == 2) {
				System.out.println("Digite o valor: ");
				Double valor = teclado.nextDouble();
				listaMoedas.remove(0);
				continue;
			}
			if(opcao2 == 3) {
				System.out.println("Digite o valor: ");
				Double valor = teclado.nextDouble();
				listaMoedas.remove(0);
				continue;
			}	
		}
		if (opcao == 3) {
			for ( Moeda o : listaMoedas) {
				o.info();
			continue;
			}
		}
		if (opcao == 4) {
			double total = 0;
			for(Moeda m : listaMoedas) {
				total += m.Converter();
			}
			System.out.println("Total do valor: "+total);
		}
		if(opcao == 0) {
			System.out.println("Encerrando programa...");
			break;
		}
}
}

	
	}
