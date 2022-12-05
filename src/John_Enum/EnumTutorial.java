package John_Enum;

import org.junit.jupiter.api.Ben_Billion_Notes;

public class EnumTutorial{
    @Ben_Billion_Notes("Enums cannot be instantiated")

    public static void main(String[] args) {

        DaysOfTheWeek day = DaysOfTheWeek.MONDAY;

        if(day.equals(DaysOfTheWeek.FRIDAY)){
            System.out.println("Hello! its almost weekend");
        }

        DaysOfTheWeek.values(); // This is an array of all the days of the week.

        for(DaysOfTheWeek myDay : DaysOfTheWeek.values()){      // For each element in Days of the week,
            System.out.println(myDay);                         // print out the element(myDay).
        }

//        DaysOfTheWeek.valueOf("MONDAY");


    }
}
