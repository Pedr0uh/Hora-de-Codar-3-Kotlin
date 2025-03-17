fun main(){

    var contagem = 0
    var cont = 15.0
    var soma = 0.0

    while(cont <= 100){
        soma += cont
        cont++
        contagem++

    }

    val media = soma / contagem

    println("A media dos números no intervalo entre 15 e 100 é: $media")


}