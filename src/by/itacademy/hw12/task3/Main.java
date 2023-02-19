package src.by.itacademy.hw12.task3;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try (FileOutputStream fileOutputStream = new FileOutputStream("file.txt")) {
            int sum = 0;
            int averageValue;
            byte[] values = new byte[30];
            for (int i = 0; i < 30; i++) {
                values[i] = (byte) ((byte) 1 + Math.random() * 100);
                sum += values[i];
            }
            averageValue = sum / 30;
            fileOutputStream.write(values);

            FileInputStream fileInputStream = new FileInputStream("file.txt");
            int i;
            while ((i = fileInputStream.read()) != -1) {
                System.out.println(i);
            }
            System.out.println("The average value is " + averageValue);
            fileInputStream.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}


