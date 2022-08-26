package Others;

public class CopyArray {

    public static int copyElementsOfArray(int[]arrayA){
        int[] arrayB = new int[arrayA.length];
        for (int i = 0; i < arrayA.length; i++) {
            arrayB[i] = arrayA[i];
        }
        return arrayB.length;
    }
    public static int[] printArray(int[]array){
        for (int i =0; i < array.length; i++) {
            System.out.print(array[i]);
        }
        return array;
    }
    public static void main(String[] args) {
        int[] array1 = {7,8,9,5,6};

        System.out.println(copyElementsOfArray(array1));

    }
}