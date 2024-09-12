package generic.ex5;

public class EraserBox<T> {

    // 타입 이레이저로 인해 컴파일 오류 발생
    // 런타임에 모두 Object가 되어버린다.
    public boolean instanceCheck(Object param){
        // return param instanceof  T; // 오류
        return false;
    }

    public void create(){
        // new T(); // 오류

    }
}
