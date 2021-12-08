import java.lang.reflect.Array;

public class main {


    // Task: The following function finds the greatest single number within an array, but has an effeciency of O(N2).
    //Rewrite the following function so that it becomes O(N)

    public static int greatestNumber(int [] array){


        for(int i = 0; i < array.length; i++){


            //Assume for now that I is the greatest:
            boolean isIValTheGreatest = true;

            for(int j = 0; j < array.length; j++){

                //If we find another value that is greater tha i,
                // i is not that greatest:

                if(j > i){
                    isIValTheGreatest = false;





                }
            }


            if (isIValTheGreatest){

                return i;

            }






        }


        return 222;









    }



    public static int optimisedGreatestNumber(int [] array){


      int greatestNumber = 0;


        for(int i = 0; i < array.length; i++){


            if(greatestNumber < array[i]){


                greatestNumber = array[i];

            }









        }

        return greatestNumber;


    }
















    public static void main(String[] args) {



        int [] array = {3,2,5,1,15,6,4,7};


       optimisedGreatestNumber(array);


        System.out.println(optimisedGreatestNumber(array));


















    }

}
