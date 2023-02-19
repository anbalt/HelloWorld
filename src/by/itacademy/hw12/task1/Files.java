package src.by.itacademy.hw12.task1;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Files {
    public static void main(String[] args) throws Exception {
        newFile(1000, "in1.txt");
        newFile(1000, "in2.txt");

        createFileWithSortedNumbers("in1.txt", "in2.txt", "out.txt");
    }

    public static List<Integer> readNumbers(String name) {
        List<Integer> list = new ArrayList<>();

        try (FileReader fileReader = new FileReader(name)) {
            Scanner scanner = new Scanner(fileReader);
            while (scanner.hasNextInt()) {
                list.add(scanner.nextInt());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }

    public static void newFile(int count, String name) {
        try (FileWriter in1 = new FileWriter(name)) {
            for (int i = 1; i <= count; i++) {
                in1.write((int)(Math.random() * (100001 + 1)) - 1 + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void createFileWithSortedNumbers(String fileName1, String fileName2, String fileName3) {
        try(FileWriter outFile = new FileWriter("out.txt")) {
            List<Integer> list = new ArrayList<>();
            list.addAll(readNumbers("in1.txt"));
            list.addAll(readNumbers("in2.txt"));
            Collections.sort(list);

            for(int i = 0; i < list.size(); i++) {
                outFile.write(list.get(i) + "\n");
            }
            outFile.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
