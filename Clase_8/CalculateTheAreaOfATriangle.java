package Clase_8;

import java.util.Scanner;

public class CalculateTheAreaOfATriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base");
        int base = sc.nextInt();
        System.out.println("Enter the height");
        int height = sc.nextInt();
        int result = calculateTriangle(base,height);
        System.out.println(result);
    }
    static int calculateTriangle(int base, int height){
        return (base * height) / 2;
    }
}
