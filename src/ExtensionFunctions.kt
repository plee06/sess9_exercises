/**
 * An extension function is exactly what it sounds like. Allows us the ability to add a function to an existing
 * class!
 *
 *
 * */

// Add our existing method of isBlankString to String, "extension" is marked by the Class.extensionFunctionName
// The "this" keyword is referring to the receiver which is the caller of this function, i.e. here it's String
fun String.isBlankString() = if (this.isEmpty()) true else false

/**
 * IMPORTANT! Extension functions are resolved statically meaning they are tied to the Class level they are
 * originally declared at. This is why same function names don't need overriding, they are static!
 *
 * Base.someFunction()
 * SubBase.someFunction()
 *
 * Objects of Base and SubBase will call on Base and SubBase respectively
 *
 * val sb: Base = SubBase()
 * sb.someFunction() <--- will be called in the context of Base because the Type is declared as Base!
 *
 *
 * */


open class Base

// Extension function
fun Base.someFunction() = "Called from Base."


class SubBase : Base()

// Extension function
fun SubBase.someFunction() = "Called from SubBase"


