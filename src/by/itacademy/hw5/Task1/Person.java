package by.itacademy.hw5.Task1;

public class Person {
    String fullName;
    int age;

    Person() {

    }

    Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    String getFullInfo() {
        return fullName + "," + age;
    }
    public static void move(String name) {
        System.out.println(name + " moves");
    }
    public static void talk(String name) {
        System.out.println(name + " talks");
    }
}
