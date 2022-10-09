package kr.co.programmersoop.example.section_01_03.overloading;

public class OverloadingExampleMain {
    public static void main(String[] args) {
        AddCalculator addCalculator = new AddCalculator();

        int intResult = addCalculator.add(10, 20);
        long longResult = addCalculator.add(10L, 20L);
        double doubleResult = addCalculator.add(10.0, 20.0);

        System.out.println(intResult);
        System.out.println(longResult);
        System.out.println(doubleResult);
    }
}
