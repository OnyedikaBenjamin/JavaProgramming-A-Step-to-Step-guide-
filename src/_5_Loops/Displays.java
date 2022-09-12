package _5_Loops;

public class Displays {

    public static void main(String[] args) {

        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
//----------------------------------------------------------------------------------------------------------------------

        for (int k = 7; k > 0; k--) {

            for (int l = 0; l < k; l++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();


    }
}
