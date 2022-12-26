package by.itacademy.hw5.Task1;

public class MainPerson {
    public static void main(String[] args) {

        Person person = new Person ("Annie", 23);
        Person undefinedPerson = new Person ();

        System.out.println(person.getFullInfo());
        System.out.println(undefinedPerson.getFullInfo());

        Person.move("Annie");
        Person.talk("Someone");

    }
}
