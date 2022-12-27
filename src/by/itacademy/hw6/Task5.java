package src.by.itacademy.hw6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task5 {
    public static void main(String[] args) {
        String text = ("Object-oriented programming is a programming language model "
                + "organized around objects rather than \"actions\" and data rather than logic. "
                + "Object-oriented programming blabla. Object-oriented programming bla.");
        Pattern pattern = Pattern.compile("Object-oriented programming");
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();
            System.out.println("Match found " + text.substring(start, end) + " in the line");
        }

        text.replaceFirst("Object-oriented programming", "OOP");
        System.out.println(text);

    }
}
