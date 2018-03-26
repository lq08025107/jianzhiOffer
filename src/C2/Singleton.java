package C2;

/**
 * 推荐最佳做法 内部类，实现延迟加载并且可以多线程
 */
public class Singleton {
    static class SingletonHolder{
        static Singleton instance = new Singleton();
    }

    public static Singleton getInstance(){
        return SingletonHolder.instance;
    }
}
