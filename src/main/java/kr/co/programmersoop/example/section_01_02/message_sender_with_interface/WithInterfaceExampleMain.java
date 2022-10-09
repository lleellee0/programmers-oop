package kr.co.programmersoop.example.section_01_02.message_sender_with_interface;

public class WithInterfaceExampleMain {
    public static void main(String[] args) {
        MessageSender messageSender = new FakeMessageSender();
        Client client = new Client(messageSender);
        client.someMethod();
    }
}
