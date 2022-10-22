package kr.co.programmersoop.example.section_02_01.c_advanced_enum_code;

public class Client {
    public int someMethod(CalculateCommand calculateCommand) {
        CalculateType calculateType = calculateCommand.getCalculateType();
        int num1 = calculateCommand.getNum1();
        int num2 = calculateCommand.getNum2();

        if(calculateType == null) {
            return 0;
        }

        if(calculateType.equals(CalculateType.DIVIDE) && num2 == 0) {
            throw new RuntimeException("0으로 나눌 수 없습니다.");
        }

        int result = calculateType.calculate(num1, num2);

        return result;
    }
}
