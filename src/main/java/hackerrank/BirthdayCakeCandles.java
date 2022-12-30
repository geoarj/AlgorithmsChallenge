package hackerrank;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class BirthdayCakeCandles {

    public static int birthdayCakeCandles(List<Integer> candles) {
        // Write your code here

        candles.forEach(candle -> System.out.println(candle));
        int counter = 0;



        return counter;
    }

    public static int birthdayCakeCandlesSolved(List<Integer> candles) {
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
//            BufferedReader bufferedReader =
//                    new BufferedReader(new InputStreamReader(System.in));
//            BufferedWriter bufferedWriter =
//                    new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//            int candlesCount = Integer.parseInt(bufferedReader.readLine().trim());
//
//            List<Integer> candles = Stream.of(bufferedReader.readLine()
//                            .replaceAll("\\s+$", "")
//                            .split(" "))
//                    .map(Integer::parseInt)
//                    .collect(toList());

            final List<Integer> candles = Arrays.asList(1, 2, 4, 5, 6, 0, 6, 7, 6);

            int result = BirthdayCakeCandles.birthdayCakeCandles(candles);

//            bufferedWriter.write(String.valueOf(result));
//            bufferedWriter.newLine();
//
//            bufferedReader.close();
//            bufferedWriter.close();
        }
    }

