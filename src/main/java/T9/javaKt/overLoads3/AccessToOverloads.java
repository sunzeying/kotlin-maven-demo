package T9.javaKt.overLoads3;

import JavaKt.overLoads.OverLoads;

/**
 * Created by apple on 17/4/21.
 *
 * java与kotlin 共生3: java 访问Kotlin的方法默认参数
 */
public class AccessToOverloads {

    public static void main(String[] args) {
        OverLoads overLoads = new OverLoads();
        overLoads.overLoads(1, 2, 3);
        overLoads.overLoads(1, 3);
        overLoads.overLoads(1);

    }

}
