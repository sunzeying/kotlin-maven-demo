package JavaKt.person

/**
 * Created by apple on 17/4/21.
 *
 * @JvmField 标注成员,成员不能自己定义getter/setter, 也不能声明为private
 * java与kotlin 共生2:
 */

data class Person(var name: String,@JvmField var age: Int) {


}