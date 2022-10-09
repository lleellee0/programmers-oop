package kr.co.programmersoop.example.section_01_04.abstract_class;

public class AbstractClassExampleMain {
    public static void main(String[] args) {
        AbstractClass abstractClass = new AbstractClass() {
            @Override
            public void abstractMethod() {
                // 이렇게 사용하려면 여기서 추상 메서드를 구현해야함
                System.out.println("AbstractClass abstractMethod");
            }
        };

        abstractClass.implementedMethod();
        abstractClass.abstractMethod();

        AbstractClass extendedClass = new ExtendedClass();
        extendedClass.implementedMethod();
        extendedClass.abstractMethod();
    }
}
