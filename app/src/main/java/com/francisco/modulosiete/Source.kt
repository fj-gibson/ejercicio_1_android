package com.francisco.modulosiete

class Source {
    //Este companion object es como tener static en PHP
    companion object{
        val dataList =  listOf<Data>(
            Data(name = "Dato 1", description = "Pasaje 1"),
            Data(name = "Dato 2", description = "Pasaje 2"),
            Data(name = "Dato 3", description = "Pasaje 3"),
            Data(name = "Dato 4", description = "Pasaje 4"),
            Data(name = "Dato 5", description = "Pasaje 5"),
            Data(name = "Dato 6", description = "Pasaje 6"),
            Data(name = "Dato 7", description = "Pasaje 7"),
            Data(name = "Dato 8", description = "Pasaje 8")
        )
    }
}