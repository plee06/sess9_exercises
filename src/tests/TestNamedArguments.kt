package tests

import firstFun
import org.testng.AssertJUnit.assertEquals
import org.testng.annotations.Test
import secondFun


class TestNamedArguments {



    @Test
    fun testFirst() {
        assertEquals("First Second", firstFun())
    }

    @Test
    fun testSecond() {
        assertEquals("Not First Second", secondFun())
    }
}