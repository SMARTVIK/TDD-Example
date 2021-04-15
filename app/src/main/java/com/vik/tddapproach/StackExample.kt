package com.vik.tddapproach

class StackExample {

    var top : Int = -1

    var items : ArrayList<Int> = ArrayList()

    fun push(item: Int) {
         items.add(item)
        top++
    }

    fun pop(): Int? {
        if (isEmpty()) {
            return null
        }
        val lastItem = items[top]
        top -= 1
        return lastItem
    }

    fun isEmpty(): Boolean {
        return top == -1
    }

    fun peek(): Int? {
        if (isEmpty()) {
            return null
        }
        return items[top]
    }
}