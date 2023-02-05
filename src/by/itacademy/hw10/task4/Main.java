package src.by.itacademy.hw10.task4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Pet> cat = new ArrayList<Pet>();
        cat.add(new Pet("Bars",  23.4));
        cat.add(new Pet("Kitty", 22.5));
        cat.add(new Pet("Murr", 25.3));

        ArrayList<Pet> dog = new ArrayList<Pet>();
        dog.add(new Pet("Chuck", 27.7));
        dog.add(new Pet("Rex", 26.3));
        dog.add(new Pet("Jack", 28.4));

        ArrayList<Pet> parrot = new ArrayList<Pet>();
        parrot.add(new Pet("Kesha", 25.9));
        parrot.add(new Pet("Gosha", 26.7));
        parrot.add(new Pet("Dan", 27.2));

        Comparator<Pet> compareByName = new Comparator<Pet>() {
            @Override
            public int compare(Pet o1, Pet o2) {
                return o1.name.compareTo(o2.name);
            }
        };

        Collections.sort(cat, compareByName);
        Collections.sort(dog, compareByName);
        Collections.sort(parrot, compareByName);
        Comparator<Pet> compareByPrice = new Comparator<Pet>() {
            @Override
            public int compare(Pet o1, Pet o2) {
                return o1.price.compareTo(o2.price);
            }
        };

        Collections.sort(cat, compareByPrice);
        Collections.sort(dog, compareByPrice);
        Collections.sort(parrot, compareByPrice);
    }
}

