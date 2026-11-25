package practice_9_functional_iterfaces_lambda_expressions_stream_api.home_work_25.part3_stream_api_aggregate_operations.task3_calculate_sum_of_all_elements;

import java.util.Arrays;
import java.util.List;

public class P3Task3 {
    static void main(String[] args) {
        List<Integer> originList = Arrays.asList(3, 5, 7, 10, 25);

        int sumOfAllNumbers = originList.stream().mapToInt(n -> n).sum(); // (Integer::intValue)

        System.out.println(sumOfAllNumbers);
    }
}
