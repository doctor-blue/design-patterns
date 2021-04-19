public class BusinessAnalyst implements Customer {
    private Developer developer;

    public BusinessAnalyst(Developer developer) {
        this.developer = developer;
    }

    @Override
    public void sendRequest(String request) {
        System.out.println("Reading request ...");
        System.out.println(request);
        String info = this.translate(request);
        System.out.println("Sending info ...");
        developer.receive(info);
    }

    private String translate(String request) {
        return "Create Zoom";
    }
}
