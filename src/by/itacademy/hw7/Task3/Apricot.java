package src.by.itacademy.hw7.Task3;

public class Apricot extends Fruit {
    private int count;
    private double totalWeight;
    private double totalCost;

    public Apricot() {
        super("Apricot");
        setWeight(0.5 * (Math.random() + 1));
        totalWeight += getWeight();
        count++;
    }
    
    public Apricot(double price) {
        this();
        this.setPrice(price);
        totalCost += getCost();
    }
    
    public static int getCount() {
        return count;
    }
    
    public static double getTotalWeight() {
        return totalWeight;
    }
    
    public static double getTotalCost() {
        return totalCost;
    }
    
    public double getCost() {
        return getWeight() * this.getPrice();
    }

    @Override
    public String toString() {
        return "Apricot{" + "name='" + getName() + "\'" + ", weight=" + getWeight() + "}";
    }
}
