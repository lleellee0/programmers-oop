package kr.co.programmersoop.example.section_02_03.c_map;

import java.util.ArrayList;
import java.util.List;

public class ForMapExampleMain {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();

        integerList.add(10);
        integerList.add(20);
        integerList.add(30);
        integerList.add(40);
        integerList.add(50);
        integerList.add(60);
        integerList.add(70);

        List<Integer> x10IntegerList = new ArrayList<>();

        for (int i = 0; i < integerList.size(); i++) {
            x10IntegerList.add(integerList.get(i) * 10);
        }

        System.out.println(x10IntegerList);
    }
}
