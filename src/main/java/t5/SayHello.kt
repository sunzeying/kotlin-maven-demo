import t5.SayHello

/**
 * Created by apple on 17/4/20.''、
 *
 * 枚举类型与When表达式
 * Kotlin 丢掉了 switch，却引进了 when，这二者看上去极其相似，不过后者却要强大得多。至于枚举嘛，还是 Java 枚举的老样子
 */

// kotlin 的 枚举
enum class Lang(val hello: String,val index:Int) {
    ENGLISH("Hello",1),
    CHINESE("你好",2),
    JAPANESE("こんにちは",3),
    KOREAN("안녕하세요",4);

    fun sayHello() {

    }

    //构造方法的方法体
    init {

    }


    // 伴生对象 跟 静态方法一一对应
    // 伴生对象 跟 类一一对应
    companion object {
        fun parse(name: String): Lang {
            return Lang.valueOf(name.toUpperCase())
        }
    }

    // 普通方法
    fun getName(index: Int): String? {
        for (c in SayHello.values()) {
            if (c.index == index) {
                return c.name
            }
        }
        return null
    }
}


fun main(args: Array<String>) {
    // if size 0,return else 解析
    if (args.size == 0) return
    var lang = Lang.parse(args[0])
    println(lang);
    lang.sayHello()
    lang.sayBye()
}

//扩展方法 定义方法:方法名+类名
//when 比switch简洁,强大,灵活
fun Lang.sayBye() {
    //由实例决定
    val bye = when (this) {
        Lang.ENGLISH -> "bye"
        Lang.CHINESE -> "再见"
        Lang.JAPANESE -> "さようなら。"
        Lang.KOREAN -> "안녕히 가세요."
    }
    println(bye);
}