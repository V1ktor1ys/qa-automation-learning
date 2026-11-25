package practice_9_functional_iterfaces_lambda_expressions_stream_api.home_work_25.part1_functional_interfaces_lambda_expressions.task3_lambda_expression_with_predicate;

import java.util.function.Predicate;

public class P1Task3 {
    static void main(String[] args) {
        Predicate<Integer> isNumberEven = number -> number % 2 == 0;

        System.out.println(isNumberEven.test(3));
        System.out.println(isNumberEven.test(4));
        System.out.println(isNumberEven.test(7));
        System.out.println(isNumberEven.test(10));
    }
}
