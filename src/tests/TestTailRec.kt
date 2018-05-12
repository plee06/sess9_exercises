package tests

import factorialTail
import org.testng.AssertJUnit.assertEquals
import org.testng.annotations.Test


class TestTailRec {




    @Test
    fun testFactorialTail() {
        assertEquals(3628800, factorialTail(10, 1))
    }
}