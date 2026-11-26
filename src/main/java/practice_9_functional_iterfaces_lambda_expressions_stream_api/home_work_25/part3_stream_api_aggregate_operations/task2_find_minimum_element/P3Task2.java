package practice_9_functional_iterfaces_lambda_expressions_stream_api.home_work_25.part3_stream_api_aggregate_operations.task2_find_minimum_element;

import java.util.Arrays;
import java.util.List;

public class P3Task2 {
    static void main(String[] args) {
        List<Integer> originList = Arrays.asList(3, 5, 17, 25, 11, 8, 1, 33);

        int lowestNumber = originList.stream().min(Integer::compareTo).get();

        System.out.println(lowestNumber);
    }
}
