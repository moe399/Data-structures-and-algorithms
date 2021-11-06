import java.util.Arrays;

public class main {


    public static String reverse(String string) {



//base case
        // if any instance of the string ends up being less than or equal to one, return the value being called in the string, which has to be the value at the index == to the length of the string

        if(string.length() <= 1){



            return Character.toString(string.charAt(string.length() -1 ));

        }

//recursive call

        // each time this function is called, we call a specific region which basically gets rid of all other values unitl the last one, then uses whats returned from the recursive call and adds the first character of the string when it is being called, which ends up adding the letter after in front of it.
    return   reverse(string.substring(1, string.length())) + string.charAt(0);





    }


    public static void main(String[] args) {





        System.out.println(reverse("hello"));



    }
}