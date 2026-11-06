package practice_7_lekcia_klass_obekta_i_ego_metody;

public class Person {

    // Fields, Constructor, toString(), getClass(), hashCode(), equals(), clone(), finalize()

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Person that = (Person) obj;
        return this.name.equals(that.name) && this.age == that.age;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        return result * 31 + age;
    }

    @Override
    protected Person clone() throws CloneNotSupportedException {
        return new Person(this.name, this.age);
    }
}
