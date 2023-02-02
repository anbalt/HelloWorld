package by.itacademy.hw4;

public class Task5 {
    public static void main(String[] args) {

        System.out.println("Enter the array size:");

        Scanner scanner = new Scanner(System.in);

        int size;
        while ((size = scanner.nextInt()) <= 0) {
            System.out.println("Error! The array with the entered size can't exist! Enter a value > 0.");
        }

        Random random = new Random();
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(50);
            System.out.println(array[i]);
        }


        int min = array[0];
        int temp = 0;


        for (int i = 0; i < size; i++) {
            if (i % 2 != 0) {
                if ((temp = array[i]) < min) {
                    min = temp;
                }
            }
        }
        System.out.println("The min element with the odd index is " + min);
    }
}
