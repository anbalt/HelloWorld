package src.by.itacademy.hw6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task5 {
    public static void main(String[] args) {
        public static void main(String[] args) {
        String text = ("Object-oriented programming is a programming language model "
                + "organized around objects rather than \"actions\" and data rather than logic. "
                + "Object-oriented programming blabla. Object-oriented programming bla.");

        System.out.println(replace(text, "object-oriented programming"));
    }

    public static StringBuilder replace(String text, String regex) {
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(text);

        StringBuilder newString = new StringBuilder();

        int count = 0;
        int start = 0;
        while (matcher.find()) {
            if (++count % 2 == 0) {
                int end = matcher.start();
                newString.append(text, start, end).append("OOP");
                start = matcher.end();
            }
        }
        newString.append(text.substring(start));
        return newString;
    }
}
