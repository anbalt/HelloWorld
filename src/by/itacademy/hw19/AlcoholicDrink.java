package src.by.itacademy.hw19;

public abstract class AlcoholicDrink extends Drink implements ContainsAlcohol {
    public double alcoholRatio;

    public AlcoholicDrink(String name, double volume, double alcoholRation) {
        super(name, volume);
        this.alcoholRatio = alcoholRatio;
    }

    public double getAlcoholRatio() {
        return alcoholRatio;
    }

    public void setAlcoholRatio(double alcoholRatio) {
        this.alcoholRatio = alcoholRatio;
    }

    @Override
    public boolean containsAlcohol() {
        return true;
    }

    @Override
    public double getTotalAlcoholVolume() {
        return alcoholRatio * super.getVolume();
    }
}
