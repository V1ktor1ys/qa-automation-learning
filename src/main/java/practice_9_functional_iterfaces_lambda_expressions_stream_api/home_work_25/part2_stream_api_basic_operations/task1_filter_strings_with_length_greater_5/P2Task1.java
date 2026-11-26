package practice_9_functional_iterfaces_lambda_expressions_stream_api.home_work_25.part2_stream_api_basic_operations.task1_filter_strings_with_length_greater_5;

import java.util.Arrays;
import java.util.List;

public class P2Task1 {
    static void main(String[] args) {
        List<String> originList = Arrays.asList("aaa", "bbbbbb", "c", "ddddd", "eeeeeee");

        List<String> filteredList = originList.stream()
                .filter(str -> str.length() > 5)
                .toList();

        System.out.println(filteredList);
    }
}
