package com.vik.tddapproach

import org.junit.After
import org.junit.Test

import org.junit.Assert.*
import org.junit.Before

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class StackExampleTest {

    lateinit var stack: StackExample

    @Before
    fun setUp() {
        stack = StackExample()
    }


    @Test
    fun testPush() {
        stack.push(1) //insertion
        assertEquals(1, stack.items.size)
    }

    @Test
    fun testPop() {
        stack.push(1)
        val result = stack.pop()
        assertEquals( 1, result)
    }

    @Test
    fun testIsEmpty() {
        val result = stack.isEmpty()
        assertEquals(true, result)
    }

    @Test
    fun testPeek() {
        stack.push(5)
        val lastItem = stack.peek()
        assertEquals(5, lastItem)
    }

    //peek and pop are looking same

}