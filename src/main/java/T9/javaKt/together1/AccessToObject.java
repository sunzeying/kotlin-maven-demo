package T9.javaKt.together1;

import JavaKt.together.Singleton;

/**
 * Created by apple on 17/4/21.
 * <p>
 * java与kotlin 共生1:java 访问 kotlin的单例
 */
public class AccessToObject {

    public static void main(String[] args) {

        Singleton.INSTANCE.printlnHello();
    }

}
