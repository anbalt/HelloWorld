package src.by.itacademy.hw19;

public class Water extends NonAlcoholicDrink {
    public Water(String name, double volume) {
        super(name, volume);
    }

    @Override
    public double getCaloriesPer100ML() {
        return 0;
    }

    @Override
    public String toString() {
        return getName() + ", " + getVolume() + " ml.";
    }
}
