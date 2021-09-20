package TesteClasses

fun main() {
    ClienteTipo.values().forEach { elemento ->
        println("${elemento.name} + ${elemento.descricao}")
    }

    ClienteTipo.values().forEach {
        println("${it.name} + ${it.descricao}")
    }
}