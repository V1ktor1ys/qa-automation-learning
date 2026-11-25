package practice_9_functional_iterfaces_lambda_expressions_stream_api.home_work_25.part1_functional_interfaces_lambda_expressions.task5_lambad_expression_with_consumer;

import java.util.function.Consumer;

public class P1Task5 {
    static void main(String[] args) {
        Consumer<String> printString = System.out::println;

        printString.accept("AAA");
        printString.accept("BBB");
        printString.accept("CCC");
    }
}
