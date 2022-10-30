package kr.co.programmersoop.example.section_02_02.a_previous_code;

public class PreviousCodeExampleMain {
    public static void main(String[] args) {
        CalculateCommand calculateCommand = new CalculateCommand(
                CalculateType.ADD,
                100,
                3
        );

        Client client = new Client();
        int result = client.someMethod(calculateCommand);

        System.out.println(result);
    }
}
