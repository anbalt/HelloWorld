package src.by.itacademy.hw19;

public class HotChocolate extends NonAlcoholicDrink {

    private boolean isBasedOnMilk;

    public HotChocolate(String name, double volume, boolean isBasedOnMilk) {
        super(name, volume);
        this.isBasedOnMilk = isBasedOnMilk;
    }

    public boolean isBasedOnMilk() {
        return isBasedOnMilk;
    }

    public void setBasedOnMilk(boolean basedOnMilk) {
        isBasedOnMilk = basedOnMilk;
    }

    @Override
    public double getCaloriesPer100ML() {
        return isBasedOnMilk ? 100 : 60;
    }

    @Override
    public String toString() {
        return "HotChocolate " + getName() + ", " + getVolume() + " l. " +
                "based on milk: " + (isBasedOnMilk ? "yes" : "no") + ".";
    }
}
