package src.by.itacademy.hw19;

public abstract class Drink implements Printable {
    private String name;
    private double volume;

    public Drink(String name, double volume) {
        this.name = name;
        this.volume = volume;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }
    public abstract double getCaloriesPer100ML();

    public abstract boolean containsAlcohol();

    @Override
    public void print() {
        System.out.println(toString());
    }
}
