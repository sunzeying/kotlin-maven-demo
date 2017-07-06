package singleton

/**
 * Created by apple on 17/4/20.
 * synchronized 同步锁 其实,我们只有第一次访问时才需要加锁,后面访问的就浪费掉了
 */
class LazyThreadSafeSynchronizedKotlin private constructor(){

    companion object {
        private var instance: LazyThreadSafeSynchronizedKotlin? = null

        @Synchronized
        fun get(): LazyThreadSafeSynchronizedKotlin {
            if (instance == null) instance = LazyThreadSafeSynchronizedKotlin()
            return instance!!
        }
    }

}