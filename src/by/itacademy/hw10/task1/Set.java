package src.by.itacademy.hw10.task1;

import java.util.TreeSet;

public class Set {
    private static void printSet(String string, java.util.Set<Integer> set) {
        if (set.size() != 0) {
            System.out.print(string + " - { ");
            for (Integer currentElement : set) {
                System.out.print(currentElement + " ");
            }
            System.out.println("}");
        }
    }

    private static java.util.Set<Integer> union(java.util.Set<Integer> firstSet, java.util.Set<Integer> secondSet) {
        java.util.Set<Integer> unionSet = new TreeSet<Integer>();
        for (Integer currentElement : firstSet) {
            unionSet.add(currentElement);
        }
        for (Integer currentElement : secondSet) {
            unionSet.add(currentElement);
        }
        return unionSet;
    }

    private static java.util.Set<Integer> intersaction(java.util.Set<Integer> firstSet, java.util.Set<Integer> secondSet) {
        java.util.Set<Integer> intersactionSet = new TreeSet <Integer> ();
        for (Integer firstSetElement : firstSet) {
            for (Integer secondSetElement : secondSet) {
                if (firstSetElement == secondSetElement) {
                    intersactionSet.add(firstSetElement);
                }
            }
        }
        return intersactionSet;
    }

    public static void main(String[] args) {
        java.util.Set<Integer> firstSet = new TreeSet <Integer> ();
        for (int i = 0; i < 10; i++) {
            firstSet.add(i + 1);
        }
        printSet("First set", firstSet);

        java.util.Set<Integer> secondSet = new TreeSet <Integer> ();
        for (int i = 4; i < 15; i++) {
            secondSet.add(i + 1);
        }
        printSet("Second set", secondSet);

        printSet("Union set", union(firstSet, secondSet));
        printSet("Intersaction set", intersaction(firstSet, secondSet));
    }
}
