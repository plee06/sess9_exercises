package tests

import org.testng.annotations.Test
import Base
import SubBase
import org.testng.AssertJUnit.assertEquals
import someFunction


class TestExtensionFunctions {


    @Test
    fun testBaseSubBase() {
        val b: Base = Base()
        val sb: SubBase = SubBase()
        val c: Base = SubBase()

        assertEquals("Called from Base.", b.someFunction())
        assertEquals("Called from SubBase", sb.someFunction())
        assertEquals("Called from Base.", c.someFunction())

    }
}