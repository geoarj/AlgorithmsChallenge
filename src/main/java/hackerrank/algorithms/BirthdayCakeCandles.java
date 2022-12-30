package hackerrank.algorithms;

import java.io.*;
import java.util.Arrays;
import java.util.List;

/*
 * Candles = [4, 4, 1, 3]
 * The maximum height candles are 4 units high. There are 2 of them, so return 2.
 */
public class BirthdayCakeCandles {

    public static int birthdayCakeCandles(List<Integer> candles) {
        int counter = 0;
        int max = 0;

        for (int index = 0; index < candles.size(); index++) {
            if (max < candles.get(index)) {
                max = candles.get(index);
            }
        }
        for (int index = 0; index < candles.size(); index++) {
            if (max == candles.get(index)) {
                counter++;
            }
        }
        return counter;
    }
}


class Solution {
        public static void main(String[] args) throws IOException {

            final List<Integer> candles = Arrays.asList(1, 2, 4, 5, 6, 0, 6, 7, 6, 7, 7);

            int result = BirthdayCakeCandles.birthdayCakeCandles(candles);

            System.out.println(result);
        }
    }

