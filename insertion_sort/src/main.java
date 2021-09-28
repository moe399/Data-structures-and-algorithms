import java.lang.reflect.Array;
import java.util.Arrays;

public class main {



    public static int [] insertionSort(int [] array){




        for(int i = 1; i < array.length; i++){


            int temp_val = i;

            int position = i - 1;


            while(position >= 0){


              if(array[position] > temp_val){


                  array[position + 1] = array[position];

                  position--;

              }

              else{
                  break;
              }



            }



            array[position + 1] = temp_val;




        }


        return array;





    }


    public static void main(String[] args) {




        int [] array = {5,4,3,1,2};






        System.out.println(Arrays.toString(insertionSort(array)));






    }


}
