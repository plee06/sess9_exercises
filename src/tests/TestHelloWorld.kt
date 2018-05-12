package tests

import helloWorld
import org.testng.AssertJUnit.assertEquals
import org.testng.annotations.Test


class TestHelloWorld {




    @Test
    fun testHelloWorld() {
        assertEquals("Hello World!", helloWorld())
    }
}