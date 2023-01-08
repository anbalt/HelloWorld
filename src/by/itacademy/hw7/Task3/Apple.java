package src.by.itacademy.hw7.Task3;

public class Apple extends Fruit {
    private static int count;
    private static double totalWeight;
    private static double totalCost;

    public Apple() {
        super("Apple");
        setWeight(0.3 * (Math.random() + 1));
        totalWeight += getWeight();
        count++;
    }
    public Apple(double price) {
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
        return "Apple{" + "name='" + getName() + "\'" + ", weight=" + getWeight() + "}";
    }
}
