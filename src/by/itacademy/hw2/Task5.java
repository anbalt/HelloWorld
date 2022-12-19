package by.itacademy.hw2;

public class Task5 {
    public static void main(String[] args) {
        int a = 148;
        System.out.println(isEven(a));
    }
    public static boolean isEven(int number) {
        boolean isEven = number % 2 == 0 ? true : false;
        return isEven;
    }

}
