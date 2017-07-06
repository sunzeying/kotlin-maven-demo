package singleton

/**
 * 静态内部类
 * 单例保证: 1 线程安全 2 懒加载
 * 同步锁:每次都要锁。浪费资源
 * doubleCheck 代码难看
 * 所以,有了更好的方式,静态内部类;
 * 将懒加载的过程交给了java虚拟机
 */
class LazyThreadSafeStaticInnerKotlin {

    companion object {
        fun getInstance() = Holder.instance
    }


    private object Holder {
        val instance = LazyThreadSafeStaticInnerKotlin()
    }
}