package src.by.itacademy.hw6;

public class Task4 {
    public static void main(String[] args){
        StringBuilder stringBuilder1 = createString(3, 56);
        System.out.println(stringBuilder1);

        modifyString(stringBuilder1);
        System.out.println(stringBuilder1);
    }

    public static StringBuilder createString(int a, int b) {
        StringBuilder result = new StringBuilder();
        result.append(a).append(" + ").append(b).append(" = ").append(a + b).append("\n")
                .append(a).append(" - ").append(b).append(" = ").append(a - b).append("\n")
                .append(a).append(" * ").append(b).append(" = ").append(a * b).append("\n");
        return result;
        
    }
    public static void modifyString(StringBuilder stringBuilder) {
        int pos = stringBuilder.indexOf("=");
        while ((pos = stringBuilder.indexOf("=")) != -1) {
            stringBuilder.deleteCharAt(pos);
            stringBuilder.insert(pos, " equal ");
        }
    }
}
