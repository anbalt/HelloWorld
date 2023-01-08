package src.by.itacademy.hw7.Task3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        List<Fruit> fruits = new ArrayList<>();
        for (int i = 0; i < 35; i++) {
            fruits.add(getAnyFruit());
        }
        printInfo(fruits);
    }
    public static void printInfo(List<Fruit> fruits) {
        System.out.println("Sold: ");
        System.out.printf("Apples: %d pcs (%.2f kg), per %2.f $\n", Apple.getCount(), Apple.getTotalWeight(),
                Apple.getTotalCost());
        System.out.printf("Pears: %d pcs (%.2f kg), per %2.f $\n", Pear.getCount(), Pear.getTotalWeight(),
                Pear.getTotalCost());
        System.out.printf("Apricots: %d pcs (%.2f kg), per %2.f $\n", Apricot.getCount(),
                Apricot.getTotalWeight(), Apricot.getTotalCost());

        System.out.printf("Total income for the sold fruits: %.2f $", getTotalCost(fruits));
    }
    public static double getTotalCost(List<Fruit> fruits) {
        double total = 0.0;
        for(Fruit fruit : fruits) {
            total += fruit.getCost();
        }
        return total;
    }
    public static Fruit getAnyFruit() {
        switch (new Random().nextInt(3)) {
            case 0:
                return new Apple(12);
            case 1:
                return new Pear(10);
            default:
                return new Apricot(15);
        }
    }
}
