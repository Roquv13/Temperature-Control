import java.util.Scanner;

public class HeatUp_Plans {
    Scanner scanner = new Scanner(System.in);
    Date_Time dateTime = new Date_Time();
    public void displayHeatUpPlans() {
        boolean select = true;

        do {
            System.out.println("Heat up plans:");
            System.out.println("1. Whole week");
            System.out.println("2. Working days + weekend");
            System.out.println("3. Working days + sunday");
            System.out.println("4. Back");
            System.out.println();

            System.out.println("Select:");
            int userSelection = scanner.nextInt();

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
        switch (dateTime.getDay()) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
        }
    }

    public void weekAllDays() {
        System.out.println("All days of week, only hours");
    }

    public void workingDaysWeekend() {
        switch (dateTime.getDay()) {
            case 1, 2, 3, 4, 5 -> System.out.println("Working day");
            case 6, 7 -> System.out.println("Weekend");
        }
    }
}
