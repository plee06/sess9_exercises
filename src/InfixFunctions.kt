/**
 * Infix functions are a form of Syntax sugar.
 *
 * It allows us to navigate around the someFunction(parameter) call form
 * and instead use val.someFunction(parameter) or val  someFunction val
 *
 * It can be used either on Class member functions or Extension functions
 *
 * It requires at most one parameter and only one parameter. Must have one parameter!
 *
 * */



infix fun Int.isItEqual(n: Int) = if (this == n) true else false


fun main(args: Array<String>) {



}