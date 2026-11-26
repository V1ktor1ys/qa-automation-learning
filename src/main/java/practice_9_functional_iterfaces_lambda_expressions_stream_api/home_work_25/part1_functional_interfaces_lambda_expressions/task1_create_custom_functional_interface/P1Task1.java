package practice_9_functional_iterfaces_lambda_expressions_stream_api.home_work_25.part1_functional_interfaces_lambda_expressions.task1_create_custom_functional_interface;

public class P1Task1 {
    static void main(String[] args) {
        MathOperation add = (a, b) -> a + b;
        MathOperation substract = (a, b) -> a - b;
        MathOperation multiply = (a, b) -> a * b;
        MathOperation divide = (a, b) -> a / b;

        System.out.println(add.apply(3, 7));
        System.out.println(substract.apply(10, 7));
        System.out.println(multiply.apply(3, 5));
        System.out.println(divide.apply(15, 3));
    }
}
