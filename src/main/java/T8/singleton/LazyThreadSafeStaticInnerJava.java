package T8.singleton;


/**
 * 静态内部类
 * 单例保证: 1 线程安全 2 懒加载
 * 同步锁:每次都要锁。浪费资源
 * doubleCheck 代码难看
 * 所以,有了更好的方式,静态内部类;
 * 将懒加载的过程交给了java虚拟机
 */
public class LazyThreadSafeStaticInnerJava {

    //静态内部类 将 INSTANCE 放入 静态内部类
    public static class Holder {
        private static LazyThreadSafeStaticInnerJava INSTANCE = new LazyThreadSafeStaticInnerJava();
    }

    private LazyThreadSafeStaticInnerJava() {
    }

    //通过 静态内部类 去加载 INSTANCE
    public static synchronized LazyThreadSafeStaticInnerJava getInstance() {
        return Holder.INSTANCE;
    }

}
