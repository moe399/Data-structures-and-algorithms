import java.util.Arrays;
import java.util.Scanner;

public class main {


    public static void main(String[] args) {



        Scanner scanner = new Scanner(System.in);


        System.out.println("Pick a number from 30");
        System.out.println("The computer will try find it in as little as steps as possible");

        int numberSearch = Integer.valueOf(scanner.nextLine());




        int [] numberList = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30};


        int lowerBound = 0;

        int upperBound = numberList.length - 1;


        int stepsCounter = 0;



        while(lowerBound <= upperBound){


         stepsCounter++;



            int midpoint = (upperBound + lowerBound) / 2;


            int valueAtMidpoint = numberList[midpoint];


            if(valueAtMidpoint == numberSearch){

                System.out.println("Number was found in " + stepsCounter + " steps" );
                break;

            }


           else if(numberSearch > valueAtMidpoint){

                lowerBound = midpoint + 1;

            }

           else if (numberSearch < valueAtMidpoint){

               upperBound = midpoint - 1;

            }







        }






    }






}