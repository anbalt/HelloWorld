package by.itacademy.hw4;

public class Task5 {
    public static void main(String[] args) {

        int[] array = {6, 39, 7, 3, 12, 5, 1, 10};

        int n = array.length;
        int minIndex = 0;
        int minValue = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
                if (i % 2 != 0);
                minIndex = i;
            }
        }
        System.out.println("Minimal element with the odd index: " + minIndex);
    }
}
