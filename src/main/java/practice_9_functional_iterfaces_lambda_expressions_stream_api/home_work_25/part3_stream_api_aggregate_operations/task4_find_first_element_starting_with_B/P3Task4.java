package practice_9_functional_iterfaces_lambda_expressions_stream_api.home_work_25.part3_stream_api_aggregate_operations.task4_find_first_element_starting_with_B;

import java.util.Arrays;
import java.util.List;

public class P3Task4 {
    static void main(String[] args) {
        List<String> originList = Arrays.asList("AAA", "AA", "C", "BB", "BBB", "C");

        String firstStringStartedWithB = originList.stream()
                .filter(str -> str.startsWith("B"))
                .findFirst()
                .orElse("No matching element found");

        System.out.println(firstStringStartedWithB);
    }
}
