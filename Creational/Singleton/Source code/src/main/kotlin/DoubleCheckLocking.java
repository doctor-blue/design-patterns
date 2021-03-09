public class DoubleCheckLocking {
    private static volatile  DoubleCheckLocking instance;

    private DoubleCheckLocking(){}

    public static DoubleCheckLocking getInstance(){
        if (instance == null){
            synchronized (DoubleCheckLocking.class){
                if (instance == null){
                    instance = new DoubleCheckLocking();
                }
            }
        }
        return instance;
    }
}
