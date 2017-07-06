package T9.javaKt.internalClass5;


import JavaKt.internalClass.ExensionMethodKt;

/**
 * Created by apple on 17/4/21.
 *  java与kotlin 共生5: java 访问kotlin扩展方法
 */
public class CallExtensionMethod {

    public static void main(String[] args) {

        System.out.println(ExensionMethodKt.notEmpty("Hello"));
    }
}
