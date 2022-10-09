package kr.co.programmersoop.example.section_01_05.basic_enum;

public class Client {
    public int someMethod(CalculateCommand calculateCommand) {
        CalculateType calculateType = calculateCommand.getCalculateType();
        int num1 = calculateCommand.getNum1();
        int num2 = calculateCommand.getNum2();

        int result = 0;

        if(calculateType.equals(CalculateType.ADD)) {
            result = num1 + num2;
        } else if(calculateType.equals(CalculateType.MINUS)) {
            result = num1 - num2;
        } else if(calculateType.equals(CalculateType.MULTIPLY)) {
            result = num1 * num2;
        } else if(calculateType.equals(CalculateType.DIVIDE)) {
            result = num1 / num2;
        }

        return result;
    }
}
