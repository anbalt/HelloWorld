package src.by.itacademy.hw6;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task9 {
    public static void main(String[] args) {

        System.out.println("Enter your e-mail:");
        Scanner scanner = new Scanner(System.in);
        String email = scanner.nextLine();
        System.out.println(valEmail(email));
    }

    public static boolean valEmail(String input) {

        String regex = "(\\w{6,})@(\\w+\\.)([a-z]{2,6})";

        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(input);
        return matcher.find();
    }
}
