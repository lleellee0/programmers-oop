package kr.co.programmersoop.example.section_01_04.interface_;

public interface SomeInterface {
    void someMethod();

    default void defaultMethod() {
//        인터페이스에 메서드 정의 가능
        this.someMethod();
    }
}
