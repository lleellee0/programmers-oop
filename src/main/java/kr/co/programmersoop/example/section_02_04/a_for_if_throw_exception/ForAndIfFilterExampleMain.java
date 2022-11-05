package kr.co.programmersoop.example.section_02_04.a_for_if_throw_exception;

import java.util.Arrays;
import java.util.List;

public class ForAndIfFilterExampleMain {
    public static void main(String[] args) {
        int[] integerArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        List<Integer> integerList = Arrays.stream(integerArray)
                .boxed()
                .toList();

        Integer findNumber = null;

        for (int i = 0; i < integerList.size(); i++) {
            if(integerList.get(i).equals(1234)) {
                findNumber = integerList.get(i);
                break;
            }
        }

        if(findNumber == null)
            throw new RuntimeException();

        System.out.println("findNumber=" + findNumber);
    }
}
