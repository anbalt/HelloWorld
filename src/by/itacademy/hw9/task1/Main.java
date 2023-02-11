package src.by.itacademy.hw9.task1;

import java.text.NumberFormat;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        printAllResults(getArrayOfCalcOperations());
    }

    public static double[] getArrayOfCalcOperations() {
        return new double[]{
                Calculator.divide(57, 9.5f),
                Calculator.sum((byte) 5, 700L),
                Calculator.multiply((short) 9, 1.6),
                Calculator.subtraction(12, 15.5)
        };
    }

    public static void printAllResults(double[] results) {
        NumberFormat nf = getNumberFormat();
        for (double result : results) {
            System.out.println("result = " + nf.format(result));
        }
    }

    public static NumberFormat getNumberFormat() {
        NumberFormat nf = NumberFormat.getInstance(Locale.ROOT);
        nf.setMinimumFractionDigits(2);
        nf.setMaximumFractionDigits(2);
        return nf;
    }
}
