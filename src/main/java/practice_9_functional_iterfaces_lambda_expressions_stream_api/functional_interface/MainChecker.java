package practice_9_functional_iterfaces_lambda_expressions_stream_api.functional_interface;

public class MainChecker {
    static void main(String[] args) {
        Checker isPositive = n -> n > 0;

        isPositive.printIfValid(5);
        isPositive.printIfValid(-5);
    }
}
