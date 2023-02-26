package src.by.itacademy.hw19;

public class Main {
    public static void main(String[] args) {
        Drink[] drinks = {
                new Cocktail("Lilet", 0.5, 0.3, 19, 12),
                new Cocktail("Purple", 0.45, 0.4, 20, 13),
                new HotChocolate("Hot Chocolate with Marshmallow", 0.6, false),
                new HotChocolate("Cocoa", 0.5, true),
                new EnergyWater("Guarana", 0.3, "cherry", 15),
                new EnergyWater("Energy", 0.2, "cola", 16),
                new ProteinShake("Milk chocolate", 0.7, "chocolate", 30, 250),
                new ProteinShake("Berry Milkshake", 0.7, "raspberry", 30, 250),
                new Water("Purified water", 0.5) };

        for(Drink drink : drinks) {
            drink.print();
        }
        System.out.println("Total calories: " + BeverageUse.getTotalCalories(drinks) + " kcal");
        System.out.println();

        for(Drink drink : drinks) {
            System.out.println(drink.getName() + " is " + (BeverageUse.isStimulating(drink) ? "stimulating" : "not stimulating"));
        }
        System.out.println();

        BeverageUse.drinkEverything(drinks);
    }
}
