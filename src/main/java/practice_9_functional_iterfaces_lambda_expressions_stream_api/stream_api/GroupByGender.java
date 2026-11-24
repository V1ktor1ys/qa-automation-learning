package practice_9_functional_iterfaces_lambda_expressions_stream_api.stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByGender {
    // List of strings with names and sex
    // Group by sex in Map<String>, List<String>
    //                       sex  -  list of names
    static void main(String[] args) {
        List<String> names = Arrays.asList("AAA:F", "BBB:M", "CCC:F", "DDD:M");

        Map<String, List<String>> groupByGender = names.stream()
                .collect(Collectors.groupingBy(name -> {
                    System.out.println("key before transformation: " + name);
                    System.out.println("key after transformation: " + name.split(":")[1]);
                    return name.split(":")[1];
                        },
                        Collectors.mapping(name -> {
                            System.out.println("value before transformation: " + name);
                            System.out.println("value after transformation: " + name.split(":")[0]);
                            return name.split(":")[0];
                        }, Collectors.toList())));

        System.out.println(groupByGender);
    }
}
