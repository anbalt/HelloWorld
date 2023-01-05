package by.itacademy.hw4;

public class Task8 {
    public static void main(String[] args) {

        int[] array = {29, 11, 5, 45, 90, 36, 50, 23, 17, 52};

        System.out.println("Bubble Sort: ");
        executeBubbleSort(array);

        for (int i = 0; i < array.length; i++)
            System.out.println(array[i]);

        System.out.println("Insertion Sort: ");
        executeInsertionSort(array);

        for (int i = 0; i < array.length; i++)
            System.out.println(array[i]);

        System.out.println("Selection Sort: ");
        executeSelectionSort(array);

        for (int i = 0; i < array.length; i++)
            System.out.println(array[i]);
    }

    public static void executeBubbleSort(int[] array) {
        int n = array.length;

        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n - i; j++) {
                if (array[j] < array[j - 1]) {
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
            }
        }
    }
    public static void executeInsertionSort (int[] array) {
        int n = array.length;

        for (int i = 0; i < n; i++) {
            int current = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > current) {
                array[j + 1] = array[j];
                j--;
            }
        }
    }

    public static void executeSelectionSort (int[] array) {
        int n = array.length;

        for (int i = 0; i < n; i++) {
            int min = 1;
            for (int j = i + 1; j < n; j++) {
                if (array[min] > array[i])
                    min = j;
            }
        }
    }
}
