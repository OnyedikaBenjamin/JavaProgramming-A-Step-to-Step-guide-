package _7_SingleDimensionalArrays;

public class SortingIntegerArray {


    public static void sort(int[]myList){

        for (int i = 1; i < myList.length; i++) {

            for (int j = i; j > 0; j--) {

                int temp;
                if (myList[j] < myList [j - 1]) {
                    temp = myList[j];
                    myList[j] = myList[j - 1];
                    myList[j - 1] = temp;
                }
            }
        }
        for (int j : myList) {
            System.out.println(j);
        }
    }

    public static void main (String [] args) {
        int [] myList = {45,12,85,32,89,39,69,44,42,1,6,8};
        sort(myList);


    }

}