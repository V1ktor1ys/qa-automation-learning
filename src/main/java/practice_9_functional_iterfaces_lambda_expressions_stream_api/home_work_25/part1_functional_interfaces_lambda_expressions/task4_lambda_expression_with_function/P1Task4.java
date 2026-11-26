package practice_9_functional_iterfaces_lambda_expressions_stream_api.home_work_25.part1_functional_interfaces_lambda_expressions.task4_lambda_expression_with_function;

import java.util.function.Function;

public class P1Task4 {
    static void main(String[] args) {
        Function<String, Integer> stringLength = String::length;

        System.out.println(stringLength.apply("A"));
        System.out.println(stringLength.apply("AA"));
        System.out.println(stringLength.apply("AAA"));
        System.out.println(stringLength.apply("A A A"));
    }
}
