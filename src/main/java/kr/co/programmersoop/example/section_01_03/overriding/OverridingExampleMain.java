package kr.co.programmersoop.example.section_01_03.overriding;

public class OverridingExampleMain {
    public static void main(String[] args) {
        Parent parent = new Parent();
        Parent child = new Child();     // 다형성

        parent.someMethod();
        child.someMethod();
    }
}
