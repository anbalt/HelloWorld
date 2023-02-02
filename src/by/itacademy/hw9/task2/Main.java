package src.by.itacademy.hw9.task2;


import java.util.ArrayList;
import java.util.Collections;


public class Main {
    public static void main(String[] args) {
        ArrayList pair = new ArrayList();
        pair.add("Lorem");
        pair.add("Ipsum");

        System.out.println(pair.get(0));
        System.out.println(pair.get(1));

        Collections.swap(pair, 1,0);
        System.out.println(pair);

        pair.set(0, "Dolor");
        System.out.println(pair);

        pair.set(1, "Sit");
        System.out.println(pair);
    }
}

