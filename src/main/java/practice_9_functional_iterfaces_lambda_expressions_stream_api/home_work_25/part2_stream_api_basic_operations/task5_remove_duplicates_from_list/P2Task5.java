package practice_9_functional_iterfaces_lambda_expressions_stream_api.home_work_25.part2_stream_api_basic_operations.task5_remove_duplicates_from_list;

import java.util.Arrays;
import java.util.List;

public class P2Task5 {
    static void main(String[] args) {
        List<Object> originList = Arrays.asList("AAA", 55, "BBB", "AAA", 55, 77.77,  88.88, "BBB");

        List<Object> uniqueElementsList = originList.stream()
                .distinct()
                .toList();

        System.out.println(uniqueElementsList);
    }
}
