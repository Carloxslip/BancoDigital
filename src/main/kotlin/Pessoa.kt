class Pessoa {
    var nome: String = "Antonio"
    var cpf: String = "123.456.321-97"
    private set
/**
    inner class Endereco {

        var rua: String = "Barao de uba"
    }
    **/
    /* classe interna apenas para fins de estudo */
}



fun main() {
    val antonio = Pessoa()
    println(antonio.nome)
    println(antonio.cpf)



}