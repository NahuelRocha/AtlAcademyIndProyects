package Clase_5;

import java.util.Scanner;

// CONVERSOR DE MILLAS A KILOMETROS
public class MillasAKilometros {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa la cantidad en Millas");

        int millas = scanner.nextInt();

        double kilometros = millas * 1.60934;

        System.out.println("La distancia en kilometros es: " + kilometros);

    }
}
