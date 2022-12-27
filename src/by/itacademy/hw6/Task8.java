package src.by.itacademy.hw6;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task8 {
    public static void main(String[] args) {


        System.out.println("Enter a colour code:");
        Scanner scanner = new Scanner(System.in);
        String colour = scanner.nextLine();
        System.out.println(hexValidate(colour));
    }

    public static boolean hexValidate(String input) {

        String regex = "([a-f0-9]{6}|[a-f0-9]{3})";

        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(input);
        return matcher.find();
    }
}
