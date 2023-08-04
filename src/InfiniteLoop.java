// DummyObject class (replace with your actual object class)
class DummyObject {
    public void doSomething() {
        System.out.println("Performing some action...");
    }
}
public class InfiniteLoop {
    public static void main(String[] args) {
        DummyObject dummy = new DummyObject();

        // Infinite loop
        while (true) {
            // Perform some operation on the dummy object
            dummy.doSomething();

        }
    }
}
