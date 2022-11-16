package PD;

public class Time {
    private int hour;
    private int minute;
    private int second;

    public static void main(String[] args) {
        Time time1 = new Time();
        System.out.print("After the time object is created -> "
                       + time1.displayTime());
        System.out.println("");
        System.out.print("After Setting it with positive values -> ");
                time1.setTime(6, 16, 59);
        System.out.println(time1.displayTime());
        System.out.println("");
        System.out.println("Attempt to set time with values out of range -> ");
        time1.setTime(99, 80, 70);
        System.out.println(time1.displayTime());
    }

    // Set a new time, Throw an exception if the user inout is invalid.
    public void setTime(int hour, int minute, int second){
        if(hour < 0 || hour >= 24 || minute < 0 || minute > 59 || second < 0 || second > 59){
            throw new IllegalArgumentException("Hour, Minute or Second out of range");
        }
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    // Display in universal time format
    public String configureTimeToUniversalString(){
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    public String displayTime(){
        if(hour == 0 || hour < 12){
            return configureTimeToUniversalString() + " AM";
        }
        return configureTimeToUniversalString() + " PM";
    }





}
