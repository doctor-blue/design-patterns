public class ThreadSafe {
    private static volatile ThreadSafe instance;

    private ThreadSafe(){}

    public static synchronized ThreadSafe getInstance(){
        if (instance == null){
            instance = new ThreadSafe();
        }
        return instance;
    }


}
