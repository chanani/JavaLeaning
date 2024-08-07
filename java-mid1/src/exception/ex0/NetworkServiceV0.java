package exception.ex0;

public class NetworkServiceV0 {

    public void sendMessage(String data){
        // 복잡한 NetWorkClient 사용 로직을 처리합니다.
        String address = "http://example.com";
        NetworkClientV0 client = new NetworkClientV0(address);

        client.connect();
        client.send(data);
        client.disconnect();
    }
}
