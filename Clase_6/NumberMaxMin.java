package Clase_6;

import java.util.Arrays;
import java.util.Scanner;

public class NumberMaxMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int numberOne = sc.nextInt();
        System.out.println("Enter the second number");
        int numberTwo = sc.nextInt();
        System.out.println("Enter the third number");
        int numberThree = sc.nextInt();
        int[] number = {numberOne,numberTwo,numberThree};
        Arrays.sort(number);
        System.out.printf("The smallest number is %d and the largest %d",number[0],number[number.length -1]);
    }
}