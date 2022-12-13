package com.ecemokan.creationaldesignpattern.builder

/**
 * Created by Ecem Okan on 13.12.2022
 */
fun main() {
    val address = Address.build {
        phone = "0 (555) 555 55 55"
        title = "New Address"
        no = "17A"
        city = "NewYork"
    }

    println(address)
}