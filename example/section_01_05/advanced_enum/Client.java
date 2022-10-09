package example.section_01_05.advanced_enum;

public class Client {
    public int someMethod(CalculateCommand calculateCommand) {
        CalculateType calculateType = calculateCommand.getFunctionalCalculateType();
        int num1 = calculateCommand.getNum1();
        int num2 = calculateCommand.getNum2();

        int result = calculateType.calculate(num1, num2);

        return result;
    }
}
