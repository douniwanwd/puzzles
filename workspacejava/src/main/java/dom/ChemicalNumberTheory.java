package dom;



import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class ChemicalNumberTheory {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));

        // Reading data using readLine
//        System.out.println("please input 3-10 symbols of chemical elements from professor's list separated by spaces:");
        String input = reader.readLine();
//        if (input == null || input.length() == 0 || input.trim().length() == 0) {
//            System.out.println("input is blank, exit");
//            return;
//        }
        String[] inputArray = input.split(" "); // split by space
        if (inputArray.length < 3 || inputArray.length > 10) {
            System.out.println("please input following instructions~");
            return;
        }
        // Printing the read line
        System.out.println(findHighestAffinity(inputArray));
    }

    public static Integer findHighestAffinity(String[] inputs) {
        Integer result = 0;
        Map<String, Integer> affinityMap = affinity(inputs);
        for (int i = 0; i < inputs.length; i++) {
            if (i == inputs.length - 1) {
                // skip last one
                break;
            }
            for (int j = i + 1; j < inputs.length; j++) {
                BigInteger valueI = BigInteger.valueOf(affinityMap.get(inputs[i]));
                BigInteger valueJ = BigInteger.valueOf(affinityMap.get(inputs[j]));
                result = Math.max(result, Integer.parseInt(valueI.gcd(valueJ) + ""));
//                System.out.println("value 1 " + valueI + ", value2 " + valueJ + ",gcd " + Integer.parseInt(valueI.gcd(valueJ) + ""));
            }
        }
        return result;
    }

    private static Map<String, Integer> affinity(String[] inputs) {
        Map<String, Integer> result = new HashMap<>();
        List<String> dictionary = initDictionary(); // get init dictionary
        for (int i = 0; i < inputs.length; i++) {
            String symbol = inputs[i];
            if (symbol.length() == 1 && dictionary.contains(symbol)) {
                result.put(symbol, dictionary.indexOf(symbol)); // index equal to number face value
            } else if (symbol.length() == 2) {
                String first = symbol.substring(0,1);
                String second = symbol.substring(1,2);
                if (dictionary.contains(first) && dictionary.contains(second)) {
                    Integer base = dictionary.indexOf(second) == 0 ? 2 : (dictionary.indexOf(second) + 1);
                    Integer affinity = base * dictionary.indexOf(first) + dictionary.indexOf(second);
                    result.put(symbol, affinity);
                }
            }
        }
        return result;
    }

    private static List<String> initDictionary() {
        List<String> dictionary = new ArrayList<>();
        // 0-9
        for (int i = 0; i < 10; i++) {
            dictionary.add(i + "");
        }
        // A-Z
        for (int i = 0; i < 26; i++) {
            dictionary.add(String.valueOf((char) ('a' + i)).toUpperCase());
        }
        // a-z
        for (int i = 0; i < 26; i++) {
            dictionary.add(String.valueOf((char) ('a' + i)));
        }
//        System.out.println("dictionary is: " + Arrays.toString(dictionary.toArray()));
        return dictionary;
    }


}
