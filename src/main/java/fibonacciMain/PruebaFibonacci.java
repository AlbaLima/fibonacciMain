package fibonacciMain;

import java.util.Scanner;

import fibonacci.Fibonacci;

public class PruebaFibonacci {
	public static void main(String[] args) {
		Fibonacci prueba = new Fibonacci();

		Scanner sc = new Scanner(System.in);

		System.out.println("¿Qué posición de Fibonacci quieres conocer? ");

		int posicion = sc.nextInt();

		int resultado = prueba.metodoFibonacci(posicion);

		System.out.println("El resultado de esta posición es: " + resultado);

	}

}
