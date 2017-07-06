package T10.ktJava.k3;

import java.util.ArrayList;

/**
 * Created by apple on 17/4/21.
 * 泛
 * 型
 */
public class Generices {

    //安卓的写法
    public abstract class View<P extends Presenter> {
        P presenter;
    }

    public abstract class Presenter<V extends View> {

        V view;
    }

    public static void main(String[] args) {

        ArrayList arrayList = new ArrayList();
        arrayList.add("hello");
        arrayList.add(0);
        for (Object o : arrayList) {
            System.out.println(o);
        }

    }
}
