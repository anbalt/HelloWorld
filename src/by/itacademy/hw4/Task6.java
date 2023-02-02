package by.itacademy.hw4;

public class Task6 {
    public static void main(String[] args) {
        int[] array = {8, 12, -10, 79, -25, -54, 23, 38, 3, 29, 48, -19, -7};
        int positive = 0;
        int negative = 0;
        for (int i = 0; i < array.length ; i++) {
            if(array[i] > 0){
                positive++;
            }else{
                negative++;
            }
        }
        int[] arrayPositive = new int[positive];
        int[] arrayNegative = new int[negative];
        int countPositive = 0;
        int countNegative = 0;
        for (int i = 0; i < array.length ; i++) {
            if(array[i] > 0){
                arrayPositive[countPositive] = array[i];
                countPositive++;
            }else{
                arrayNegative[countNegative] = array[i];
                countNegative++;
            }
        }
        System.out.println("Массив с отрицательными числами:");
        for (int i = 0; i < arrayNegative.length; i++) {
            System.out.println(arrayNegative[i]);
        }

        System.out.println("Массив с положительными числами:");
        for (int i = 0; i < arrayPositive.length ; i++) {

            System.out.println(arrayPositive[i]);
        }
    }
}
