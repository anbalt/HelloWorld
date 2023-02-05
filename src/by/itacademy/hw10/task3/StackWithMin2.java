package src.by.itacademy.hw10.task3;

import java.util.Stack;

public class StackWithMin2 extends Stack<Integer> {
    Stack<Integer> s2;

    public StackWithMin2() {
        s2 = new Stack<Integer>();
    }

    public static void main(String[] args) {
        push();
    }

    private static void push() {
        if (value <= min()) {
            s2.push(value);
        }
        super.push(value);
    }

    public void push(int value) {
        if (value <= min()) {
            s2.push(value);
        }
        super.push(value);
    }

    public Integer pop() {
        int value = super.pop();
        if(value == min()) {
            s2.pop();
        }
        return value;
    }

    public static int min() {
        if (s2.isEmpty()) {
            return Integer.MAX_VALUE;
        } else {
            return s2.peek();
        }
    }
}