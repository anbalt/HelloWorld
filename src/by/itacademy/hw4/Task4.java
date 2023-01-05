package by.itacademy.hw4;

public class Task4 {
    public static void main(String[] args) {
        int numbers[] = new int[] {10, 3, 82, 15, 64, 43, 17, 90, 59};
        int min = numbers[0];
        int max = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max)
                max = numbers[i];
            else if (numbers[i] < min)
                min = numbers[i];
        }
        System.out.println("Max element: " + max);
        System.out.println("Min element: " + min);
    }
}
