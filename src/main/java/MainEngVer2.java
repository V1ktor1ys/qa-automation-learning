/**
 * - - - [1] - - -
 * First, we declare the class.
 */
public class MainEngVer2 {

    /**
     * - - - [2] - - -
     * Next, we create the entry point of the program — the `main` method.
     * It is public, static, returns void, and accepts a `String[]` parameter called `args`.
     */
    public static void main(String[] args) {

        /**
         * - - - [3] - - -
         * Now, let's declare an `int` variable called `count`.
         */
        int count;

        /**
         * - - - [4] - - -
         * Next, let's initialize it to zero.
         */
        count = 0;

        // We can also declare and initialize the variable in one line.
        int count2 = 0;

        /**
         * - - - [5] - - -
         * Now, let's assign a new value to `count`.
         */
        count = 2;

        /**
         * - - - [7] - - -
         * Finally, let's call the method from `main` and print the result to the console.
         * We pass `4` as an argument to the `square` method.
         */
        System.out.println(square(4));
    }

    /**
     * - - - [6] - - -
     * Next, let's create a method called `square`.
     * It is public and static, returns an `int`, and accepts an `int` parameter called `x`.
     * Inside the method, we return `x * x`.
     */
    public static int square(int x) {
        return x * x;
    }
}
