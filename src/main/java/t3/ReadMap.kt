/**
 * Created by apple on 17/4/20.
 *
 *读取Map
 * it 就是iterator
 * Unit 是kotlin的空
 */


fun main(args: Array<String>): Unit {

    //遍历map 1，
    args.map {
        println(it);
    }
    //遍历map 2 代码简介很多
    args.map(::println)

    //for循环
    for (arg in args) {
        println(arg);
    }


}