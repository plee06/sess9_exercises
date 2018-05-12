package tests

import isItEqual
import org.testng.AssertJUnit.assertEquals
import org.testng.annotations.Test


class TestInfixFunctions {



    @Test
    fun testInfixFunctions() {
        assertEquals(true, 9 isItEqual 9)
    }
}