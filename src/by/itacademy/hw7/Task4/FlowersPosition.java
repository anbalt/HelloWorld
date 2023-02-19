package src.by.itacademy.hw7.Task4;

public class FlowersPosition {
    public static boolean getLength(Flower[] flowers) {
        boolean check = true;
        if(flowers[flowers.length-1] != null) {
            check = false;
        }
        return check;
    }
   
    public static int getPosition(Flower[] flowers) {
        int position = 0;

        for (int i = 0; i < flowers.length; i++) {
            if(flowers[i] == null) {
                position = i;
                break;
            }
        }
        return position;
    }
}
