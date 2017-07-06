package singleton

import T8.singleton.LazyNotThreadSafeJava


/**
 * Created by apple on 17/4/20
 * 基本懒加载 解决一开始new一个实例会拖慢运行速度,所以,在 getInstance时再去new 这个实例
 */
class LazyNotThreadSafeKotlin {

    companion object {
        // Kotlin 写法
        //方法1 : 说明初始化的时候不是同步的,
        //LazyThreadSafetyMode.NONE 初始化时不是线程安全的
        val instance by lazy(LazyThreadSafetyMode.NONE) {
            LazyNotThreadSafeKotlin()
        }


        //方法2 :与上面是等价的写法,获取单例使用get方法；java代码的直译
        private var instance2: LazyNotThreadSafeKotlin? = null

        fun get(): LazyNotThreadSafeKotlin {
            if (instance2 == null) {
                instance2 = LazyNotThreadSafeKotlin()
            }
            return instance2!!
        }
    }

}