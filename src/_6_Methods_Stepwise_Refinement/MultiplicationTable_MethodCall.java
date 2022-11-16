package _6_Methods_Stepwise_Refinement;

public class MultiplicationTable_MethodCall {

    public static void main(String[] args) {
        printTableStructure();
    }

    private static void printTableStructure() {
        System.out.println("              Multiplication Table");
        System.out.print("  ");
        for (int i = 1; i < 10; i++) {
            System.out.printf("%5d", i);
        }
        System.out.println("");
        System.out.println("------------------------------------------------");
        for (int j = 1; j <= 9; j++) {
            System.out.print(j + "|");

            computeMultiplication(j);

            System.out.println("");
        }
    }

    private static void computeMultiplication(int j) {
        for (int k = 1; k <= 9; k++) {
            System.out.printf("%5d", j * k);
        }
    }
}
