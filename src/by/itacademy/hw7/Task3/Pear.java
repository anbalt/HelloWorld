package src.by.itacademy.hw7.Task3;

public class Pear extends Fruit {
    private int count;
    private double totalWeight;
    private double totalCost;

    public Pear() {
        super("Pear");
        setWeight(0.7 * (Math.random() + 1));
        totalWeight += getWeight();
        count++;
    }
    
    public Pear(double price) {
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
        return "Pear{" + "name='" + getName() + "\'" + ", weight=" + getWeight() + "}";
    }
}
