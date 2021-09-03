import java.util.Arrays;

public class main {

    public static void main(String[] args) {


        int[] array = {2, 4, 7, 1, 17, 3, 5, 12, 11, 9, 8};

        optimisedBubbleSorting(array);


        System.out.println(Arrays.toString(array));

//        System.out.println(Arrays.toString(array));
//
//
//        boolean isSorted = false;
//
//        int counter = 0;
//
//
//        while (isSorted == false) {
//
//            isSorted = true;
//
//
//            for (int i = 0; i < array.length - 1; i++) {
//
//
//                if (array[i] > array[i + 1]) {
//
//                    int temp;
//
//                    temp = array[i];
//
//                    array[i] = array[i + 1];
//
//                    array[i + 1] = temp;
//
//
//                    isSorted = false;
//
//
//                }
//
//
//            }
//
//
//            counter++;
//
//
//        }
//
//
//        System.out.println(Arrays.toString(array) + " loop ran " + counter + " times");
//
//        // O(N) - linear time


    }





    public static int [] optimisedBubbleSorting(int [] unsortedArray) {



        boolean isSorted = false;

        int unsorted_until_index = unsortedArray.length-1;



        while(isSorted == false){


            isSorted = true;


            for(int i = 0; i < unsorted_until_index; i++){


                if(unsortedArray[i] > unsortedArray[i+1]){


                    swap(unsortedArray, i, i + 1);


                    isSorted = false;


                }








            }

            unsorted_until_index--;






        }


        return unsortedArray;







    }


    public static void swap(int [] array, int i, int j){



        int helper = array[i];

        array[i] = array[j];

        array[j] = helper;



    }






}