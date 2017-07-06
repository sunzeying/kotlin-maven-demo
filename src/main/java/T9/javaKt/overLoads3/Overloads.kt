package JavaKt.overLoads

/**
 * Created by apple on 17/4/21.
 * java与kotlin 共生3: java 访问Kotlin的方法默认参数
 */
class OverLoads {
    @JvmOverloads //相当于在java里看到多个OverLoads
    fun overLoads(a: Int, b: Int = 0, c: Int = 1) {

        println("$a ,$b,$c")

    }
}