package exception.ex1;


public class NetworkServiceV1_3 {

    public void sendMessage(String data) {
        // Error 발생했을 때 disconnect 실행하기
        // 복잡한 NetWorkClient 사용 로직을 처리합니다.
        String address = "http://example.com";
        NetworkClientV1 client = new NetworkClientV1(address);
        client.initError(data); // 에러 전달

        String connectResult = client.connect();
        // 결과가 성공이 아니다 -> Error
        // if(!connectResult.equals("success"))
        if (isError(connectResult)) {
            System.out.println("[네트워크 오류 발생] 오류 코드 : " + connectResult);
        } else {
            String sendResult = client.send(data);
            if (isError(sendResult)) {
                System.out.println("[네트워크 오류 발생] 오류 코드 : " + connectResult);
            }
        }

        client.disconnect();
    }

    // 오류인지 확인
    private static boolean isError(String connectResult) {
        return !connectResult.equals("success");
    }
}
