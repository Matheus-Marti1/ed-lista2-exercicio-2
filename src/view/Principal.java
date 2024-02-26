package view;

import java.util.Scanner;

import controller.DivisaoController;

public class Principal {

	public static void main(String[] args) {
		DivisaoController div = new DivisaoController();
		Scanner input = new Scanner(System.in);
		System.out.println("Insira o dividendo: ");
		int dividendo = input.nextInt();
		System.out.println("Insira o divisor: ");
		int divisor = input.nextInt();
		System.out.println(
				"Resto da divisão de " + dividendo + "/" + divisor + ": " + div.restoDivisao(dividendo, divisor));
		input.close();
		System.exit(0);
	}
}
