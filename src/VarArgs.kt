/**
 * Kotlin functions can have variable arguments. See the example below
 *
 * <varargs> in Kotlin is simply a way to quickly declare that the parameter is going to take in a list of items
 * In the below the vararg items: String is turned into an Array<String>
 *
 * */

fun showStrings(suffix: String, vararg items: String): Unit {



    for (item in items) {
        println("here is an item: $item")
    }

    println(suffix)
}


fun main(args: Array<String>) {

    showStrings("Hello", "Banana", "Orange", "Apple", "Pear")


}