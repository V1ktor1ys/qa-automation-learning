package practice_9_functional_iterfaces_lambda_expressions_stream_api.home_work_25.part2_stream_api_basic_operations.task3_convert_strings_to_their_lengths;

import java.util.Arrays;
import java.util.List;

public class P2Task3 {
    static void main(String[] args) {
        List<String> originList = Arrays.asList("aaa", "bbbbbb", "c", "ddddd", "eeeeeee");

        List<Integer> convertedList = originList.stream()
                .map(String::length)
                .toList();

        System.out.println(convertedList);
    }
}
