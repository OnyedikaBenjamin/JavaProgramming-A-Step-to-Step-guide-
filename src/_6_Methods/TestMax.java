package _6_Methods;

public class TestMax {

    public static void main(String[] args){

        int i =4;
        int j =6;
        int k = max(i, j);

        System.out.println("The max of " + i + " and " + k + " is " + k );
    }

    public static int max (int i, int j){         // This is a static method, it is positioned anywhere in the class
        if (i > j){
            return i;
        }
        else {
            return j;
        }
    }
}
