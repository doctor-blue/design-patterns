public interface Builder {
    Builder buildRoof(boolean hasRoof);
    Builder buildWalls(int walls);
    Builder buildPool(boolean hasPool);
    Builder buildDoors(int doors);
    Builder withColor(String color);
    House build();

}
