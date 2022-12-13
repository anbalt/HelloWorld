package by.itacademy.hw2;

public class Task4 {
    public static void main(String[ ] args) {

        byte b = 7;
        short s = 12;
        int i = 88;
        long l = 100;
        float f = 9.5f;
        double d = 17.9;
        char c = '5';

        System.out.println(toByte(s));
        System.out.println(toByte(i));
        System.out.println(toByte(l));
        System.out.println(toByte(f));
        System.out.println(toByte(d));
        System.out.println(toByte(c));

        System.out.println(toShort(b));
        System.out.println(toShort(i));
        System.out.println(toShort(l));
        System.out.println(toShort(f));
        System.out.println(toShort(d));
        System.out.println(toShort(c));

        System.out.println(toInt(b));
        System.out.println(toInt(s));
        System.out.println(toInt(l));
        System.out.println(toInt(f));
        System.out.println(toInt(d));
        System.out.println(toInt(c));

        System.out.println(toLong(b));
        System.out.println(toLong(s));
        System.out.println(toLong(i));
        System.out.println(toLong(f));
        System.out.println(toLong(d));
        System.out.println(toLong(c));

        System.out.println(toFloat(b));
        System.out.println(toFloat(s));
        System.out.println(toFloat(i));
        System.out.println(toFloat(l));
        System.out.println(toFloat(d));
        System.out.println(toFloat(c));

        System.out.println(toDouble(b));
        System.out.println(toDouble(s));
        System.out.println(toDouble(i));
        System.out.println(toDouble(l));
        System.out.println(toDouble(f));
        System.out.println(toDouble(c));

        System.out.println(toChar(b));
        System.out.println(toChar(s));
        System.out.println(toChar(i));
        System.out.println(toChar(l));
        System.out.println(toChar(f));
        System.out.println(toChar(d));

    }
    public static byte toByte(short s) {

        byte contractedShort = (byte) s;
        return contractedShort;

    }
    public static byte toByte(int i) {

        byte contractedInt = (byte) i;
        return contractedInt;

    }
    public static byte toByte(float f) {

        byte contractedFloat = (byte) f;
        return contractedFloat;

    }
    public static byte toByte(double d) {

        byte contractedDouble = (byte) d;
        return contractedDouble;

    }
    public static byte toByte(char c) {

        byte contractedChar = (byte) c;
        return contractedChar;

    }

    public static byte toByte(long l) {

        byte contractedLong= (byte) l;
        return contractedLong;

    }
    public static short toShort(byte b) {

        short expandedByte = b;
        return expandedByte;

    }
    public static short toShort(int i) {

        short contractedInt = (short) i;
        return contractedInt;

    }
    public static short toShort(long l) {

        short contractedLong = (short) l;
        return contractedLong;

    }
    public static short toShort(float f) {

        short contractedFloat = (short) f;
        return contractedFloat;

    }

    public static short toShort(double d) {

        short contractedDouble = (short) d;
        return contractedDouble;

    }
    public static short toShort(char c) {

        short expandedChar = (short) c;
        return expandedChar;

    }
    public static int toInt(byte b) {

        int expandedByte = b;
        return expandedByte;

    }
    public static int toInt(short s) {

        int expandedShort = s;
        return expandedShort;

    }
    public static int toInt(long l) {

        int contractedLong = (int) l;
        return contractedLong;

    }
    public static int toInt(float f) {

        int contractedFloat = (int) f;
        return contractedFloat;

    }
    public static int toInt(double d) {

        int contractedDouble = (int) d;
        return contractedDouble;

    }
    public static int toInt(char c) {

        int contractedChar = (int) c;
        return contractedChar;

    }
    public static long toLong(byte b) {

        long expandedByte = b;
        return expandedByte;

    }
    public static long toLong(short s) {

        long expandedShort = s;
        return expandedShort;

    }
    public static long toLong(int i) {

        long expandedInt = i;
        return expandedInt;

    }

    public static long toLong(float f) {

        long contractedFloat = (long) f;
        return contractedFloat;

    }
    public static long toLong(double d) {

        long contractedDouble = (long) d;
        return contractedDouble;

    }
    public static long toLong(char c) {

        long expandedChar = c;
        return expandedChar;

    }
    public static float toFloat(byte b) {

        float expandedByte = b;
        return expandedByte;

    }

    public static float toFloat(short s) {

        float expandedShort = s;
        return expandedShort;

    }

    public static float toFloat(int i) {

        float expandedInt = i;
        return expandedInt;

    }
    public static float toFloat(double d) {

        float contractedDouble = (float) d;
        return contractedDouble;

    }

    public static float toFloat(char c) {

        float expandedChar = c;
        return expandedChar;

    }
    public static double toDouble(byte b) {

        double expandedByte = b;
        return expandedByte;

    }
    public static double toDouble(short s) {

        double expandedShort = s;
        return expandedShort;

    }
    public static double toDouble(int i) {

        double expandedInt = i;
        return expandedInt;

    }
    public static double toDouble(float f) {

        double expandedFloat = f;
        return expandedFloat;

    }
    public static double toDouble(char c) {

        double expandedChar = c;
        return expandedChar;

    }
    public static char toChar(byte b) {

        char expandedByte = (char) b;
        return expandedByte;

    }
    public static char toChar(short s) {

        char contractedShort = (char) s;
        return contractedShort;

    }

    public static char toChar(int i) {

        char contractedInt = (char) i;
        return contractedInt;

    }
    public static char toChar(long l) {

        char contractedLong = (char) l;
        return contractedLong;

    }
    public static char toChar(float f) {

        char contractedFloat = (char) f;
        return contractedFloat;

    }
    public static char toChar(double d) {

        char contractedDouble = (char) d;
        return contractedDouble;

    }

}
