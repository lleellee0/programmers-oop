package kr.co.programmersoop.example.section_01_02.message_sender_with_interface;

public class Client {
    private MessageSender messageSender;

    Client(MessageSender messageSender) {
        this.messageSender = messageSender;
    }

    public void someMethod() {
        // 메시지 보내기 전 실행되는 어떤 작업

        RealMessageSender messageSender = new RealMessageSender();
        messageSender.send();
    }
}
