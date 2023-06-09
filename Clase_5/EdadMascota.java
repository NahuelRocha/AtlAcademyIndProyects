package Clase_5;

import java.util.Scanner;

// CALCULADORA DE EDAD DE PERROS

public class EdadMascota {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa la edad de tu mascota");

        int edad = scanner.nextInt();

        int edadDeTuMascota = edad * 7;

        System.out.println("La edad de tu mascota en años humanos es: "+ edadDeTuMascota);

    }
}
