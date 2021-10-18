import java.util.Arrays;
import java.util.Queue;

public class main {


    public static void main(String[] args) {


        queue customQueue = new queue(10);




        customQueue.enqueue(4);
        customQueue.enqueue(1);
        customQueue.enqueue(7);
        customQueue.enqueue(8);

        customQueue.dequeue();


        System.out.println(customQueue.peek());
        System.out.println(customQueue.size());





    }
}
