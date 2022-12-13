package com.ecemokan.creationaldesignpattern.prototype

/**
 * Created by Ecem Okan on 13.12.2022
 */
class AddressPrototype constructor(
    var phone: String = "",
    var title: String = "",
    var no: String = "",
    var city: String = ""
) : Cloneable {

    fun cloneTo(): AddressPrototype? {
        try {
            val copy: AddressPrototype = super.clone() as AddressPrototype
            copy.phone = this.phone
            copy.title = this.title
            copy.no = this.no
            copy.city = this.city
            return copy
        } catch (e: CloneNotSupportedException) {
            e.printStackTrace()
        }
        return null
    }

    fun printAdress(title: String) {
        println("----- $title -----")
        println("City : $city")
        println("No : $no")
        println("Title : $title")
        println("Phone: $phone")
    }
}