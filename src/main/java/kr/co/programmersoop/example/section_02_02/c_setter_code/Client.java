package kr.co.programmersoop.example.section_02_02.c_setter_code;

public class Client {
    public int someMethod(CalculateCommand calculateCommand) {
        int result = calculateCommand.getCalculateResult();

        return result;
    }
}
