package Clase_5;

import java.util.Scanner;

public class CalculadoraPropinas {
    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa el monto de la cuenta");

        int cuenta = scanner.nextInt();

        System.out.println("Ingresa el porcentaje de propina que deseas dejar");

        int porcentajePropina = scanner.nextInt();

        int propina = (cuenta * porcentajePropina) / 100;

        System.out.println("La cantidad de propina sera: " + propina);

        System.out.println("Total a dejar sobre la mesa: " + (cuenta + propina));
    }
}
