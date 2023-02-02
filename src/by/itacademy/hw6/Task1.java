package src.by.itacademy.hw6;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        System.out.println("Enter a text");
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();
        str = str.replaceAll("\\s+", " ");

        System.out.println(str.trim());
    }
}
