import java.util.Arrays;
import java.util.Stack;

public class main {


    public static void main(String[] args) {


        // custom stack implementation working for just integers, has following methods: peek, pop, push, isEmpty, isFull. can also specify a size
        // stack implementation using arrays

        stack customStack = new stack(10);


        customStack.push(4);
        customStack.push(2);
        customStack.push(1);
        customStack.push(7);
        System.out.println(customStack.pop());
        System.out.println(customStack.peek());
    }
}
