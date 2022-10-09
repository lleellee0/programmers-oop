package kr.co.programmersoop.example.section_01_07.to_string;

public class ToStringExampleMain {
    public static void main(String[] args) {
        SomeObject someObject1 = new SomeObject(1, "programmers");
        SomeObject someObject2 = new SomeObject(100, "foo");

        System.out.println(someObject1);
        System.out.println(someObject2);
    }
}
