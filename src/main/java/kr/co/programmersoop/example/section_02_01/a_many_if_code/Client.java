package kr.co.programmersoop.example.section_02_01.a_many_if_code;

public class Client {
    public int someMethod(CalculateCommand calculateCommand) {
        CalculateType calculateType = calculateCommand.getCalculateType();
        int num1 = calculateCommand.getNum1();
        int num2 = calculateCommand.getNum2();

        int result = 0;

        if(calculateType != null && calculateType.equals(CalculateType.ADD)) {
            result = num1 + num2;
        } else if(calculateType != null && calculateType.equals(CalculateType.MINUS)) {
            result = num1 - num2;
        } else if(calculateType != null && calculateType.equals(CalculateType.MULTIPLY)) {
            result = num1 * num2;
        } else if(calculateType != null && calculateType.equals(CalculateType.DIVIDE)) {
            if(num2 == 0) {
                throw new RuntimeException("0으로 나눌 수 없습니다.");
            } else {
                result = num1 / num2;
            }
        }

        return result;
    }
}
