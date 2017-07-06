/**
 * Created by apple on 17/4/20.
 *
 * 参数:a_b_c_d_e_f_g
 * 返回:a b c d e f g
 * 集合扁平化 flatMap
 * flatMap 是 map 的一个加强版，返回的仍然是开一个可迭代的集合
 */

// vararg 可变参数 跟一般的参数用起来差不多
// map foreach 的意思

fun main(vararg args: String) {

    args.flatMap {
        it.split("_")
    }.map {
        //字符串模版
        print("$it${it.length} ")
    }

    println();

    args.flatMap { it.split("_").map { print("$it "); } }


}