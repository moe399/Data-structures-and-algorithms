import java.lang.reflect.Array;
import java.util.Arrays;

public class main {


    public static int[] selectionSort(int[] array) {


        int lowestValueIndex = 0;


        //this is talking about the index within the array not the actual number


        // need an outer loop to loop through all arrays


        // need an inner loop to check if the value is smaller than lowest value index

        // the inner loop starts with +1 from the i variable as that value is already sorted into the correct position, so we start from the value after hence +1;


        // if the lower value index isnt smaller than our outer loops(i), then we swap


        for (int i = 0; i < array.length - 1; i++) {


            lowestValueIndex = i;


            for (int j = i + 1; j < array.length; j++) {


                if (array[j] < array[lowestValueIndex]) {

                    lowestValueIndex = j;

                }


            }


            if (array[i] != array[lowestValueIndex]) {

                int helper = array[i];

                array[i] = array[lowestValueIndex];

                array[lowestValueIndex] = helper;


            }


        }


        return array;

    }


    public static void main(String[] args) {


        int[] unsortedArray = {9, 8, 7, 5, 1};


        System.out.println(Arrays.toString(selectionSort(unsortedArray)));


    }
}
