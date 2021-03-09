package revisaozinha04.main;

import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main start = new Main();
		start.wow();

	}

	private void wow() {

		Scanner scan = new Scanner(System.in);
		int valor;
		do {
			System.out.println("Escreva quantas vezes repetir o valor.(valor positivo)");
			valor = scan.nextInt();
		} while (valor < 1);
		int i = 0;
		int j = 0;

		while (i < valor) {
			i++;
			System.out.println("valor de i= " + i);
		}

		do {
			j++;
			System.out.println("valor de j= " + j);
		} while (j < valor);

		for (int k = 0; k <= valor; k++) {
			System.out.println("valor de k= " + k);
		}
	}

}
