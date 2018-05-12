




/**
 * In Kotlin functions parameters are default val and cannot be reassigned
 * And an assignemnt = instead of a block means functions can infer types!
 *
 *
 * */


// Functions can have default arguments
fun sum1(a: Int, b: Int = 2) = a + b // Default argument for val b, however, everything that follows b must also have default
