package Kunal.Generics;

import org.junit.jupiter.api.Ben_Billion_Notes;

import java.util.ArrayList;
@Ben_Billion_Notes("This program specifies how our ArrayList of a specific data type works internally")
public class CustomArrayList {
    private static int DEFAULT_CAPACITY = 5;  // This marks how many items our ArrayList can entail.
    private int[] myArrayList;              // An array list of type int.
    private int size =0;   // This denotes the number of elements currently present in the array list
    public CustomArrayList(){
        this.myArrayList = new int[DEFAULT_CAPACITY];
    }

    public static void main(String[] args) {

        CustomArrayList list = new CustomArrayList();
        list.add(5);
        list.add(7);
        list.add(9);
        list.add(3);
        list.add(6);

        list.printArray();
        list.set(45, 2);
        list.printArray();
        list.add(89);
       list.printArray();
        System.out.printf("%s%d","The array size is ", list.getArraySize());
        System.out.println("");
        list.remove();
        list.printArray();
        list.add(4);
        list.printArray();

    }

   public void add(int value){
            if(isFull()){
                resize();
            }
            myArrayList[size] = value;
       size++;
    }
    private boolean isFull() {
        return size == myArrayList.length;
    }
    private void resize() {
        int[]temp = new int[myArrayList.length * 2];
        for(int i =0; i < myArrayList.length; i ++){
            temp[i] = myArrayList[i];
        }
       myArrayList = temp;
    }

    public void set(int value, int index){
        myArrayList[index] = value;
    }

    public int remove(){
        int removed = myArrayList[size--];
        return removed;
    }

    public int getArraySize(){
        return size;
    }

    public void printArray(){
        for(int i =0; i < myArrayList.length; i++){
            System.out.print(myArrayList[i]+ " ");
        }
        System.out.println("");
    }

}
