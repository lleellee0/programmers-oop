package kr.co.programmersoop.example.section_06_03;

public class ProxyPatternMain {
    public static void main(String[] args) {
        Proxy proxy = new Proxy();
        Client client = new Client(proxy);

        client.someClientMethod();
    }
}
