package _10_ObjectOrientedThinking;


public class WrapperClasses {
    public static void main(String[] args) {


        // The String class contain the compareTo method for comparing two strings.
        String password1 = "2300", password2 = "Phenomenally", password3 = "ZipDemon";


        // The numeric wrapper classes contain the compareTo method for comparing two numbers
        System.out.println(new Double(12.4).compareTo(new Double(12.3))); //returns 1;
        System.out.println(new Double(12.3).compareTo(new Double(12.3))); //returns 0;
        System.out.println(new Double(12.3).compareTo(new Double(12.51))); //returns -1;
    }
}
