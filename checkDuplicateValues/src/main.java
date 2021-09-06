public class main {


    public static void main(String[] args) {


        System.out.println("hello worlda");


        int [] array = {3,4,5,8,3,1,3,7};

        int counter = 0;


        for(int i = 0; i < array.length; i++){

            for(int j = 0; j < array.length; j++){

                counter++;

                if(i != j && array[i] == array[j]){

                    System.out.println("duplicate found");

                }

            }

        }

        System.out.println(counter);


    }


}
