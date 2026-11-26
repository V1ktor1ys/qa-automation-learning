package practice_9_functional_iterfaces_lambda_expressions_stream_api.home_work_25.part1_functional_interfaces_lambda_expressions.task2_using_anonymous_class;

public class P1Task2 {
    static void main(String[] args) {
        Runnable anonymousClass = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello from anonymous class!");
            }
        };

    anonymousClass.run();
    }
}
