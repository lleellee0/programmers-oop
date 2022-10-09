package kr.co.programmersoop.example.section_01_03.overloading;

public class AddCalculator {
    public int add(int num1, int num2) {
        return num1 + num2;
    }

//    return 타입만 다르게 오버라이딩은 불가능
//    public long add(int num1, int num2) {
//        return num1 + num2;
//    }

    public long add(long num1, long num2) {
        return num1 + num2;
    }

    public double add(double num1, double num2) {
        return num1 + num2;
    }

}
