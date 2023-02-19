package src.by.itacademy.hw12.task2;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Main {
    private static final FileService fileService = new FileService();
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your text: ");
        String text = scanner.nextLine();

        String fileName = "text.txt";
        fileService.writeText(text, fileName);
        fileService.readFile(fileName);

        FileReader fileReader = new FileReader("text.txt");
        Scanner scanner1 = new Scanner(fileReader);


    }
}
