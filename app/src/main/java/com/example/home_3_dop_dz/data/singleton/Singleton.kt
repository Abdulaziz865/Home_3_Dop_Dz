package com.example.home_3_dop_dz.data.singleton

import com.example.home_3_dop_dz.data.builder.Builder

class Singleton {

    object MySingleton{
        fun getName(): String {
            val builder =
                Builder().ConfigBuilder().setName("Aziz").build()
            return builder.name
        }

        fun getMiddle(): String {
            val builder =
                Builder().ConfigBuilder().setMiddle("Adanbaev").build()
            return builder.middle
        }
    }
}