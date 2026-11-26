package practice_9_functional_iterfaces_lambda_expressions_stream_api.home_work_25.part2_stream_api_basic_operations.task4_create_list_of_squared_numbers;

import java.util.Arrays;
import java.util.List;

public class P2Task4 {
    static void main(String[] args) {
        List<Integer> originList = Arrays.asList(3, 5, 7, 10, 12, 15, 18, 20, 21, 24, 25);

        List<Integer> modifiedList = originList.stream()
                .map(n -> n * n)
                .toList();

        System.out.println(modifiedList);
    }
}
