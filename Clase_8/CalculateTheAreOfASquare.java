package Clase_8;

import java.util.Scanner;

public class CalculateTheAreOfASquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length");
        int select = sc.nextInt();
        int result = calculateSquare(select);
        System.out.println(result);
    }

    static int calculateSquare(int side){
       return side * side;
    }
}
