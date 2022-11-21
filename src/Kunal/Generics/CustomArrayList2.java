package Kunal.Generics;

import org.junit.jupiter.api.Ben_Billion_Notes;

@Ben_Billion_Notes("This program specifies how our ArrayList of a specific data type works internally" +
        "           We are to declare our arrayList as an object type since every class inherits from the object class" +
        "           You might want check the internal implementation fo an ArrayList")

public class CustomArrayList2<T> {              // The T represents our type parameter
    private static int DEFAULT_CAPACITY = 5;   // Our List can only entail 5 objects.
    private Object[] myArrayList;             //  To be more Generic, We use the Object type to accept data of any type.
    private int size =0;                     // This denotes the number of elements currently present in the list.

    public CustomArrayList2(){
        this.myArrayList = new Object[DEFAULT_CAPACITY];
    }

    public static void main(String[] args) {
        CustomArrayList2 list = new CustomArrayList2();
        list.add(5); list.add(5); list.add(9); list.add(3); list.add(6);
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

   public void add(T value){
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
        Object[]temp = new Object[myArrayList.length * 2];
        for(int i =0; i < myArrayList.length; i ++){
            temp[i] = myArrayList[i];
        }
       myArrayList = temp;
    }

    public void set(T value, int index){
        myArrayList[index] = value;
    }

    public T remove(){
        T removed = (T)(myArrayList[size--]);
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