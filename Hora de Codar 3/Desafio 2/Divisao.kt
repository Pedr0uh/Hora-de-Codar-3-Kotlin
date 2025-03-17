fun main(){

    println("Insira o primeiro número: "); var n1 = readln().toDouble()
    println("Insira o segundo número: "); var n2 = readln().toDouble()

    while(n2 <= 0){
        println("\nO segundo número tem que ser maior que 0, tente novamente: \n"); n2 = readln().toDouble()
    }

   var div = n1 / n2

   println("-- A divisão dos números é: $div --")
}