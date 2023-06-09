package Clase_6;

import java.util.Scanner;

public class AverageNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int numberOne = sc.nextInt();
        System.out.println("Enter the second number");
        int numberTwo = sc.nextInt();
        System.out.println("Enter the third number");
        int numberThree = sc.nextInt();
        double result = (double) (numberOne + numberTwo + numberThree) / 3;
        System.out.printf("(%d + %d + %d) / %d = %f", numberOne,numberTwo,numberThree, 3, result);


    }
}

