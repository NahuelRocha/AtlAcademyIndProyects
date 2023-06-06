package Clase_5;

import java.util.Random;
import java.util.Scanner;

public class AdivinaElNumero {
    public static void main (String[] args){
        Random random = new Random();
        int numeroAleatorio = random.nextInt(100) + 1;
        System.out.println("Ingresa un numero");
        Scanner scanner = new Scanner(System.in);
        int numeroElegido = scanner.nextInt();

        if(numeroAleatorio == numeroElegido){
            System.out.println("Felicidades acertaste!");
        } else {
            System.out.println("Lo siento , te equivocaste el numero era:" + numeroAleatorio);
        }
    }
}
