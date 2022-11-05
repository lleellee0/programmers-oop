package kr.co.programmersoop.example.section_02_03.b_filter;

import java.util.ArrayList;
import java.util.List;

public class ForAndIfFilterExampleMain {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();

        integerList.add(10);
        integerList.add(20);
        integerList.add(30);
        integerList.add(40);
        integerList.add(50);
        integerList.add(60);
        integerList.add(70);

        Integer findNumber = null;

        for (int i = 0; i < integerList.size() - 1; i++) {
            System.out.println(integerList.get(i));

            if(integerList.get(i).equals(40)) {
                findNumber = integerList.get(i);
                break;
            }
        }

        System.out.println("findNumber=" + findNumber);
    }
}
