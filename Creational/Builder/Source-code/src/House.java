public class House {
    private int walls;
    private int doors;
    private boolean hasPool;
    private boolean hasRoof;
    private String color;

    @Override
    public String toString() {
        return "House{" +
                "walls=" + walls +
                ", doors=" + doors +
                ", hasPool=" + hasPool +
                ", hasRoof=" + hasRoof +
                ", color='" + color + '\'' +
                '}';
    }

    public House(int walls, int doors, boolean hasPool, boolean hasRoof, String color) {
        this.walls = walls;
        this.doors = doors;
        this.hasPool = hasPool;
        this.hasRoof = hasRoof;
        this.color = color;
    }

    public int getWalls() {
        return walls;
    }

    public int getDoors() {
        return doors;
    }

    public boolean isHasPool() {
        return hasPool;
    }

    public boolean isHasRoof() {
        return hasRoof;
    }

    public String getColor() {
        return color;
    }
}