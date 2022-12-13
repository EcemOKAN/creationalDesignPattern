package com.ecemokan.creationaldesignpattern.factory

/**
 * Created by Ecem Okan on 12.12.2022
 */
fun main() {
    val factory = CarFactory()

    val audiExample = Car("A4", "Black")
    val audiCar = factory.createCar(ECar.AUDI)

    audiCar?.print(audiExample)

    val bmwExample = Car("118i", "White")
    val bmwCar = factory.createCar(ECar.BMW)

    bmwCar?.print(bmwExample)
}