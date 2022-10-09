package kr.co.programmersoop.example.section_01_03.extend;

public class Child extends Parent {
    public void anotherMethod() {
        System.out.println("Child anotherMethod");

        this.parentProtectedInt = 0;
        this.parentPublicInt = 0;
//        this.parentPrivateInt = 0;    // 상속 되지 않았기 때문에 불가능!
    }
}
