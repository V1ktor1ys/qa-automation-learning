package practice_9_functional_iterfaces_lambda_expressions_stream_api.home_work_25.part3_stream_api_aggregate_operations.task1_find_maximum_element;

import java.util.Arrays;
import java.util.List;

public class P3Task1 {
    static void main(String[] args) {
        List<Integer> originList = Arrays.asList(3, 5, 17, 25, 11, 8, 33);

        int largestNumber = originList.stream().max(Integer::compareTo).get();

        System.out.println(largestNumber);
    }
}
