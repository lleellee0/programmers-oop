package kr.co.programmersoop.example.section_01_05.basic_enum;

public class BasicEnumExampleMain {
    public static void main(String[] args) {
        CalculateCommand calculateCommand = new CalculateCommand(
                CalculateType.ADD,
                100,
                3
        );  // 보통 클라이언트가 요청할 때 보내준 데이터를 사용

        Client client = new Client();
        int result = client.someMethod(calculateCommand);

        System.out.println(result);
    }
}
