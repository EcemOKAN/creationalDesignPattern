package com.ecemokan.creationaldesignpattern.factory

/**
 * Created by Ecem Okan on 12.12.2022
 */
class CarFactory {
    fun createCar(eCar: ECar): IFactory? {
        return when (eCar) {
            ECar.AUDI -> Audi()
            ECar.BMW -> Bmw()
            else -> null
        }
    }
}