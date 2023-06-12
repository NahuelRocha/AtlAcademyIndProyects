package Clase_7;

import java.util.Scanner;

public class ShowNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];
        System.out.println("Enter 5 numbers:");

        for (int i = 0; i < numbers.length ; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        System.out.println("The numbers entered are:");

        int sumOfNumbers = 0;

        for(int number : numbers) {
            System.out.print(number + " ");
            sumOfNumbers += number;
        }

        int minNumber = numbers[0];
        int maxNumber = numbers[0];

        for (int number : numbers) {
            if(number < minNumber){
                minNumber = number;
            } else if(number> maxNumber) {
                maxNumber = number;
            }
        }
        System.out.printf("\nThe smallest number is %d and the largest number is %d.",minNumber,maxNumber);

        int firsNumber = numbers[0];
        int lastNumber = numbers[numbers.length - 1];

        System.out.printf("\nThe first number is %d and the last number is %d.\n",firsNumber,lastNumber);

        int average = sumOfNumbers / numbers.length;

        System.out.println("The average is: " + average);

    }
}
