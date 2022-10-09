package example.section_01_08.with_optional;

import java.util.ArrayList;
import java.util.List;

public class ListOptionalExampleMain {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        Integer filteredInteger = list.stream()
                .filter(value -> value.equals(100))
                .findFirst()
                .orElseThrow(() -> {
                    throw new RuntimeException("100에 해당하는 요소가 없습니다.");
                });

        System.out.println(filteredInteger);
    }
}
