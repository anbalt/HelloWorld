package src.by.itacademy.hw19;

public class Cocktail extends AlcoholicDrink {
    private double sugarAmount;

    public Cocktail (String name, double volume, double alcoholRation, int ibu, double sugarAmount) {
        super(name, volume, alcoholRation);
        this.sugarAmount = sugarAmount;
    }

    public double getSugarAmount() {
        return sugarAmount;
    }

    public void setSugarAmount(double sugarAmount) {
        this.sugarAmount = sugarAmount;
    }

    @Override
    public double getCaloriesPer100ML() {
        return 2 * sugarAmount;
    }

    @Override
    public String toString() {
        return "Cocktail" + getName() + ", " + getVolume() + " l." +
                "alcohol ratio: " + getAlcoholRatio() + " , "  +
                "sugar amount: " + getSugarAmount() + ".";
    }
}
