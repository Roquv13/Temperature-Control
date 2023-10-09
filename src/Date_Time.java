import java.util.Calendar;

public class Date_Time {
    Calendar calendar = Calendar.getInstance();

    int day;
    int hour;
    int minute;

//    public void day() {
//        this.day = calendar.get(Calendar.DAY_OF_WEEK);
//    }
//
//    public void hour() {
//        this.hour = calendar.get(Calendar.HOUR_OF_DAY);
//    }
//
//    public void minute() {
//        this.minute = calendar.get(Calendar.MINUTE);
//    }

    public int getDay() {
        this.day = calendar.get(Calendar.DAY_OF_WEEK);
        return this.day;
    }

    public int getHour() {
        this.hour = calendar.get(Calendar.HOUR_OF_DAY);
        return this.hour;
    }

    public int getMinute() {
        this.day = calendar.get(Calendar.MINUTE);
        return this.minute;
    }
}
