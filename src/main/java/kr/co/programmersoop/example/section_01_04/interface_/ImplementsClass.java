package kr.co.programmersoop.example.section_01_04.interface_;

public class ImplementsClass implements SomeInterface, AnotherInterface {
    @Override
    public void someMethod() {
        System.out.println("ImplementsClass someMethod");
    }

    @Override
    public void anotherMethod() {
        System.out.println("ImplementsClass anotherMethod");
    }
}
