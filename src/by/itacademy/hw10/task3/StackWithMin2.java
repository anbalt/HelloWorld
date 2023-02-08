package src.by.itacademy.hw10.task3;

import java.util.ArrayList;

public class StackWithMin<T extends Comparable<>> {
    
    private List<T> StackWithMin = new ArrayList<>();
    
    public void push(T newValue) {
        stackWithMin.add(newValue);
    }
    
    public void pop() {
        T lastValue = stackWithMin.get(stackWithMin.size() - 1);
        stackWithMin.remove(stackWithMin.size() - 1);
        return lastValue;
    }

    @Override
    public String toString() {
        return "StackWithMin{" +
                "StackWithMin=" + StackWithMin +
                '}';
    }
}
