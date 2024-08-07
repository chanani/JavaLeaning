package exception.basic.checked;

public class Client {
    // throws 여기서 처리 못해서 던지는 키워드
    public void call() throws MyCheckedException {

        // 문제 상황
        throw new MyCheckedException("ex");
    }
}
