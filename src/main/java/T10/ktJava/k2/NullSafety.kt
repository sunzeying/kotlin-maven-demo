package ktJava

import T10.ktJava.k2.NullSafety

/**
 * Created by apple on 17/4/21.
 * kotlin 的空安全的问题
 *
 *
 */

fun main(args: Array<String>) {
    val nullSafetyJava = NullSafety()
    //把getData直接变为属性了

//    val data: String = nullSafetyJava.data
//    println(data)

    val dataCanBeNull: String? = nullSafetyJava.data
    println(dataCanBeNull)
}