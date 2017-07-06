package ktJava

/**
 * Created by apple on 17/4/21.
 * java 中 Volatile,synchronized 关键字 变成了注解
 */

@Volatile var count :Int =0;


//多线程调用,count统计不准确，要加锁 Synchronized
//Synchronized 在kotlin是一个注解,不是关键字
@Synchronized
fun  count(){
    count++
}

// 跟java一样
//synchronized变成了方法
fun  count1(){
    synchronized(count){
        count++
    }

}