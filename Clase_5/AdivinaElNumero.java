package Clase_5;

import java.util.Random;
import java.util.Scanner;

public class AdivinaElNumero {

    public static void main (String[] args){
        Random random = new Random();
        int numeroAleatorio = random.nextInt(10) + 1;
        System.out.println("Ingresa un numero");
        Scanner scanner = new Scanner(System.in);
        int numeroElegido = scanner.nextInt();

        while (numeroAleatorio != numeroElegido){

            if (numeroAleatorio > numeroElegido) {
                System.out.println("Lo siento , te equivocaste. Prueba con un numero Mayor");

            } else {
                System.out.println("Lo siento , te equivocaste. Prueba con un numero Menor");

            }
            numeroElegido = scanner.nextInt();
        }
        System.out.println("Felicidades acertaste! el numero era: " + numeroAleatorio);
    }
}
