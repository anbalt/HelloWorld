package src.by.itacademy.hw9.task2;


import java.util.ArrayList;
import java.util.Collections;


public class Main {
   public static void main(String[] args) {
        Pair<String, String> pair = new Pair<>("Lorem", "Ipsum");
        pair.printValues();
        pair.swapValue();
        pair.setFirst("Lorem ipsum dolor sit amet");
        pair.setSecond("Amet sit dolor ipsum lorem");
        pair.swapValue();
        pair.printValues();
    }
}

