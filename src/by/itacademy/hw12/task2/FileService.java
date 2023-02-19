package src.by.itacademy.hw12.task2;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FileService {

    void writeText(String text, String fileName) {
        try (FileWriter fileWriter = new FileWriter(fileName, false)) {
            fileWriter.write(text);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    public void readFile(String fileName) {
        char[] charArray = new char[0];

        try (FileReader fileReader = new FileReader(fileName)) {
            File file = new File(fileName);
            charArray = new char[(int) file.length()];
            fileReader.read(charArray);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        String string = new String(charArray);
        System.out.println("Text: " + "\n" + string);

        Pattern pattern = Pattern.compile("\\p{Punct}");
        String[] textArray = string.split("\\s");

        int wordsCount = 0;
        int punctCount = 0;

        for (String s : textArray) {
            int count = 0;
            Matcher matcher = pattern.matcher(s);
            while (matcher.find()) {
                ++count;
            }
            punctCount += count;
            if (count != s.length()) {
                ++wordsCount;
            }
        }
        System.out.println("The total quantity of words: " + wordsCount);
        System.out.println("The total quantity of punctuation marks: " + punctCount);
    }
}
