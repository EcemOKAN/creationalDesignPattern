package com.ecemokan.creationaldesignpattern.factory

/**
 * Created by Ecem Okan on 12.12.2022
 */
class Audi : IFactory {
    override fun print(car: Car) {
        println("Audi $car")
    }
}