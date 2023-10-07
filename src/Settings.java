import java.util.Scanner;

public class Settings {
    Scanner scanner = new Scanner(System.in);

    public char tempUnit;
    public void tempChangeUnit() {

        System.out.println("Set up temperature unit:");
        System.out.println("1. Celsius");
        System.out.println("2. Fahrenheit");

        System.out.println("Select:");
        int select = scanner.nextInt();

        switch (select) {
            case 1 -> this.tempUnit = '\u2103';
            case 2 -> this.tempUnit = '\u2109';
        }
    }

    public char getTempUnit() {
        return tempUnit;
    }
}
