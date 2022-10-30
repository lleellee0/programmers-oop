package kr.co.programmersoop.example.section_02_02.c_setter_code;

public class CalculateCommand {
    private CalculateType calculateType;
    private int num1;
    private int num2;

    public void setCalculateType(CalculateType calculateType) {
        this.calculateType = calculateType;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int getCalculateResult() {
        CalculateType calculateType = this.calculateType;
        int num1 = this.num1;
        int num2 = this.num2;

        int result = calculateType.calculate(num1, num2);

        return result;
    }
}
