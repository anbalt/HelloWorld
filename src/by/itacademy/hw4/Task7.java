package by.itacademy.hw4;

public class Task7 {
    public static void main(String[] args) {
        int size = 5;
        int[] array = new int[size];
        for (int i = 0; i < array.length-1; i++){
            array[i] = (int)(Math.random()*10);
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        int rounds = array.length / 2;
        for (int r = 0; r < rounds; r++) {
            int temp = array[r];
            array[r] = array[size-1-r];
            array[size-1-r] = temp;
        }
        System.out.println("Reverse");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
