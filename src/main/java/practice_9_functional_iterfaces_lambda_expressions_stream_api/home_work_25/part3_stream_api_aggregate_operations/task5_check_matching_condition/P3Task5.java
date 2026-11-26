package practice_9_functional_iterfaces_lambda_expressions_stream_api.home_work_25.part3_stream_api_aggregate_operations.task5_check_matching_condition;

import java.util.Arrays;
import java.util.List;

public class P3Task5 {
    static void main(String[] args) {
        List<Object> originList = Arrays.asList("AAA", 55, "BBB", 22, "AAA", 55, 77.77,  88.88, "BBB", 100);

        boolean isAnyElementMatchedCondition = originList.stream()
                .anyMatch(n -> n instanceof Integer && (Integer) n % 2 == 0);

        System.out.println(isAnyElementMatchedCondition);
    }
}
