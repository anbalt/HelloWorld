package src.by.itacademy.hw10.task3;

public class Main {
    public static void main(String[] args) {
        StackWithMin<Integer> stackWithMin = new StackWithMin<>();
        stackWithMin.push(3);
        stackWithMin.push(5);
        stackWithMin.push(7);
        stackWithMin.push(9);
        stackWithMin.push(11);

        System.out.println(stackWithMin);

        System.out.println(stackWithMin.pop());
        System.out.println(stackWithMin);

        stackWithMin.push(13);
        System.out.println(stackWithMin);

        System.out.println(stackWithMin.min());
        System.out.println(stackWithMin);

    }
}
