package com.gyh.kotlinbasics

class Dog(name: String) {

    init{
        bark(name)
    }

    fun bark(name: Any) {
        println("$name says Woof Woof")
    }
}