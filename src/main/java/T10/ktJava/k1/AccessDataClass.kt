package ktJava

import T10.ktJava.k1.DataClass


/**
 * Created by apple on 17/4/21.
 *  * kotlin 与java共生1:kotlin访问java的属性
 */

fun main(args: Array<String>) {
    val dataClass = DataClass()
    dataClass.id=11
    println(dataClass.id)
}