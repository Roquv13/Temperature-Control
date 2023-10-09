import java.util.Scanner;

public class HeatUp_Plans {
    Scanner scanner = new Scanner(System.in);
    Date_Time dateTime = new Date_Time();
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
                case 1 -> {
                    System.out.println("Set up week by days:");
                    weekByDays();
                }
                case 2 -> {
                    System.out.println("Set up whole week:");
                    weekAllDays();
                }
                case 3 -> {
                    System.out.println("Set up working days and weekend:");
                    workingDaysWeekend();
                }
                case 4 -> select = false;
            }
        } while (select);
    }

    public void weekByDays() {
        
    }

    public void weekAllDays() {

    }

    public void workingDaysWeekend() {

    }
}
