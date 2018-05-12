


/**
 * Because Kotlin functions are first class citizens they can return functions, take functions and even nest
 * functions!
 *
 *
 * */


fun outerFun() {
    val outerVal = "I'm the outer value."

    fun nestedFun() {
        println(outerVal)
    }

    // And then use the nested function!
    nestedFun()
}

fun main(args: Array<String>) {
    outerFun()
}


