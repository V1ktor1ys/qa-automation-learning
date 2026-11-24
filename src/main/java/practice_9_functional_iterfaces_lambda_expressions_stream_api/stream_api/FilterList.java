package practice_9_functional_iterfaces_lambda_expressions_stream_api.stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class FilterList {
    static void main(String[] args) {
        List<Integer> listOrigin = Arrays.asList(1, 2, 3, 5, 6, 7, 10, 13, 16);

        IntStream stream = listOrigin.stream()
                .filter(n -> {
                    System.out.println("filter: " + n);
                    return n % 2 == 0;
                })
                .mapToInt(n -> {
                    System.out.println("mapToInt: " + n);
                    return n;
                });

        System.out.println("Stream is created, but Terminal method hasn't been called");

        int sum = stream.sum();

        System.out.println(sum);
    }
}
