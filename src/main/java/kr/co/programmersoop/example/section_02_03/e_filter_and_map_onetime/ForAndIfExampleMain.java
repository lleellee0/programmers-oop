package kr.co.programmersoop.example.section_02_03.e_filter_and_map_onetime;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ForAndIfExampleMain {
    public static void main(String[] args) {
        int[] integerArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        List<Integer> integerList = Arrays.stream(integerArray)
                .boxed()
                .toList();

        System.out.println(integerList);

        List<Integer> evenX10NumberList = new ArrayList<>();

        for(int i = 0; i < integerList.size(); i++) {
            if(integerList.get(i) % 2 == 0) {
                evenX10NumberList.add(integerList.get(i) * 10);
            }
        }

        System.out.println(evenX10NumberList);
    }
}
