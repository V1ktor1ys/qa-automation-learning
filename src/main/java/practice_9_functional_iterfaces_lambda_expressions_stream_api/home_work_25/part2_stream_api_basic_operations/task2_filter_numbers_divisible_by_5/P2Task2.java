package practice_9_functional_iterfaces_lambda_expressions_stream_api.home_work_25.part2_stream_api_basic_operations.task2_filter_numbers_divisible_by_5;

import java.util.Arrays;
import java.util.List;

public class P2Task2 {
    static void main(String[] args) {
        List<Integer> originList = Arrays.asList(3, 5, 7, 10, 12, 15, 18, 20, 21, 24, 25);

        List<Integer> filteredList = originList.stream()
                .filter(Integer -> Integer % 5 == 0)
                .toList();

        System.out.println(filteredList);
    }
}
