import java.math.BigInteger

/**
 * Created by apple on 17/4/20.
 * 使用尾递归来优化:是通过迭代的形式来优化
 */


//1 求一个int类型的阶乘
//求5的阶乘=1*2*3*4*5
fun factorial(num: Int): BigInteger {
    if (num == 0) return BigInteger.valueOf(1L)
    return BigInteger.valueOf(num.toLong()).times(factorial(num - 1))

}

// tailrec 加上关键字在执行以后还要执行 times方法，此时会报错
//那么就先将返回修改下，采用参数的方式
//tailrec fun factorial(num: Int): BigInteger {
//    if (num == 0) return BigInteger.valueOf(1L)
//    return BigInteger.valueOf(num.toLong()).times(factorial(num - 1))
//
//}


class Result(var value: BigInteger = BigInteger.valueOf(1L))


// tailrec 尾递归关键字
//使用尾递归来优化:是通过迭代的形式来优化
tailrec fun factorialTailrec(num: Int, result: Result) {
    if (num == 0) result.value = result.value.times(BigInteger.valueOf(1L))
    else {
        result.value = result.value.times(BigInteger.valueOf(num.toLong()))
        factorialTailrec(num - 1, result)
    }
}


fun main(args: Array<String>) {
    //  求5的阶乘=1*2*3*4*5 120
    println(factorial(5))

    //  求10000的阶乘 层次太深了,不适合用递归;每次递归一次,开一次内存,导致出错
    // 此时用 迭代的形式来优化 使用尾递归
    // Exception in thread "main" java.lang.StackOverflowError
//     println(factorial(10000))

    val result1 = Result();
    factorialTailrec(5, result1)
    println("result1:" + result1.value)

    val result2 = Result();
    factorialTailrec(10000, result2)
    println("result2:" + result2.value)

    val result3 = Result();
    factorialTailrec(1000000, result3)
    println("result3:" + result3.value)
}