package _10_ObjectOrientedThinking;

public class IsDigit {

    public static void main(String[] args) {
        String str = "2o";
        System.out.println(isDigit(str));
    }
    public static boolean isDigit(String s) {
        return s.matches("[-+]?\\d*\\.?\\d+");
    }
}
