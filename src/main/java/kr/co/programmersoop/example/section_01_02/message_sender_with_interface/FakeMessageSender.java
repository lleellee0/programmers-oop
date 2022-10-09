package kr.co.programmersoop.example.section_01_02.message_sender_with_interface;

public class FakeMessageSender implements MessageSender {
    public void send() {
        // 메시지는 안보내고 메시지를 보냈다는 로그만 찍기
        System.out.println("FakeMessageSender, 실제로 메시지 전송되지 않음");
    }
}
