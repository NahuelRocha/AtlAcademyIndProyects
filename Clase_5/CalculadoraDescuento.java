package Clase_5;

import java.util.Scanner;

public class CalculadoraDescuento {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa el precio del producto");
        int precio = scanner.nextInt();
        System.out.println("Ingresa el porcentaje de descuento");
        int descuento = scanner.nextInt();
        int precioFinal = precio - (precio * descuento / 100);
        System.out.println("El precio final es: " + precioFinal);
    }

}
