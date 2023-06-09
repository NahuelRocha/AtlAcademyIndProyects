package Clase_6;

import java.util.Scanner;

public class SearchCountry {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a country to start the search");
        String country = sc.nextLine();


        System.out.println("https://www.google.com/maps/search/" + country);
    }
}
