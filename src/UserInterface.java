import java.util.Scanner;

public class UserInterface {
    boolean isLocked = false;
    public void displayUserSelection() {
        Scanner scanner = new Scanner(System.in);
        boolean select = true;

        do {
            System.out.println("1. Display actual temperature");
            System.out.println("2. Temperature control");
            displayLockInterface();
            System.out.println("4. Heat up plans");
            System.out.println("5. Settings");
            System.out.println("6. Exit");
            System.out.println();

            System.out.println("Select:");
            int userSelection = scanner.nextInt();

            switch (userSelection) {
                case 1 -> System.out.println("case1");
                case 2 -> System.out.println("case2");
                case 3 -> {
                    if (isLocked == false) isLocked = true;
                    else if (isLocked == true) isLocked = false;
                }
                case 4 -> System.out.println("case4");
                case 5 -> System.out.println("case5");
                case 6 -> select = false;
            }
        } while (select);
    }

    public void displayTempControlSelection() {
        System.out.println("Type of temperature control:");
        System.out.println("1. Automatic");
        System.out.println("2. Manual");
        System.out.println("3. Back");
        System.out.println();
    }

    public void displayHeatUpPlans() {
        System.out.println("Heat up plans:");
        System.out.println("1. Whole week");
        System.out.println("2. Working days + weekend");
        System.out.println("3. Working days + sunday");
        System.out.println("4. Back");
        System.out.println();
    }

    public void displayLockInterface() {
        if (isLocked == false) {
            System.out.println("3. Lock interface");
        } else if (isLocked == true) {
            System.out.println("3. Unlock interface");
        }
    }
}
