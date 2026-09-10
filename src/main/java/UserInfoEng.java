/**
 * - - - [1] - - -
 *
 */
public class UserInfoEng {

    /**
     * - - - [13] - - -
     *
     */
    private static final String DEFAULT_NAME = "unknown";

    /**
     * - - - [2] - - -
     *
     */
    private String name;
    /**
     * - - - [3] - - -
     *
     */
    private int age;

    /**
     * - - - [4] - - -
     *
     */
    public void printInfo() {
        System.out.println("Имя: " + name);

        /**
         * - - - [5] - - -
         *
         */
        System.out.println("Возраст: " + age);
    }

    /**
     * - - - [8] - - -
     *
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * - - - [9] - - -
     *
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * - - - [6] - - -
     *
     */
    public static void main(String[] args) {

        /**
         * - - - [7] - - -
         *
         */
        UserInfoEng userInfoRus = new UserInfoEng();

        /**
         * - - - [10] - - -
         *
         */
        userInfoRus.setName("Олег");

        /**
         * - - - [11] - - -
         *
         */
        userInfoRus.setAge(21);

        /**
         * - - - [12] - - -
         *
         */
        userInfoRus.printInfo();
    }
}
