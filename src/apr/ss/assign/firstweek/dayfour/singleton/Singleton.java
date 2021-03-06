package apr.ss.assign.firstweek.dayfour.singleton;

public class Singleton {

    private static volatile Singleton instance;

    private Singleton(){}

    public static Singleton getInstance(){
        if (null == instance) {
            synchronized (Singleton.class) {
                if ( null == instance)
                instance = new Singleton();
            }
        }

        return instance;
    }
}
