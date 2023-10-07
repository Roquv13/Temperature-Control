import java.util.Scanner;

public class UserInterface {
    Scanner scanner = new Scanner(System.in);

    boolean isLocked = false;
    double temperature = 22;
    char celsius = '\u2103';
    char fahrenheit = '\u2109';
    public void displayUserSelection() {
        boolean select = true;

        do {
            System.out.println("1. Display actual temperature");
            System.out.println("2. Temperature control");
            displayLockInterface(); //Lock or unlock
            System.out.println("4. Heat up plans");
            System.out.println("5. Settings");
            System.out.println("6. Exit");
            System.out.println();

            System.out.println("Select:");
            int userSelection = scanner.nextInt();

            switch (userSelection) {
                case 1 -> System.out.println("Actual temperature: " + temperature + celsius);
                case 2 -> displayTempControlSelection();
                case 3 -> {
                    if (isLocked == false) isLocked = true;
                    else if (isLocked == true) isLocked = false;
                }
                case 4 -> displayHeatUpPlans();
                case 5 -> System.out.println("case5");
                case 6 -> select = false;
            }
        } while (select);
    }
    public void displayTempControlSelection() {
        boolean select = true;

        System.out.println("Type of temperature control:");
        System.out.println("1. Automatic");
        System.out.println("2. Manual");
        System.out.println("3. Back");
        System.out.println();

        System.out.println("Select:");
        int userSelection = scanner.nextInt();

        do {
            switch (userSelection) {
                case 1 -> System.out.println("Automatic");
                case 2 -> System.out.println("Manual");
                case 3 -> select = false;
            }
        } while (select);
    }

    public void displayLockInterface() {
        if (isLocked == false) {
            System.out.println("3. Lock interface");
        } else if (isLocked == true) {
            System.out.println("3. Unlock interface");
        }
    }

    public void displayHeatUpPlans() {
        boolean select = true;
        
        System.out.println("Heat up plans:");
        System.out.println("1. Whole week");
        System.out.println("2. Working days + weekend");
        System.out.println("3. Working days + sunday");
        System.out.println("4. Back");
        System.out.println();

        System.out.println("Select:");
        int userSelection = scanner.nextInt();

        do {
            switch (userSelection) {
                case 1 -> System.out.println("Whole week");
                case 2 -> System.out.println("Working days + weekend");
                case 3 -> System.out.println("Working days + sunday");
                case 4 -> select = false;
            }
        } while (select);
    }

}
