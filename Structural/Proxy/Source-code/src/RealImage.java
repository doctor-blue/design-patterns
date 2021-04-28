public class RealImage implements Image{
    private String url;

    @Override
    public void load() {
        System.out.println("Load from "+this.url);
    }

    public RealImage(String url) {
        this.url = url;
    }
}
