package practice_9_functional_iterfaces_lambda_expressions_stream_api.lambda_expression;

public class Main {
    static void main(String[] args) {
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello World!");
            }
        };
        r1.run();

        Runnable r2 = () -> System.out.println("Hello World!");
        r2.run();

    }
}
