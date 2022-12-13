package com.ecemokan.creationaldesignpattern.factory

/**
 * Created by Ecem Okan on 12.12.2022
 */
class Bmw : IFactory {
    override fun print(car: Car) {
        println("Bmw $car")
    }
}