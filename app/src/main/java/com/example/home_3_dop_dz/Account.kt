package com.example.home_3_dop_dz

open class Account {

    fun info(): String {
        return JustSingleton.name + "\n" + JustSingleton.middle
    }

    fun info2(): String {
        return JustSingleton.id + "\n" + JustSingleton.numberTelephone
    }

    companion object Builder {
        fun name(value: String) = apply { JustSingleton.name = value }
        fun middle(value: String) = apply { JustSingleton.middle = value }
        fun getID(value: String) = apply { JustSingleton.id = value }
        fun numberPhone(value: String) = apply { JustSingleton.numberTelephone = value }

        fun build(): Account {
            return Account()
        }
    }
}