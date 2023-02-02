package by.itacademy.hw5.Task2;

public class PhoneMain {
    public static void main(String[] args) {
        Phone phone1 = new Phone();
        phone1.number = "12345678";
        phone1.model = "Apple";
        phone1.weight = 8.9;

        Phone phone2 = new Phone();
        phone2.number = "87654321";
        phone2.model = "Nokia";

        Phone phone3 = new Phone();

        phone1.receiveCall("Jess");
        phone2.receiveCall("Annie");
        phone3.receiveCall("George");

        phone1.receiveCall("Jess", "12345");
        phone2.receiveCall("Annie", "56789");
        phone3.receiveCall("George", "87654");

        phone1.getNumber();
        phone2.getNumber();
        phone3.getNumber();

        phone1.sendMessage("123456778", "56789008");
        phone2.sendMessage("234678854", "12345678");
        phone3.sendMessage("678907665", "567890098");

        phone1.getNumber();
        phone2.getNumber();
        phone3.getNumber();

    }
}
