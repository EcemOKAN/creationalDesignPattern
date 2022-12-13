package com.ecemokan.creationaldesignpattern.factory

/**
 * Created by Ecem Okan on 12.12.2022
 */
data class Car(val brand: String, val modal: String) {
    override fun toString(): String {
        return "Output: brand='$brand', modal='$modal'"
    }
}