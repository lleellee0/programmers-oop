package kr.co.programmersoop.example.section_02_04.c_programmers_coding_test_example;

public class User {
    private String id;
    private String name;

    public User(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public boolean sameId(String idToFind) {
        return this.id.equals(idToFind);
    }
}
