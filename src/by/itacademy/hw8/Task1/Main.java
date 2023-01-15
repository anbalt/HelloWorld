package src.by.itacademy.hw8.Task1;

public class Main {
    public static void main(String[] args) {
        Food pancake = new Food("Pancake");
        Food smoothie = new Food("Smoothie");

        System.out.println("Recipe: Pancakes.");
        pancake.prepare(new Cookable() {
            @Override
            public void cook() {
                System.out.println();
                System.out.println("1. Beat some eggs with a mixer. \n" +
                        "2. Melt some butter. \n" +
                        "3. Mix beaten eggs with melted butter and add some milk. \n" +
                        "4. Add some sugar or sweeteners. \n");
            }
        });

        System.out.println("Recipe - Smoothie.");
        smoothie.prepare(new Cookable() {
            @Override
            public void cook() {
                System.out.println();
                System.out.println("1. Take some yoghurt. \n" +
                        "2. Take some strawberries and blueberries. \n" +
                        "3. Mix blueberries and yoghurt with a blender. \n");
            }
        });
    }
}
