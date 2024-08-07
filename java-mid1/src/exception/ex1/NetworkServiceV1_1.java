package exception.ex1;



public class NetworkServiceV1_1 {

    public void sendMessage(String data){
        // 복잡한 NetWorkClient 사용 로직을 처리합니다.
        String address = "http://example.com";
        NetworkClientV1 client = new NetworkClientV1(address);
        client.initError(data); // 에러 전달

        client.connect();
        client.send(data);
        client.disconnect();
    }
}
