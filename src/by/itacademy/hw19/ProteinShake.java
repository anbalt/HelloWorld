package src.by.itacademy.hw19;

public class ProteinShake extends NonAlcoholicDrink {
    private String flavour;
    private int proteinAmount;
    private int waterAmount;


    public ProteinShake(String name, double volume, String flavour, int proteinAmount, int waterAmount) {
        super(name, volume);
        this.flavour = flavour;
        this.proteinAmount = proteinAmount;
        this.waterAmount = waterAmount;
    }

    public String getFlavour() {
        return flavour;
    }

    public void setFlavour(String flavour) {
        this.flavour = flavour;
    }

    public int getProteinAmount() {
        return proteinAmount;
    }

    public void setProteinAmount(int proteinAmount) {
        this.proteinAmount = proteinAmount;
    }

    public int getWaterAmount() {
        return waterAmount;
    }

    public void setWaterAmount(int waterAmount) {
        this.waterAmount = waterAmount;
    }

    @Override
    public double getCaloriesPer100ML() {
        double totalCalories = 4.0 * this.proteinAmount + 8 * this.waterAmount;
        return totalCalories / getVolume() * 0.1;
    }

    @Override
    public String toString() {
        return "ProteinShake" + getName() + ", " +  flavour + " flavour" + ", " +
                "protein amount: " + proteinAmount + " g, " + "water amount: " + waterAmount + " ml.";
    }
}
