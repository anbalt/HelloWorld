package by.itacademy.hw5.Task1;

public class Person {
    private String fullName;
    private int age;

    public Person() {

    }
    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public String getFullInfo() {
        return fullName + "," + age;
    }
    public void move() {
        if(this.fullName == null) {
            System.out.println("The name is unknown!");
        } else {
            System.out.println(this.fullName + " moves");
        }
    }
    public void talk() {
        if(this.fullName == null) {
            System.out.println("The name is unknown!");
        } else {
            System.out.println(this.fullName + " talks");
        }
    }
}
