package com.ecemokan.creationaldesignpattern.prototype

/**
 * Created by Ecem Okan on 13.12.2022
 */
fun main() {
    val originAddress: AddressPrototype = AddressPrototype().apply {
        phone = "0 (555) 555 55 55"
        title = "New Adress"
        no = "17A"
        city = "NewYork"
        printAdress("Origin Address")
    }

    val copyAdress: AddressPrototype? = originAddress.cloneTo()?.apply {
        phone = "0 (555) 555 55 55"
        title = "Copy New Adress"
        no = "17A"
        city = "Copy NewYork"
        printAdress("Copy Address")
    }
}