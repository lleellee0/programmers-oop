package kr.co.programmersoop.example.section_02_03.a_foreach;

import java.util.ArrayList;
import java.util.List;

public class ForIterationExampleMain {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();

        integerList.add(10);
        integerList.add(20);
        integerList.add(30);
        integerList.add(40);
        integerList.add(50);
        integerList.add(60);
        integerList.add(70);

        for (int i = 0; i < integerList.size(); i++) {
            System.out.println(integerList.get(i));
        }
    }
}
