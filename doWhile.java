//Para el bucle Do While, deberás crear la misma estructura que en el While, pero solo se debe ejecutar una vez.
package main;

class Main {
	public static void main(String[] args) {
	   int numeroDoWhile = 1;
       
       do {
        System.out.println(numeroDoWhile);
        numeroDoWhile += 1;
       } while (numeroDoWhile <= 3);
	}
}
