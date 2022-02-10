package com.ananayis.affirmaions

import org.junit.Test

import org.junit.Assert.*
import org.junit.runner.manipulation.Ordering

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {

    private val context = mock(Ordering.Context::class.java)
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }


}