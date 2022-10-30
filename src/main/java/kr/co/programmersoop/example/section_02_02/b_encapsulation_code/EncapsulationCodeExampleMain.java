package kr.co.programmersoop.example.section_02_02.b_encapsulation_code;

public class EncapsulationCodeExampleMain {
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
