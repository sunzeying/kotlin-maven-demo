package T8.singleton;

/**
 * Created by apple on 17/4/20
 * .最简单的单例
 * 构造方法实例化，
 * 声明一个静态实例，
 * 获取静态实例，初始化实例
 */
public class PlainOldSingletonJava {
    private static PlainOldSingletonJava INSTANCE = new PlainOldSingletonJava();

    private PlainOldSingletonJava() {
        System.out.println(("PlainOldSingletonJava"));
    }

    public static PlainOldSingletonJava getInstance() {
        return INSTANCE;
    }

}
