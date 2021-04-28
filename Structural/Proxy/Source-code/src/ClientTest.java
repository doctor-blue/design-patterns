public class ClientTest {
    public static void main(String[] args) {
        ProxyImage proxyImage = new ProxyImage("https://abcd.com/dev.png");

        System.out.println("First time");
        proxyImage.load();
        System.out.println("Seconds time");
        proxyImage.load();
    }
}