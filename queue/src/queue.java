import java.util.Arrays;

public class queue{

    private int [] array;
    private int firstToRemovePointer;
    private int lastAddedPointer;



    public queue(int size){

        this.array = new int[size];
        this.firstToRemovePointer = 0;
        this.lastAddedPointer = -1;

    }



    public void enqueue(int value){

        array[lastAddedPointer + 1] = value;

        lastAddedPointer++;





    }


    public int dequeue(){


        int returnFirstOut = firstToRemovePointer;

        firstToRemovePointer++;
        return returnFirstOut;

    }


    public int peek(){

        return array[firstToRemovePointer];

    }

    public int size(){

        return lastAddedPointer + 1;

    }



    public String toString(){

        System.out.println(lastAddedPointer);

        return Arrays.toString(array);

    }










}
