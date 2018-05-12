// You can also name functions and thus make reutilizing functions easier
fun firstFun(first: String = "First", second: String = "Second"): String {

    return "$first $second"
}

// Nested function that overrides the previous
fun secondFun(): String {
    // Is this an impure function? It is it doesn't take any parameters!
    // No but it's a higher order function, it returns a function!
    return firstFun(first = "Not First") // Prints out now Not First + Second
}