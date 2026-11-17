package practice_8_isklucenia_i_dzeneriki.home_work_23.Generics.Task3_Generic_Class_with_Two_Parameters;

public class Pair<T, U> {
    private T objectOne;
    private U objectTwo;

    public T getObjectOne() {
        return objectOne;
    }

    public void setObjectOne(T objectOne) {
        this.objectOne = objectOne;
    }

    public U getObjectTwo() {
        return objectTwo;
    }

    public void setObjectTwo(U objectTwo) {
        this.objectTwo = objectTwo;
    }

    @Override
    public String toString() {
        return "objectOne: " + objectOne + ", objectTwo: " + objectTwo;
    }
}
