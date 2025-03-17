fun main() {

    var i = 0
    var soma = 0.0

    println("Insira o primeiro numero: ")
    var n1: Double = readln().toDouble()

    println("Insira o segundo numero: ")
    val n2: Double = readln().toDouble()

    while(n1 <= n2){
        soma += n1
        n1++
        i++
    }

    val media = soma / i

    println("A media de todos os números no intervalo dos números citados é: $media")

}