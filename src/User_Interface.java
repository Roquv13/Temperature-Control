import java.util.Scanner;

public class User_Interface {
    Scanner scanner = new Scanner(System.in);
    Temperature_Manual temperatureManual = new Temperature_Manual();
    HeatUp_Plans heatUpPlans = new HeatUp_Plans();

    public void displayUserSelection() {
        Settings settings = new Settings();
        Lock_Interface lockInterface = new Lock_Interface();

        boolean select = true;

        do {
            System.out.println("1. Display actual temperature");
            System.out.println("2. Temperature control");
            lockInterface.displayLockInterface(); //Lock or unlock
            System.out.println("4. Heat up plans");
            System.out.println("5. Settings");
            System.out.println("6. Exit");
            System.out.println("Select:");
            int userSelection = scanner.nextInt();
            System.out.println();

            switch (userSelection) {
                case 1 -> {
                    System.out.println("Actual temperature: " + temperatureManual.getTemperature() + settings.getTempUnit());
                }
                case 2 -> displayTempControlSelection();
                case 3 -> lockInterface.isLocked();
                case 4 -> heatUpPlans.displayHeatUpPlans();
                case 5 -> {
                    settings.tempChangeUnit();
                    if (settings.getTempUnit() == '\u2109') {
                        double tempConvert = (temperatureManual.getTemperature() * 1.8) + 32;
                        temperatureManual.setTemperature(tempConvert);
                    } else if (settings.getTempUnit() == '\u2103') {
                        double tempConvert = (temperatureManual.getTemperature() - 32) / 1.8;
                        temperatureManual.setTemperature(tempConvert);
                    }
                }
                case 6 -> select = false;
            }
        } while (select);
    }
    public void displayTempControlSelection() {
        boolean select = true;

        do {
            System.out.println("Type of temperature control:");
            System.out.println("1. Automatic");
            System.out.println("2. Manual");
            System.out.println("3. Back");
            System.out.println();

            System.out.println("Select:");
            int userSelection = scanner.nextInt();

            switch (userSelection) {
                case 1 -> System.out.println("Automatic");
                case 2 -> {
                    System.out.println("Set up temperature:");
                    double value = scanner.nextDouble();
                    temperatureManual.setTemperature(value);
                    select = false;
                }
                case 3 -> select = false;
            }
        } while (select);
    }
}
