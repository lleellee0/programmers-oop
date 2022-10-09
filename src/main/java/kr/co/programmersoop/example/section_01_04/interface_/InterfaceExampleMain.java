package kr.co.programmersoop.example.section_01_04.interface_;

public class InterfaceExampleMain {
    public static void main(String[] args) {
        SomeInterface someInterface = new ImplementsClass();
        AnotherInterface anotherInterface = new ImplementsClass();

        someInterface.someMethod();
        anotherInterface.anotherMethod();
        
//        아래 코드는 실행불가
//        someInterface.anotherMethod();
//        anotherInterface.someMethod();
    }
}
