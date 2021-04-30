public class ClientTest {
    public static void main(String[] args) {
        DocumentInvoker invoker = new DocumentInvoker();

        invoker.write("Hello");
        invoker.write("World");
        invoker.undo();
        invoker.read();
        invoker.redo();
        invoker.read();

        invoker.undo();
        invoker.undo();
        invoker.undo();
        invoker.undo();
    }
}
