package practice_9_functional_iterfaces_lambda_expressions_stream_api.stream_api;

import java.util.Arrays;
import java.util.List;

public class SortedUniqueElements {
    // List with duplicates
    // Print unique sorted values
    static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 2, 3, 1, 4, 2, 5);

        List<Integer> uniqueSortedNumbers = numbers.stream()
                .distinct()
                .peek(n -> System.out.println("disctinct " + n))
                .sorted()
                .peek(n -> System.out.println("sorted " + n))
                .toList();

        System.out.println(uniqueSortedNumbers);
    }
}
