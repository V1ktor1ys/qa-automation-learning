package practice_8_isklucenia_i_dzeneriki.home_work_23.Generics.Task1_Generic_Class;

public class Main {
    static void main(String[] args) {
        Box<String> box1 = new Box();
        box1.setFieldExample("StringForFileOne");
        System.out.println(box1.getFieldExample());

        Box<Integer> box2 = new Box();
        box2.setFieldExample(2026);
        System.out.println(box2.getFieldExample());
    }
}
