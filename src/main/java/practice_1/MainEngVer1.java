package practice_1;

/**
 * - - - [1] - - -
 * First, we declare the class.
 * - We use the `public` access modifier, the `class` keyword, and the class name `practice_1.MainEngVer1` in PascalCase.
 * - If inheritance is needed, we specify `extends`. If interface implementation is needed, we specify `implements`.
 * - We can also add additional modifiers, such as `final` or `abstract`, if necessary.
 */
public class MainEngVer1 {

    /**
     * - - - [2] - - -
     * Next, we need to create the entry point of the program — the `main` method.
     * The signature of the `main` method consists of:
     * - the `public` access modifier
     * - the `static` keyword, which means that the method belongs to the class rather than to an object
     * - the `void` return type, which means that the method does not return a value
     * - the method name `main`
     * - the method parameter: a `String[]` parameter named `args`
     * - the method body `{ }`
     */
    public static void main(String[] args) {

        /**
         * - - - [3] - - -
         * Next, we declare a variable.
         * We specify the `int` type and the variable name `count`.
         */
        int count;

        /**
         * - - - [4] - - -
         * Next, we initialize the variable by assigning its first value.
         */
        count = 0;

        // Steps 3 and 4 can be done in one line by declaring the variable and initializing it to zero.
        int count2 = 0;

        /**
         * - - - [5] - - -
         * Next, we assign a new value to the variable `count`.
         * In other words, we update the variable's value.
         */
        count = 2;

        /**
         * - - - [7] - - -
         * To test the method from step 6, we need to call it from the `main` method.
         * We call `System.out.println` to print the result to the console.
         * We pass `4` as an argument to the `square` method.
         */
        System.out.println(square(4));
    }

    /**
     * - - - [6] - - -
     * Next, we create another method with the following signature:
     * - the `public` access modifier, which makes the method accessible from other classes
     * - the `static` keyword, which means that the method belongs to the class rather than to an object
     * - the return type, which is the primitive type `int`
     * - the method name `square`
     * - the parameter type `int` and the parameter name `x`
     * - the method body `{ }`
     * - inside the method body, we use the `return` keyword to return the value `x * x`
     */
    public static int square(int x) {
        return x * x;
    }
}
