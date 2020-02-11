package fibonacci;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Ingresa cuántos números Fibonacci quieres: ");
		int n = sc.nextInt();

		int i;
		int anterior = 0;
		int actual = 1;
		int suma = 1;

		if (n > 0) {
			System.out.println(anterior);
			System.out.println(actual);
			System.out.println(actual);
		}

		for (i = 0; i < n; i++) {
			suma = actual + anterior;
			System.out.println(suma);
			anterior = actual;
			actual = suma;
		}

	}

}
