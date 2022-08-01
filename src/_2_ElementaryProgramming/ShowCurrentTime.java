// We can show current time by invoking the "System.currentTimeMIlls()".

package _2_ElementaryProgramming;

public class ShowCurrentTime {
    public static void main(String[] args) {
        long totalMilliSeconds = System.currentTimeMillis();


        long totalSeconds = totalMilliSeconds / 1000;
        long currentSecond = totalSeconds % 60;

        long totalMinutes = totalSeconds / 60;
        long currentMinute = totalMinutes % 60;

        long totalHour = totalMinutes / 60;
        long currentHour = totalHour % 24;

        System.out.println("The current time is " + currentHour + ":" + currentMinute + ":" + currentSecond + " GMT");

        // Since this above function only returns the Greenwich mean time, we can calculate for another zone
        // say West-African time, which is an hour ahead of the Greenwich mean time.
        // We do that by adding an hour to the currentHour.

        System.out.println("The current time is " + (currentHour + 1) + ":" + currentMinute + ":" + currentSecond + " West-Africa Time.");

}
}
