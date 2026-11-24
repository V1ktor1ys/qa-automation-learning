package practice_9_functional_iterfaces_lambda_expressions_stream_api.functional_interface;

public class MainMathOperations {
    static void main(String[] args) {
        MathOperations add = (a, b) -> a + b;
        MathOperations substract = (a, b) -> a - b;
        MathOperations multiply = (a, b) -> a * b;
        MathOperations divide = (a, b) -> a / b;

        System.out.println(add.apply(3, 5));
        System.out.println(substract.apply(5, 3));
        System.out.println(multiply.apply(3, 5));
        System.out.println(divide.apply(15, 3));
    }
}
