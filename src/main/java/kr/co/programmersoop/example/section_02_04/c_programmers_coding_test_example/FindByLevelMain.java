package kr.co.programmersoop.example.section_02_04.c_programmers_coding_test_example;

import java.util.ArrayList;
import java.util.List;

public class FindByLevelMain {
    public static void main(String[] args) {
        String idToFind = "programmers_user1";

        List<User> list = new ArrayList<>();

        list.add(new User("programmers_user1", "이준형"));
        list.add(new User("programmers_user2", "푸"));
        list.add(new User("programmers_user3", "foo"));

        list.stream()
                .filter(user -> user.sameId(idToFind))
                .findAny()
                .ifPresentOrElse(user -> {
                    throw new RuntimeException(idToFind + "는 이미 존재하는 아이디입니다.");
                }, () -> {
                    System.out.println(idToFind + "는 사용할 수 있는 아이디입니다.");
                });
    }
}
