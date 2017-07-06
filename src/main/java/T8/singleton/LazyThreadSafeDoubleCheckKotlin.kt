package singleton

import T8.singleton.LazyThreadSafeDoubleCheckJava

/**
 * Created by apple on 17/4/20.
 * 线程安全的懒加载方法
 */
class LazyThreadSafeDoubleCheckKotlin private constructor() {

    companion object {
        //  方法1 LazyThreadSafetyMode.SYNCHRONIZED 就是方法2的判断过程
        val instance by lazy(mode = LazyThreadSafetyMode.SYNCHRONIZED) {
            LazyThreadSafeDoubleCheckKotlin()
        }
        //  方法2
        private @Volatile var instance2: LazyThreadSafeDoubleCheckKotlin? = null

        fun get(): LazyThreadSafeDoubleCheckKotlin {
            //判断==null,才加上锁
            if (instance2 == null) {
                synchronized(this) {
                    if (instance2 == null) {
                        // 2 初始化时分为实例化和赋值两步,尽管我们把这一步写成下面的语句
                        //但java虚拟机并不保证其他线程(眼中),这两步的顺序究竟是怎样的
                        instance2 = LazyThreadSafeDoubleCheckKotlin()
                    }
                }

            }
            return instance2!!
        }
    }

}