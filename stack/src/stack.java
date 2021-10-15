import java.util.Arrays;
import java.util.Stack;

public class stack {


    // is empty
    // is full
    // pop
    // push
    // peek


    int size;

    int top;

    int[] array;


    public stack(int size) {


        this.size = size;

        this.top = -1;

        this.array = new int[size];

    }


    public boolean isEmpty() {
//
        if (top == -1) {
            return true;
        } else ;
        return false;



    }


    public boolean isFull() {

        if (top == size - 1)  {
            return true;
        } else {

            return false;
        }

    }


    // only push in item at the start of array and then change the counter to the item above but first check if it is full
    public void push(int value) {


        if (isFull() == true) {

            System.out.println("Stack is full, cannot push");

        } else {

            this.array[top + 1] = value;
            top++;


        }


    }


    // take off the item at the top of stack and return it, make sure stack isn't empty first
    public int pop() {


        if (isEmpty() == true) {


            System.out.println("Stack is empty, nothing to pop");
            return -1;

        } else {

            int toDecrementAfterReturn = top;
            top--;
            return this.array[toDecrementAfterReturn];
        }


    }


    public int peek(){


        if(isEmpty() == true){

            System.out.println("Stack is empty, nothing to peek");
            return -1;
        }


        else{




            System.out.println(this.array[top]);
            return this.array[top];


        }


    }


}