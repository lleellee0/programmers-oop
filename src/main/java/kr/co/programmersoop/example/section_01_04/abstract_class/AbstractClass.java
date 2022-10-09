package kr.co.programmersoop.example.section_01_04.abstract_class;

public abstract class AbstractClass {
    public void implementedMethod() {
        System.out.println("AbstractClass implementedMethod");
        this.abstractMethod();
    }

    abstract public void abstractMethod();
}
