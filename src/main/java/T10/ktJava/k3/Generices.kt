package ktJava

import java.util.*

/**
 * Created by apple on 17/4/21.
 * jave 的范型是伪范型,在编译时,没有起作用
 * 编译前:c# List<String> 编译后:List<String>
 * 编译前:java List<String> 编译后:List
 */

//kotlin 无法写出这样的安卓的代码
//abstract class View<P : Presenter<out View<>>>{
//    protected  abstract val presenter:P
//}
//
//abstract class Presenter<V : View<out Presenter<>>>{
//    protected  abstract val view:V
//}



fun main(args: Array<String>) {
    //Any = object
    //不传参数，编译器直接报错
//    val list1 = ArrayList<>()
    val list = ArrayList<Any>()
    list.add("hello")
    list.add(0)
    list.map(::println)
}