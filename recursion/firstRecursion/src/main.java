public class main {


    public static int factorial(int i, int total) {


        if (i == 0) {

            return 1;
        } else {


            total = i * factorial(i - 1, total);

            return total;

        }


    }


    public static void main(String[] args) {





        System.out.println(factorial(5 ,0));



    }


}
