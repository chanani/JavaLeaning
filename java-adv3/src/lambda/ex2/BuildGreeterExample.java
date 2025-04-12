package lambda.ex2;

public class BuildGreeterExample {

    public static StringFunction buildGreeter(String greeting) {
        return name -> greeting + ", " + name;
    }

    public static void main(String[] args) {
        StringFunction helloGreeter = buildGreeter("Hello");
        StringFunction hiGreeter = buildGreeter("Hi");
        System.out.println("java = " + helloGreeter.apply("Java"));
        System.out.println("lambda = " + hiGreeter.apply("Lambda"));
    }
}
