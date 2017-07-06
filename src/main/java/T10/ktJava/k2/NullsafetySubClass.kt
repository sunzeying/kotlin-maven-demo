package ktJava

import T10.ktJava.k2.NullSafetyAbsClass
import java.util.*

/**
 * Created by apple on 17/4/21.
 */
class NullsafetySubClass : NullSafetyAbsClass() {
    // Date?可为null
//    override fun formatDate(date: Date?): String {
    override fun formatDate(date: Date): String {
//        throw UnsupportedOperationException("not implemented") //To change body of created functions use File | Settings | File Templates.
        return date.toString()
    }

}


fun main(args: Array<String>) {
    val nullsafetySubClass = NullsafetySubClass()
    println(nullsafetySubClass.formatDate(Date()))
    println(nullsafetySubClass.formatTime(Date()))
}