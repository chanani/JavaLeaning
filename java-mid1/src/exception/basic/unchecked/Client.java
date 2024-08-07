package exception.basic.unchecked;

/**
 * UncheckedException은 throws를 명시해주지 않아도 됩니다.
 */
public class Client {
    public void call(){
        throw new MyUnCheckedException("ex");
    }
}
