package src.by.itacademy.hw10.task4;

public class Pet implements Comparable<Pet> {
    private String name;
    double price;

    public Pet(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public int compareTo(Pet o) {
        return 0;
    }
}