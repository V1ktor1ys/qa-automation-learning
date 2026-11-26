package practice_9_functional_iterfaces_lambda_expressions_stream_api.home_work_25.part4_stream_api_grouping_and_reduction.task1_group_string_by_their_first_letter;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class P4Task1 {
    static void main(String[] args) {
        List<String> originList = Arrays.asList("A", "BB", "B", "CCC", "AA", "BBB", "CC", "C", "AAA");

        Map<Character, List<String>> groupedByFirstLetterList = originList.stream()
                .collect(Collectors.groupingBy(str -> str.charAt(0)));

        System.out.println(groupedByFirstLetterList);
    }
}
