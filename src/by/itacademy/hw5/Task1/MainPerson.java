package by.itacademy.hw5.Task1;

public class MainPerson {
    public static void main(String[] args) {

        Person person = new Person ("Annie", 23);
        Person undefinedPerson = new Person ();

        person.move();
        undefinedPerson.move();

        person.talk();
        undefinedPerson.talk();

    }
}
