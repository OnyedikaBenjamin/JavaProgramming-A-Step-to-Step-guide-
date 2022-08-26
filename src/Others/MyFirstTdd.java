package Others;

public class MyFirstTdd {

    public int add(int number1, int number2, int number3, int number4){
        return number1 + number2 + number3 + number4;
    }

    public int findTheMaximumNumberOf(int number1, int number2, int number3){
        return Math.max(number1, Math.max(number2, number3));
    }

    public int findTheMinimumNumberOf(int number1, int number2, int number3){
        return Math.min(number1, Math.min(number2, number3));
    }

}

