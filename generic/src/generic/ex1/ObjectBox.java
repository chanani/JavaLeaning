package generic.ex1;

// 타입의 안정성이 떨어짐
public class ObjectBox {

    private Object value;

    public void set(Object object){
        this.value = object;
    }

    public Object get() {
        return value;
    }
}
