package by.itacademy.hw5.Task2;

import java.util.Arrays;

public class Phone {
    String number;
    String model;
    double weight;

    Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    Phone() {

    }

    static void receiveCall(String name) {
        System.out.println("Calling " + name);
    }

    static void receiveCall(String name, String number) {
        System.out.println("Calling " + name + " , " + number);
    }

    String getNumber() {
        return number;
    }

    static void sendMessage(String... numbers) {
        System.out.println(Arrays.toString(numbers));
    }
}
