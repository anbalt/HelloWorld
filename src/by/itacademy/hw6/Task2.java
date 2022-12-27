package src.by.itacademy.hw6;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("Enter a text");
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();
        Pattern pattern = Pattern.compile("[^0-9]");
        Matcher matcher = pattern.matcher(str);
        String res = matcher.replaceAll(" ");
        OptionalInt m = Arrays.asList(res.split(" ")).stream().mapToInt((s -> s.length())).max();

        System.out.println(m.getAsInt());
    }
}
