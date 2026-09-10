/**
 * - - - [1] - - -
 * First, we declare the class that contains: public as an access modifier, key word class, class name 'MainEng' in PascalCase format.
 * - (optional) If we need inheritance, we specify `extends`, if interface implementation is needed, specify `implements`;
 * also include any additional modifiers, such as `final` or `abstract`, if necessary.
 */
public class MainEng {

    /**
     * - - - [2] - - -
     * It is necessary to create an empty point for the program, specifically the 'main' method
     * Signature for method 'main':
     * - `public` access modifier
     * - `static` which tells us that 'main' belongs to the class, rather than an object
     * - `void` return type (i.e. it returns nothing)
     * - 'main' method name
     * - method parameters (parameters always begin with the type (array of strings `String[]`) and parameter name 'args')
     * - method body { }
     */
    public static void main(String[] args) {

        /**
         * - - - [3] - - -
         * Next we declare a variable (declare `int` type and 'count' variable name)
         */
        int count;

        /**
         * - - - [4] - - -
         * Next we initialize the variable (assign the first value)
         */
        count = 0;

        // Step 3 and 4 could be done in one line, to do this, declare a variable and initialize it to zero value
        int count2 = 0;

        /**
         * - - - [5] - - -
         * Next we assign a new value to the variable 'count' | update the variable's value
         */
        count = 2;

        /**
         * - - - [7] - - -
         * To check the method from p.6 we need to call him in the 'main' method
         * Call the special method `System.out.println` for printing the result in console using a specific parameter
         * value 4 (4 as argument)
         */
        System.out.println(square(4));
    }

    /**
     * - - - [6] - - -
     * Next, let's create another new method with the following signature:
     * - access modifier `public` – accessible to everyone,
     * - if we want that the method belongs to the class, not the object - we specify the keyword `static`
     * - next, specify the return data type - the primitive type `int`
     * - then specify the method name – `square`
     * - specify the parameter type `int` and the parameter name 'x'
     * - after the signature, create the method body { }
     * - inside the method body, use the `return` keyword to return the value `x * x`.
     */
    public static int square(int x) {
        return x * x;
    }

}
