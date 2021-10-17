import java.util.Stack;

public class main {


    // scan through a string containing a piece of code and return the parentheses that don't match up aka a linter

    //

    public static boolean linter(String code) {


        Stack<String> stack = new Stack<>();


        // loop to add opening brackets values to stack

        for (int i = 0; i < code.length(); i++) {

            if (Character.toString(code.charAt(i)).matches("\\(|\\[|\\{")) {


//                stack.push(Character.toString(code.charAt(i)));
                stack.push(Character.toString(code.charAt(i)));
            }


        }


        for (int i = 0; i < code.length(); i++) {

            // parse through the code string

            if (Character.toString(code.charAt(i)).matches("\\)|\\]|\\}")) {


                if (stack.isEmpty()) {
                    System.out.println("Error type #2 " + code.charAt(i) + " at index in string " + i + " has no opening bracket");
                    break;
                } else if (stack.peek().contains("{") && Character.toString(code.charAt(i)).matches("}") || stack.peek().contains("(") && Character.toString(code.charAt(i)).matches("\\)") || stack.peek().contains("[") && Character.toString(code.charAt(i)).matches("]")) {

                    stack.pop();


                } else {

                    System.out.println("Error type #3 " + code.charAt(i) + " has no closing bracket at index " + i);
                    return true;


                }


            }


        }

        if (stack.size() == 0) {

            return false;

        } else {
            return true;
        }


    }


    public static void main(String[] args) {


        System.out.println(linter("(var x = {y:[1,2,3]})"));


    }


}