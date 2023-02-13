package com.example.home_3_dop_dz.data.builder

class Builder(
    val name: String = "",
    val middle: String = ""
) {

    inner class ConfigBuilder {
        private var name: String = ""
        private var middle: String = ""

        fun setName(name: String): ConfigBuilder {
            this.name = name
            return this
        }

        fun setMiddle(middle: String): ConfigBuilder {
            this.middle = middle
            return this
        }

        fun build(): Builder = Builder(
            name = name, middle = middle
        )
    }
}

