package src.by.itacademy.hw6;

public class Task7 {
    public static void main(String[] args) {

        Double double1 = new Double(5.5);
        double d = 5.5;
        String str = "123";
        String st = "";
        byte b = 9;
        double by = 0;
        short s = 12;
        double sh = 0;
        int i = 23;
        double in = 0;
        long l = 50;
        double lo = 0;
        float f = 23.5f;
        double fl = 0;
        double doub = 0;

        System.out.println(double1);
        System.out.println(valueOf(d));
        System.out.println(toDouble(String.valueOf(st)));
        System.out.println(byteToDouble((byte) by));
        System.out.println(shortToDouble((short) sh));
        System.out.println(intToDouble((int) in));
        System.out.println(longToDouble((long) lo));
        System.out.println(floatToDouble((float) fl));
        System.out.println(doubleToString(Double.parseDouble(String.valueOf(doub))));
    }
    public static double valueOf(double d) {
        d = Double.valueOf("5");
        return d;
    }

    public static String toDouble(String str) {
        double st = Double.parseDouble(str);
        return str;
    }

    public static double byteToDouble(byte b) {
        double by = Double.parseDouble(String.valueOf(b));
        return by;
    }

    public static double shortToDouble(short s) {
        double sh = Double.parseDouble(String.valueOf(s));
        return sh;
    }

    public static double intToDouble(int i) {
        double in = Double.parseDouble(String.valueOf(i));
        return in;
    }

    public static double longToDouble(long l) {
        double lo = Double.parseDouble(String.valueOf(l));
        return lo;
    }

    public static double floatToDouble(float f) {
        double fl = Double.parseDouble(String.valueOf(f));
        return fl;
    }

    public static String doubleToString(double d) {
        String doub = Double.toString(3.14);
        return doub;
    }
}
