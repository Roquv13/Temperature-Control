public class UserInterface {
    public void displayUserSelection() {
        System.out.println("Select");
        System.out.println("1. Display actual temperature");
        System.out.println("2. Temperature control");
        System.out.println("3. Lock interface");
        System.out.println("4. Heat up plans");
        System.out.println("5. Settings");
        System.out.println("6. Exit");
        System.out.println();
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
}
