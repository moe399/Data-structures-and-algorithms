import java.util.Stack;

public class reverseString {


    public static String reverseString(String input){

        StringBuilder stringBuilder = new StringBuilder();

        String returnString = "";

        Stack<String> stack = new Stack<>();



        //index of String

        for(int i = 0; i < input.length(); i++){

            stack.push(Character.toString(input.charAt(i)));

        }

        System.out.println(stack.size());


       for(int i = 0; i < input.length(); i++){

          stringBuilder.insert(0, stack.pop());

       }


        System.out.println(stringBuilder);

       

        return stringBuilder.toString();


    }





      public static void main(String[] args) {

          System.out.println("hello world");




          reverseString("abcde");

    }





}
