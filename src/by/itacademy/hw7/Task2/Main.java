package src.by.itacademy.hw7.Task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter a value to convert: ");
        Scanner scanner = new Scanner(System.in);
        double t = scanner.nextDouble();

        System.out.println("t = " + new CelciusConverter().getConvertedValue(t) + " °C");
        System.out.println("t = " + new FahrenheitConverter().getConvertedValue(t) + " °F");
        System.out.println("t = " + new KelvinConverter().getConvertedValue(t) + " K");
    }
}
