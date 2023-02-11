package src.by.itacademy.hw7.Task4;

public class Printer {
    public static void printBouquet(Flower[] flowers) {
        StringBuilder stringBuilder = new StringBuilder(flowers.length);

        for(Flower flower : flowers) {
            stringBuilder.append(flower.getName());
            stringBuilder.append(" , ");
        }
        System.out.println(stringBuilder.toString());
    }
    
    public static void printPrice(double price) {
        System.out.println("The price of the bouquet is: " + price + " $");
    }
}
