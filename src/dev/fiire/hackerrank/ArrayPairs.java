package dev.fiire.hackerrank;

import static java.util.stream.Collectors.toList;

import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

class Result {

    /*
     * Complete the 'solve' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static long solve(List<Integer> arr) {
        
        if (arr.isEmpty() || arr.size() == 1) {
            return 0;
        }
        
        if (arr.size() < 1 || arr.size() > 10*10*10*10*10) {
        	return -1;
        }
        
        long counter = 0;
        long max = Collections.max(arr);
        for (int i = 0; i < arr.size();i++){
            for (int j = i+1; j < arr.size();j++) {
                if (((arr.get(i)*arr.get(j)) <= max) && (i < j)) {
                    counter++;
                }
            }
        }
        return counter;
    }

}

public class ArrayPairs {
    public static void main(String[] args) throws IOException {
    	String sample1 = "1 1 1 2 4 2";

        int arrCount = 5;

        List<Integer> arr = Stream.of(sample1.replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        long result = Result.solve(arr);
        
        System.out.println(sample1);
        System.out.println(result);
    }
}

