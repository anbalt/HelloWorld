package src.by.itacademy.hw9.task2;

import java.util.Objects;

public class Pair <X, Y> {
    private X first;
    private Y second;

    public Pair(X first, Y second) {
        this.first = first;
        this.second = second;
    }

    public X getFirst() {
        return first;
    }

    public void setFirst(X first) {
        this.first = first;
    }

    public Y getSecond() {
        return second;
    }

    public void setSecond(Y second) {
        this.second = second;
    }

    public void swapValue() {
        Object first = first;
        Object second = second;
        first = (X) second;
        second = (Y) first;
    }

    public void printValues() {
        System.out.println("First value: " + first);
        System.out.println("Second value: " + second);
    }
}

