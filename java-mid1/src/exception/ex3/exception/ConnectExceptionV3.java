package exception.ex3.exception;

public class ConnectExceptionV3 extends NetworkClientExceptionV3{
    // 연결 실패 시 발생하는 예외
    // 어느 서버에 연결에 실패했는지 서버의 주소를 관리
    private final String address;

    public ConnectExceptionV3(String address, String message) {
        super(message);
        this.address = address;
    }

    public String getAddress() {
        return address;
    }
}
