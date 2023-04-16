package kr.co.programmersoop.example.section_04_04;

public class Child extends Parent {
    @Override
    public void someMethod(int input) {
        if(input <= 0)
            throw new RuntimeException("양수만 받을 수 있어요");

        System.out.println("Child 정상적으로 호출됨.");
    }
};