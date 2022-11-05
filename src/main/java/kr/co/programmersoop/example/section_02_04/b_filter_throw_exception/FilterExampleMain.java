package kr.co.programmersoop.example.section_02_04.b_filter_throw_exception;

import java.util.Arrays;
import java.util.List;

public class FilterExampleMain {
    public static void main(String[] args) {
        int[] integerArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        List<Integer> integerList = Arrays.stream(integerArray)
                .boxed()
                .toList();

        Integer findNumber = integerList.stream()
                .filter(integer -> {
                    if(integer.equals(1234))
                        return true;
                    return false;
                })
                .findAny()
                .orElseThrow();

        System.out.println("findNumber=" + findNumber);
    }
}
