package C2;

/**
 * synchronized加锁同步，保证可以在多线程中使用
 */
public class Singleton2 {
    private Singleton2(){}
    private static Singleton2 instance = null;

    public static synchronized Singleton2 getInstance() {
        if(instance == null)
            instance = new Singleton2();
        return instance;
    }
}
