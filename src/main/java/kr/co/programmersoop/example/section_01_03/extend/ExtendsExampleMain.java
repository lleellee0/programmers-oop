package kr.co.programmersoop.example.section_01_03.extend;

public class ExtendsExampleMain {
    public static void main(String[] args) {
        Parent parent = new Parent();
        Parent parentTypeChild = new Child();     // 다형성
        Child child = new Child();

        parent.someMethod();
//        parentTypeChild.anotherMethod();    // Child 인스턴스지만, 타입이 Parent이기 때문에 호출이 불가능함.
        child.someMethod();                 // Parent에게 상속 받은 메서드
        child.anotherMethod();
    }
}
