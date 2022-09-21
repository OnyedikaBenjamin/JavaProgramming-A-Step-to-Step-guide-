package _10_ObjectOrientedThinking;

public class StackOfIntegers {
    private int[] elements;
    private int size;
    private int defaultCapacity = 16;
    public StackOfIntegers (){
        this(16);
    }
    public StackOfIntegers(int size){
        this.size = size;
    }
    public boolean isEmpty(){
        this.size = 0;
        return true;
    }

    public int getSize(){
        return size;
    }
}

