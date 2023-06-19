package Clase_8;

import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GeneratePassword {
    public static void main(String[] args) {
        String result = createPassword();
        System.out.println(result);
    }

    public static String createPassword() {
        String letters = Stream.generate(() -> (char) (97 + new Random().nextInt(26)))
                .limit(5)
                .map(String::valueOf)
                .collect(Collectors.joining());

        String number = Stream.generate(() -> new Random().nextInt(10))
                .limit(5)
                .map(String::valueOf)
                .collect(Collectors.joining());

        return letters + number;
    }
}
