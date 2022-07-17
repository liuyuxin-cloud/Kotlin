class Chapter2_test {

}
val a : String = "I am Kotlin"

val int = 123

fun sum(x:Int, y:Int): Int {
    return x + y
}

fun sum1(x: Int, y: Int) = x + y

fun foo(n: Int) : Int = if(n == 0) 1 else n * foo(n - 1)

fun foo1(x: Int) {
    fun double(y: Int): Int {
        return y * 2
    }
    println(double(x))
}
fun curryingLike(content: String, block: (String) -> Unit) {
    block(content)
}
/**
curryingLike("123") {
    content -> println(content)
}

 curryingLike("123", {
    content -> println(content)
 })
        */

fun <A, B> Array<A>.corresponds(that: Array<B>, p: (A, B) -> Boolean) : Boolean {
    val i = this.iterator();
    val j = that.iterator();
    while(i.hasNext() && j.hasNext()) {
        if(!p(i.next(), j.next())) {
            return false
        }
    }
    return !i.hasNext() && !j.hasNext()
}

/**
 *
 * fun schedule(sunny: Boolean, day:Day) = when(day) {
 *  Day.SAT -> basketball()
 *  Day.SUN -> fishing()
 *  Day.FRI -> appointment()
 *  else -> when {
 *      sunny -> library()
 *      else -> study()
 *  }
 *}
 */
