/*      The Chinese Zodiac is based on a twelve-year cycle, with each year represented by an animal—
        monkey, rooster, dog, pig, rat, ox, tiger, rabbit, dragon, snake, horse, or sheep in this roster
 0: monkey
 1: rooster
 2: dog
 3: pig
 4: rat
 5: ox
 6: tiger
 7: rabbit
 8: dragon
 9: snake
 10: horse
 11: sheep
        Note that year % 12 determines the Zodiac sign. 1900 is the year of the rat because 1900
        % 12 is 4.

 */
package _3_Selections;

import java.util.Scanner;

public class ChineseZodiac {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Enter the year i.e 2008 : ");
        int year = input.nextInt();

        int zodiacSign = year % 12;

        switch (zodiacSign) {
            case 0 -> System.out.println(year + " is the year of the Monkey");
            case 1 -> System.out.println(year + " is the year of the Rooster");
            case 2 -> System.out.println(year + " is the year of the Dog");
            case 3 -> System.out.println(year + " is the year of the Pig");
            case 4 -> System.out.println(year + " is the year of the Rat");
            case 5 -> System.out.println(year + " is the year of the Ox");
            case 6 -> System.out.println(year + " is the year of the Tiger");
            case 7 -> System.out.println(year + " is the year of the Rabbit");
            case 8 -> System.out.println(year + " is the year of the Dragon");
            case 9 -> System.out.println(year + " is the year of the Snake");
            case 10 -> System.out.println(year + " is the year of the Horse");
            case 11 -> System.out.println(year + " is the year of the Sheep");
        }
    }
}
