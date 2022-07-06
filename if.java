//Usando un if, crear una condición que compare si la variable numeroIf es positivo, negativo, o 0
package main;

class Main {
	public static void main(String[] args) {
	   int numeroIf = 40;

		if (numeroIf == 0) {
			System.out.println("El número es neutro");
		} else if (numeroIf < 0) {
			System.out.println("El número es negativo");
		} else {
			System.out.println("El número es positivo");
		}
	}
}