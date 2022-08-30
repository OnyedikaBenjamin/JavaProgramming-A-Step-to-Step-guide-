package _5_Loops;

public class NestedForLoops {
    public static void main(String[] args) {


        int[] array = new int[5];

        for (int i = 0; i < array.length; i++) {

            for(int j =1; j < array.length - i; j++){
                System.out.print(array[j]);
            }
            System.out.println();
        }
        //------------------------------------------------------------------------------------
        for (int i = 0; i <= array.length; i++) {

            for (int j = 0; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println("");
        }
//---------------------------------------------------------------------------------------------------------------
        int[] arrayList =  {10, 2, 30, 41, 15};
        int max = arrayList[1];
        for (int i = 1; i < arrayList.length; i++) {
            if (arrayList[i] > arrayList[1])
                max = arrayList[i];
        }
        System.out.println(max);


    }
}
