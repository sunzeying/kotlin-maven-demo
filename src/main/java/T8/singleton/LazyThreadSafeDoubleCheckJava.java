package T8.singleton;

/**
 * Created by apple on 17/4/20.
 * java 1.5 后出现的 volatile 关键字
 */
public class LazyThreadSafeDoubleCheckJava {

    // 1  volatile 保证 实例化和赋值 是有序的;
    private static volatile LazyThreadSafeDoubleCheckJava INSTANCE;

    private LazyThreadSafeDoubleCheckJava() {
    }

    public static LazyThreadSafeDoubleCheckJava getInstance() {

        //判断==null,才加上锁
        if (INSTANCE == null) {
            synchronized (LazyThreadSafeDoubleCheckJava.class) {
                if (INSTANCE == null) {
                    // 2 初始化时分为实例化和赋值两步,尽管我们把这一步写成下面的语句
                    //但java虚拟机并不保证其他线程(眼中),这两步的顺序究竟是怎样的
                    INSTANCE = new LazyThreadSafeDoubleCheckJava();
                }
            }

        }
        return INSTANCE;
    }

}
