package src.by.itacademy.hw19;

public class EnergyWater extends Water implements Stimulating {
    private String flavour;
    private double caffeineAmount;

    public EnergyWater(String name, double volume, String flavour, double caffeineAmount) {
        super(name, volume);
        this.flavour = flavour;
        this.caffeineAmount = caffeineAmount;
    }

    public String getFlavour() {
        return flavour;
    }

    public void setFlavour(String flavour) {
        this.flavour = flavour;
    }

    public double getCaffeineAmount() {
        return caffeineAmount;
    }

    public void setCaffeineAmount(double caffeineAmount) {
        this.caffeineAmount = caffeineAmount;
    }

    @Override
    public String toString() {
        return "Energy water" + getName() + ", " + "flavour:" + flavour + ". " +
                "caffeine amount: " + caffeineAmount + " mg.";
    }
}
