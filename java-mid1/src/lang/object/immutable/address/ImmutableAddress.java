package lang.object.immutable.address;

public class ImmutableAddress {
    private final String value; // 불변 객체의 중요한 내용은 final이 아님.

    public ImmutableAddress(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Address{" +
                "value='" + value + '\'' +
                '}';
    }
}
