package JavaKt.internalClass

/**
 * Created by apple on 17/4/21.
 *  java与kotlin 共生5: java 访问kotlin扩展方法
 */

fun String.notEmpty(): Boolean {
    return this != ""
}