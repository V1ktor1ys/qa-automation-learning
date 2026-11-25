package practice_9_functional_iterfaces_lambda_expressions_stream_api.home_work_25.part4_stream_api_grouping_and_reduction.task2_group_numbers_by_parity;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class P4Task2 {
    static void main(String[] args) {
        List<Integer> originList = Arrays.asList(3, 5, 7, 10, 12, 15, 18, 20, 21, 24, 25);

        Map<String, List<Integer>> groupedByParityList = originList.stream()
                .collect(Collectors.groupingBy(n -> n % 2 == 0 ? "Even" : "Odd"));

        System.out.println(groupedByParityList);
    }
}
