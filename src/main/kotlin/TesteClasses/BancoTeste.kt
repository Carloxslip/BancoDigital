package TesteClasses

import Banco

fun main(){
    val digionebank = Banco(nome = "Digione", numero = 12 )

    println(digionebank.nome)
    println(digionebank.numero)
}