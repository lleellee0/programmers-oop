package kr.co.programmersoop.example.section_02_02.c_setter_code;

public class SetterCodeExampleMain {
    public static void main(String[] args) {
        CalculateCommand calculateCommand = new CalculateCommand();

//        실수로 아래 코드를 누락한다면?
//        calculateCommand.setCalculateType(CalculateType.ADD);
        calculateCommand.setNum1(100);
        calculateCommand.setNum2(3);

        Client client = new Client();
        int result = client.someMethod(calculateCommand);

        System.out.println(result);
    }
}
