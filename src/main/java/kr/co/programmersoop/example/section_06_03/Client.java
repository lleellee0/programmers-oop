package kr.co.programmersoop.example.section_06_03;

public class Client {
    private final SomeInterface someInterface;

    public Client(SomeInterface someInterface) {
        this.someInterface = someInterface;
    }

    public void someClientMethod() {
        someInterface.someMethod();
    }
}
