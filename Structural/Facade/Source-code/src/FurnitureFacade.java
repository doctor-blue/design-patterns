public class FurnitureFacade {
    private static FurnitureFacade INSTANCE;
    private Furniture table;
    private Furniture chair;
    private Furniture tv;

    public FurnitureFacade() {
        this.table = new Table();
        this.chair = new Chair();
        this.tv = new Television();
    }

    public static FurnitureFacade getInstance(){
        if (INSTANCE == null)
            INSTANCE = new FurnitureFacade();
        return INSTANCE;
    }

    public void makeTableAndChair(){
        table.make();
        chair.make();
    }
    public void makeTVAndChair(){
        tv.make();
        chair.make();
    }

}
