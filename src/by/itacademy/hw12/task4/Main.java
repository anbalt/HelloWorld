package src.by.itacademy.hw12.task4;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    private static final String FILE_NAME = "Person.txt";
    public static void main(String[] args) {
        Person[] people = {new Person("Kate", "Jones", 28),
                new Person("Ann", "Cooper", 21),
                new Person("John", "Parker", 24),
                new Person("Robert", "Pitt", 27),
                new Person("Will", "Willson", 22)};

        try (FileOutputStream fileOutputStream = new FileOutputStream(FILE_NAME);
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {

            objectOutputStream.writeInt(people.length);

            for (Person person : people) {
                objectOutputStream.writeObject(person);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (FileInputStream fileInputStream = new FileInputStream(FILE_NAME);
             ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {

            int personCount = objectInputStream.readInt();
            Person[] people1 = new Person[personCount];

            for (int i = 0; i < personCount; i++) {
                people1[i] = (Person) objectInputStream.readObject();
            }

            Arrays.sort(people1, new Comparator<Person>() {
                public int compare(Person first, Person second) {
                    if (first.getSurname() != second.getSurname()) {
                        return first.getSurname().compareTo(second.getSurname());
                    }
                    return first.getName().compareTo(second.getName());
                }
            });
            System.out.println(Arrays.toString(people1));
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
