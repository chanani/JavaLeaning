package exception.ex2;

public class NetworkServiceV2_1 {

    public void sendMessage(String data) throws NetworkClientExceptionV2 {
        // 복잡한 NetWorkClient 사용 로직을 처리합니다.
        String address = "http://example.com";
        NetworkClientV2 client = new NetworkClientV2(address);
        client.initError(data); // 에러 전달

        client.connect();
        client.send(data);
        client.disconnect();
    }
}
