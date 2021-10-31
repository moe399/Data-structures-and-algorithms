import java.util.ArrayList;
import java.util.Arrays;

public class main {



    static int sumArray(int [] array, int index, int total) {


        //base case

       if(index > array.length -1){

           return 0;

       }

       else {


           total = array[index] + sumArray(array, index + 1, total);

           return total;
       }


    }





    public static void main(String[] args) {


        int [] array = {4,2,3};




        System.out.println(  sumArray(array, 0, 0));




    }



}
