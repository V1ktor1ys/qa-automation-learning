package practice_9_functional_iterfaces_lambda_expressions_stream_api.home_work_25.part4_stream_api_grouping_and_reduction.task3_calculate_average_of_numbers;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class P4Task3 {
    static void main(String[] args) {
        List<Integer> originList = Arrays.asList(3, 5, 7, 10, 25, 16);

        OptionalDouble averageValue = originList.stream().mapToInt(n -> n).average();

        System.out.println(averageValue);
    }
}
