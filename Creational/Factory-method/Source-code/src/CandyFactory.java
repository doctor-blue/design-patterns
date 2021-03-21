public class CandyFactory {
    private CandyFactory(){}

    public static Candy getCandy(CandyType candyType){
        switch (candyType){
            case MINTY_CANDY:
                return new MintyCandy();
            case HARD_CANDY:
                return  new HardCandy();
            default:
                throw  new IllegalArgumentException("This candy type is unsupported");
        }
    }
}
