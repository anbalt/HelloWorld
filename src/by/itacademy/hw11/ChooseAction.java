package src.by.itacademy.hw11;

import java.util.Scanner;

public class ChooseAction {
    Scanner scanner = new Scanner(System.in);
    private int action;

    public ChooseAction() {
        chooseAction();
    }
    public int getAction() {
        return action;
    }

    public void chooseAction() {
        action = 0;
        if (action < 0 || action > 3) {
            System.out.println("The action is not available");
        }
    }
}
