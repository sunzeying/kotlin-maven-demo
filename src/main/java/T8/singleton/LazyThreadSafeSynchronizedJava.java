package T8.singleton;


public class LazyThreadSafeSynchronizedJava {
    private static LazyThreadSafeSynchronizedJava INSTANCE;

    private LazyThreadSafeSynchronizedJava() {
    }

    // synchronized 同步锁
    public static synchronized LazyThreadSafeSynchronizedJava getInstance() {
        //d此处单个线程new一个实例,多个线程同时访问INSTANCE ,会new出多个实例;那怎么能叫单例呢,我们需要加个锁
        if (INSTANCE == null) {
            INSTANCE = new LazyThreadSafeSynchronizedJava();
        }
        return INSTANCE;
    }

}
