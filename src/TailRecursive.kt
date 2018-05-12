/**
 * In Kotlin you can have tail recursive calls! Unlike Java. Something about the JVM ... Research later.
 *
 *
 * */


/**
 * Tail recursive Factorial without a helper
 *
 * Factorial of 4! = 4 3 2 1 == 24
 *
 *
 * */
tailrec fun factorialTail(n: Int, acc: Int): Int {

    if (n == 0 || n == 1) return acc

    return factorialTail(n - 1, acc * n)


}



