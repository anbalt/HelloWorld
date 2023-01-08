package src.by.itacademy.hw7.Task3;

import java.util.Objects;

public abstract class Fruit {
    private String name;
    private double weight;
    private double price;

    public void printManufacturerInfo() {
        System.out.println("Made in Belarus");
    }
    public Fruit(String name) {
        this.name = name;
        this.weight = weight;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public abstract double getCost();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fruit fruit = (Fruit) o;
        return Double.compare(fruit.weight, weight) == 0 && Double.compare(fruit.price, price) == 0
                && Objects.equals(name, fruit.name);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, weight, price);
    }
}
