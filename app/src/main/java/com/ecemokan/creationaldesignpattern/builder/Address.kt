package com.ecemokan.creationaldesignpattern.builder

/**
 * Created by Ecem Okan on 13.12.2022
 */
data class Address(
    var phone: String,
    var title: String,
    var no: String,
    var city: String
) {
    private constructor(builder: Builder) : this(
        builder.phone,
        builder.title,
        builder.no,
        builder.city
    )

    class Builder {
        lateinit var phone: String
        lateinit var title: String
        lateinit var no: String
        lateinit var city: String

        fun phone(init: Builder.() -> String) = apply { phone = init() }
        fun title(init: Builder.() -> String) = apply { title = init() }
        fun no(init: Builder.() -> String) = apply { no = init() }
        fun city(init: Builder.() -> String) = apply { city = init() }
    }

    companion object {
        fun build(init: Builder.() -> Unit) = Address(Builder().apply(init))
    }
}