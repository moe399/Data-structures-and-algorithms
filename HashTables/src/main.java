import java.util.Arrays;
import java.util.HashMap;
import java.util.Hashtable;

public class main {


    public static String[] firstNonDuplicateValuequad(String string) {

        //brute force method


        // new return array
        String[] returnArray = new String[1];


        // split string into array
        String[] spliited = string.split("");


        for (int i = 0; i < spliited.length; i++) {

            int counter = 0;


            for (int j = 0; j < spliited.length; j++) {


                if (spliited[i].equals(spliited[j])) {
                    counter++;

                }

            }

            if (counter == 1) {

                returnArray[0] = spliited[i];
                break;
            }


        }


        return returnArray;


    }

    public static String[] firstNonDuplicateValueHash(String string) {


        //hash method


        // new return array
        String[] returnArray = new String[1];


        // split string into array
        String[] spliited = string.split("");


        HashMap<String, Integer> hash = new HashMap<>();

        //loop through hash, checking if the value exists

        for (int i = 0; i < spliited.length; i++) {


            if (!hash.containsKey(spliited[i])) {

                hash.put(spliited[i], 1);


            } else {

                hash.replace(spliited[i], hash.get(spliited[i]) + 1);


            }


        }


        for (int i = 0; i < spliited.length; i++) {


            if (hash.get(spliited[i]) == 1) {

                returnArray[0] = spliited[i];
                break;

            }


        }


        return returnArray;

    }


    public static void main(String[] args) {


        System.out.println(Arrays.toString(firstNonDuplicateValueHash("minimum")));

        System.out.println(Arrays.toString(firstNonDuplicateValuequad("minimum")));

    }
}