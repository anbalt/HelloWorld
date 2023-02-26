package src.by.itacademy.hw19;

public abstract class NonAlcoholicDrink extends Drink {
    public NonAlcoholicDrink(String name, double volume) {
        super(name, volume);
    }

    @Override
    public boolean containsAlcohol() {
        return false;
    }

}
