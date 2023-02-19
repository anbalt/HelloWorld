package src.by.itacademy.hw11;

public class Menu {

    private final Action action = new Action();

    public static void main(String[] args) {
        new Menu().expandMenu();
    }

    private void expandMenu() {
        System.out.println("Choose an action: \n" + "1 - Sign in\n" + "2 - Sign up\n" + "3 - Exit");

        boolean toExit = false;

        while (!toExit) {
            switch (new ChooseAction().getAction()) {
                case 1:
                    action.signIn();
                    expandMenu();
                    break;
                case 2:
                    action.signUp();
                    expandMenu();
                    break;
                case 3:
                    toExit = true;
                    break;
            }
        }
    }
}

