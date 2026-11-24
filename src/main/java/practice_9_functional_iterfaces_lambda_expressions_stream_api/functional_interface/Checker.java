package practice_9_functional_iterfaces_lambda_expressions_stream_api.functional_interface;

@FunctionalInterface
public interface Checker {
    boolean check(int number);

    default void printIfValid(int number) {
        if (check(number)) System.out.println(number);
    }
}
