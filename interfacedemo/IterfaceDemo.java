package interfacedemo;

public class IterfaceDemo {
    public static void main(String[] args) {
        MyClass a = new MyClass();
        a.someMethod();
        System.out.println("The value of the constant " + MyInterface.myInt);

        a.someDefaultMethod();
        MyInterface.someStaticMethod();

    }
}
