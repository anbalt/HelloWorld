package src.by.itacademy.hw10.task2;

import java.util.HashMap;
import java.util.Scanner;

public class Map {
    public static void main(String[] args) {
        System.out.println("Enter the sentence:");

        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        String[] words = str.split(" ");

        HashMap<String, Integer> keyValue = new HashMap<String, Integer>();

        for (int i = 0; i <= words.length - 1; i++) {

            if (keyValue.containsKey(words[i])) {

                int counter = keyValue.get(words[i]);

                keyValue.put(words[i], counter + 1);

            } else {

                keyValue.put(words[i], 1);

            }
        }
        System.out.println(keyValue);
    }
}

