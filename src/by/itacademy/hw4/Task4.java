package by.itacademy.hw4;

public class Task4 {
    public static void main(String[] args) {
        System.out.println("Enter the array size:");

        Scanner scanner = new Scanner(System.in);

        int size;
        while((size = scanner.nextInt()) <= 0) {
            System.out.println("Error! The array with the entered size can't exist! Enter a value > 0.");
        }

        Random random = new Random();
        int[] array = new int[size];

        for(int i = 0; i < size; i++) {
            array[i] = random.nextInt(50);
            System.out.println(array[i]);
        }

        int max = array[0];
        int maxIndex = 0;
        for(int i = 0; i < size; i++) {
            if(max < array[i]) {
                max = array[i];
                maxIndex = i;
            }
        }
        System.out.println("The max element is " + max);
        System.out.println("The index of the max element is " + maxIndex);

        int min = array[0];
        int minIndex = 0;
        for(int i = 0; i < size; i++) {
            if(min > array[i]) {
                min = array[i];
                minIndex = i;
            }
        }
        System.out.println("The min element is " + min);
        System.out.println("The index of the min element is " + minIndex);
    }
}
