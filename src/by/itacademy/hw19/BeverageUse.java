package src.by.itacademy.hw19;

public class BeverageUse {
    public static double getTotalCalories(Drink[] drinks) {
        double total = 0;
        for (Drink drink : drinks) {
            total += 10 * drink.getCaloriesPer100ML() * drink.getVolume();
        }
        return total;
    }
    public static boolean isStimulating(Object object) {
        return object instanceof Stimulating;
    }

    public static void drinkEverything(Drink[] drinks) {
        double totalCalories = getTotalCalories(drinks);
        double totalAlcohol = 0;
        boolean isStimulating = false;

        for (Drink drink : drinks) {
            if(drink instanceof ContainsAlcohol) {
                totalAlcohol += ((ContainsAlcohol) drink).getTotalAlcoholVolume();
            }

            if(drink instanceof Stimulating) {
                isStimulating = true;
            }
        }
        System.out.println("Total calories: " + totalCalories + " kcal.");
        System.out.println("Total alcohol amount: " + totalAlcohol + " l.");
        if(isStimulating) {
            System.out.println("This drink is stimulating!");
        }else {
            System.out.println("This drink is not stimulating!");
        }
    }
}
