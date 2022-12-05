package HumbleMe;

import java.util.Scanner;

public class Nokia {
    public static void main(String[] args) {
        System.out.println("NOKIA");
        System.out.println("  1.    Phone book" +
                "             2.    Messages" +
                "             3.    Chat" +
                "             4.    Call register" +
                "             5.    Tones" +
                "             6.    Settings" +
                "             7.    Call divert" +
                "             8.    Games" +
                "             9.    Calculator" +
                "             10.   Remainders" +
                "             11.   Clock" +
                "             12.   Profiles" +
                "             13.   SIM services");

        int action = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an action number i.e 1 for phonebook");
        action = input.nextInt();

        switch(action){
        case 1:
        System.out.println("Phone book" +
                    "           1.  Search" +
                    "           2.  Service Nos." +
                    "           3.  Add name" +
                    "           4.  Erase" +
                    "           5.  Edit" +
                    "           6.  Assign tone" +
                    "           7.  Send b' card" +
                    "           8.  Options" +
                    "           9.  Speed dials" +
                    "           10. Voice tags");
            System.out.println("Enter an action number");
            action = input.nextInt();
            switch (action){
                case 1 -> System.out.println("_");
                case 2 -> System.out.println("__");
                case 3 -> System.out.println("___");
                case 4 -> System.out.println("____");
                case 5 -> System.out.println("_____");
                case 6 -> System.out.println("-");
                case 7 -> System.out.println("--");
                case 8 -> System.out.println("1.    Type of view" +
                        "                     2.    Memory Status");
                case 9 -> System.out.println("---");
                case 10 -> System.out.println("----");
                default -> System.out.println("Please enter a valid action number");

            }
        case 2:
            System.out.println("Message" +
                    "               1.  Write messages" +
                    "               2.  Inbox" +
                    "               3.  Outbox" +
                    "               4.  Picture messages" +
                    "               5.  Templates" +
                    "               6.  Smileys" +
                    "               7.  Message settings" +
                    "               8.  Info service" +
                    "               9.  Voice mailbox number" +
                    "               10. Service command editor");
            System.out.println("Enter an action number");
            action = input.nextInt();
            switch (action){
                case 1 -> System.out.println("_");
                case 2 -> System.out.println("__");
                case 3 -> System.out.println("___");
                case 4 -> System.out.println("____");
                case 5 -> System.out.println("_____");
                case 6 -> System.out.println("-");
                case 7 -> System.out.println("--");
                case 8 -> {
                    System.out.println("1.    Set 1" +
                            "           2.    Common");
                    System.out.println("Enter an action number");
                    action = input.nextInt();
                    switch (action){
                        case 1 -> {
                            System.out.println("Set 1");
                            System.out.println("1.    Message centre number" +
                                    "           2.    Messages sent as" +
                                    "           3.    Message validity");
                        }
                        case 2 -> System.out.println("Common" +
                                "                     1.    Delivery reports" +
                                "                     2.    Reply via same centre" +
                                "                     3.    Character support");
                    }
                }
                case 9 -> System.out.println("---");
                case 10 -> System.out.println("----");
                default -> System.out.println("Please enter a valid action number");

            }
        case 3:
            System.out.println("Chat");
        case 4:
            System.out.println("Call register");
        case 5:
            System.out.println("Tones");
        case 6:
            System.out.println("Settings");
        case 7:
            System.out.println("Call divert");
        case 8:
            System.out.println("Games");
        case 9:
            System.out.println("Calculator");
        case 10:
            System.out.println("Remainders");
        case 11:
            System.out.println("Clock");
        case 12:
            System.out.println("Profile");
        case 13:
            System.out.println("Sim services");
        default :
            System.out.println("Please enter a valid action number");

    }
    }
}
