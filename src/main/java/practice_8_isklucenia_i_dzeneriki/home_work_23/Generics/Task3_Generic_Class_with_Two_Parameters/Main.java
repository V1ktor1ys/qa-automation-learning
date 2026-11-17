package practice_8_isklucenia_i_dzeneriki.home_work_23.Generics.Task3_Generic_Class_with_Two_Parameters;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    static void main(String[] args) {
        Pair<String, Integer> pair1 = new Pair<>();
        pair1.setObjectOne("aaa");
        System.out.println(pair1.getObjectOne());
        pair1.setObjectTwo(2026);
        System.out.println(pair1.getObjectTwo());

        System.out.println("----------------------");

        Pair<ArrayList, Double> pair2 = new Pair<>();
        pair2.setObjectOne(new ArrayList(Arrays.asList("aaa", "bbb", "ccc")));
        System.out.println(pair2.getObjectOne());
        pair2.setObjectTwo(1.0);
        System.out.println(pair2.getObjectTwo());
    }
}
