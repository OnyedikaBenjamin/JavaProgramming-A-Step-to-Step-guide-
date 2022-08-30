package _9_ObjectsAndClasses;
public class Time {
    private int minute;
    private int second;
    private  int hour;


    public Time(int minute, int second, int hour) {
        validate(minute, second, hour);

        this.minute = minute;
        this.second = second;
        this.hour = hour;
    }

    public void setMinute(int minute) {
        validateMinute(minute);
        this.minute = minute;
    }

    public void setSecond(int second) {
        validateSecond(second);
        this.second = second;
    }

    public void setHour(int hour) {
        validateHour(hour);
        this.hour = hour;
    }

    private void validate(int minute, int second, int hour) {
        validateSecond(second); // Abstraction
        validateMinute(minute);
        validateHour(hour);
    }

    private void validateSecond(int second) {
        if(second <0 || second >59) throw new IllegalArgumentException
                (String.format("Second entered is %s, please enter seconds between 0 and 59", second));
    }

    private void validateMinute(int minute) {
        if(minute <0 || minute >59) throw new IllegalArgumentException
                (String.format("Minute entered is %s, please enter minute between 0 and 59", minute));
    }

    private void validateHour(int hour) {
        if(hour <0 || hour >23) throw new IllegalArgumentException
                (String.format("Hour entered is %s, please enter hour between 0 and 23", hour));
    }
}