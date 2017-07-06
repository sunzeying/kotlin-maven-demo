import java.io.File
import rx.Observable
import java.util.concurrent.Executors

/**
 * Created by apple on 17/4/20.
 *
 * 将input里的文字里的字符跟个数统计出来
 *
 * Kotlin 使用 RxJava
 * RxJava 是一个非常流行的 Java Reactive 框架，
 * 函数式的数据操作使得 Lambda 表达式可以充分体现自己的优势，
 * Java 冗长
 * RxJava
 *
 */
fun main(args: Array<String>) {
    //1 读取文字到内存
    //找到文本的路径
    val text = File(ClassLoader.getSystemResource("input").path).readText()


    // 2 文本里的所有字符 一个一个的事件就是一个一个的字符
//    Observable.from(text.toCharArray().asIterable()).map(::println).subscribe()


    // 3 文本里的所有非空字符
//    Observable.from(text.toCharArray().asIterable()).filter{!it.isWhitespace()}.map(::println).subscribe()


    // 4 返回的是 Observable ，分组后的事件
    // 统计相同的个数 groupBy 返回的一个一个的组（通过关键字来分组）
//    Observable.from(text.toCharArray().asIterable()).filter{!it.isWhitespace()}.groupBy{it}.subscribe()


    // 5 找出了分组后的字母的个数
//    Observable.from(text.toCharArray().asIterable()).filter{!it.isWhitespace()}.groupBy{it}.map {
//        it.count().subscribe{
//            println("$it")
//        }
//    }.subscribe()


    // 6 it 是 Lambda 表达式的默认的参数,可以修改
    // println(it.key)
    // 打出分组的key
    Observable.from(text.toCharArray().asIterable()).filter { !it.isWhitespace() }.groupBy { it }.map {
        o -> o.count().subscribe {
            println("${o.key}->$it")
        }
    }.subscribe()

//    println(text)


}