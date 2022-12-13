package com.ecemokan.creationaldesignpattern.singleton

/**
 * Created by Ecem Okan on 13.12.2022
 */
object PrenterObject {
    init {
        println("Call init: $this")
    }

    fun printObject() = println("Printing with object: $this")
}