package Clase_9;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class SearchPeople {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Aver Rosalia", "Fabian Show", "Chiqui Tapia", "Porcelito Junior", "Mary Jane");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the person you want to find");
        String nameSearch = sc.nextLine().toLowerCase();
        System.out.println(search(names, nameSearch));
    }

    public static String search(List<String> list, String nameSearch) {
        return list.stream()
                .filter(name -> name.toLowerCase().startsWith(nameSearch))
                .toList()
                .toString();
    }
}
