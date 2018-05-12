package tests

import isBlankString
import org.testng.AssertJUnit.assertEquals
import org.testng.annotations.Test


class TestIfElseExpression {



    @Test
    fun testIsBlankString() {
        assertEquals(true, isBlankString(""))
    }
}