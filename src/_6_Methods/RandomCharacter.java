  //  A random character between any two characters ch1 and ch2 with ch1 < ch2 can be
 //   generated as follows:
//    (char)(ch1 + Math.random() * (ch2 – ch1 + 1))

package _6_Methods;

public class RandomCharacter {
    /**
     * Generate a random character between ch1 and ch2
     */
    public static char getRandomCharacter(char ch1, char ch2) {
        return (char) (ch1 + Math.random() * (ch2 - ch1 + 1));
    }

    /**
     * Generate a random lowercase letter
     */
    public static char getRandomLowerCaseLetter() {
        return getRandomCharacter('a', 'z');
    }

    /**
     * Generate a random uppercase letter
     */
    public static char getRandomUpperCaseLetter() {
        return getRandomCharacter('A', 'Z');
    }

    /**
     * Generate a random digit character
     */
    public static char getRandomDigitCharacter() {
        return getRandomCharacter('0', '9');
    }

    /**
     * Generate a random character
     */
    public static char getRandomCharacter() {
        return getRandomCharacter('\u0000', '\uFFFF');
    }


    /*---------Here is our test class-----------*/

    public static void main(String[] args) {

        final int number_Of_Chars_Per_Row = 10;
        final int numberOfColumn = 5;


/**
 * Here we just formatted our display
 */
        for (int j = 0; j < numberOfColumn; j++) {
            System.out.println(getRandomLowerCaseLetter());

            for (int i = 0; i < number_Of_Chars_Per_Row; i++) {
                System.out.print(getRandomLowerCaseLetter());
            }
        }


    }
}