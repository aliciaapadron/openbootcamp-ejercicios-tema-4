package Clases;

import java.util.Scanner;

public class Ejercicio26 {
    public static void main(String[] args) {
        //variables
        int numero;
        String estacion="";
        //entrada
        Scanner objeto=new Scanner(System.in);
        System.out.println("Ingrese el número de la estación: ");
        numero=objeto.nextInt();
        //proceso
        switch(numero){
            case 1:
                estacion="Verano";
                break;
            case 2:
                estacion="Otoño";
                break;
            case 3:
                estacion="Invierno";
                break;
            case 4:
                estacion="Primavera";
                break;
            default:
                estacion="No especifica";
                break;
        }
        //salida
        System.out.println("");
        System.out.println("---Resultado---");
        System.out.println("La estación del año es: "+estacion);
        
    }
}