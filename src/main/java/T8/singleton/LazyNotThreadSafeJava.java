package T8.singleton;

/**
 * Created by apple on 17/4/20
 * 基本懒加载 解决一开始new一个实例会拖慢运行速度,所以,在 getInstance时再去new 这个实例
 */
public class LazyNotThreadSafeJava {
    private static LazyNotThreadSafeJava INSTANCE;

    private LazyNotThreadSafeJava() {
    }

    public static LazyNotThreadSafeJava getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new LazyNotThreadSafeJava();
        }
        return INSTANCE;
    }

}
