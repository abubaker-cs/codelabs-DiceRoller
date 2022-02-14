package org.abubaker.diceroller

import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {

    @Test
    fun generates_number(){
        val dice = Dice(6)
        val rollResult = dice.roll()
        assertTrue("The value of rollResult was not between 1 and 6", rollResult in 1..6)
    }

    @Test
    fun addition_isCorrect() {
        assertEquals(5, 2 + 3)
    }

    @Test
    fun subtraction_isCorrect() {
        assertEquals(7, 9 - 2)
    }

}

/**
 * Note: There are many assertions in the JUnit library. Some common assertions you might encounter are:
 * 1. assertEquals()
 * 2. assertNotEquals()
 * 3. assertThat()
 * 4. assertTrue()
 * 5. assertFalse()
 * 6. assertNull()
 * 7. assertNotNull()
 */